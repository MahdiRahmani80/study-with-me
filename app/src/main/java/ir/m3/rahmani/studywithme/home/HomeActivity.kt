package ir.m3.rahmani.studywithme.home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.ActivityHomeBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.home.challenge.ChallengeFragment
import ir.m3.rahmani.studywithme.home.pomo.PomodoroFragment
import ir.m3.rahmani.studywithme.home.profile.ProfileFragment
import ir.m3.rahmani.studywithme.home.stats.StatsFragment
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var homeViewModel: HomeViewModel

    // inject fragments
    @Inject
    lateinit var pomodoroFragment: PomodoroFragment

    @Inject
    lateinit var challengeFragment: ChallengeFragment

    @Inject
    lateinit var statsFragment: StatsFragment

    @Inject
    lateinit var profileFragment: ProfileFragment

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setUserData()
        setHomeFragments()
        getChallengeStatus()

        homeViewModel.lastestChallengeState.observe(this) { challenge ->
            if (challenge != null) {
                if (challenge.status?.toInt() == 1) {

                    YouLoseDialog().show(supportFragmentManager,YouLoseDialog.TAG)
//                    showSanckbar(getString(R.string.you_are_lost))
                }

            }
        }

    }

    // todo make it a better performance
    // todo fix bug: show last version of data and new version of data both in the same time
    private fun getChallengeStatus() {
        binding.getChallenge.setOnClickListener {
            homeViewModel.homeData.removeObservers(this)
            homeViewModel.getPlayData()
            homeViewModel.homeData.observe(this) {
                if (it.user?.challengeMode == false) {
                    showSanckbar(getString(R.string.no_active_challenge))
                } else if (it.plays.size != 0 && it.user?.challengeMode == true) {
                    showSanckbar(getString(R.string.please_wait))
                    val sheet = ChallengeStatusBottomSheet(it.plays, homeViewModel)
                    sheet.show(supportFragmentManager, ChallengeStatusBottomSheet.TAG)
                    sheet.onDestroyView()
                    sheet.onDestroy()

                }
            }

        }
    }

    private fun setUserData() {
        homeViewModel.homeData.observe(this) { data ->
            binding.username.text = data.user?.username ?: ""
            binding.coin.text = (data.user?.coin).toString()
        }
    }

    private fun setHomeFragments() {
        binding.homeBnv.setOnItemSelectedListener(navListener)

        supportFragmentManager.beginTransaction().replace(
            binding.homeFrameLayout.id, pomodoroFragment
        ).commit()
    }

    private val navListener = NavigationBarView.OnItemSelectedListener { item ->
        var selectedFragment: Fragment? = when (item.itemId) {
            binding.homeBnv.menu.getItem(0).itemId -> pomodoroFragment
            binding.homeBnv.menu.getItem(1).itemId -> challengeFragment
            binding.homeBnv.menu.getItem(2).itemId -> statsFragment
            binding.homeBnv.menu.getItem(3).itemId -> profileFragment
            else -> null
        }
        if (selectedFragment != null) {
            supportFragmentManager.beginTransaction().replace(
                binding.homeFrameLayout.id, selectedFragment
            ).commit()
            true
        } else {
            false
        }
    }

    private fun showSanckbar(text: String) {
        val snackbar = Snackbar.make(this, binding.root, text, Snackbar.LENGTH_LONG)
        snackbar.view.layoutDirection = View.LAYOUT_DIRECTION_RTL
        snackbar.show()
    }
}