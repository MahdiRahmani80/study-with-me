package ir.m3.rahmani.studywithme.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import ir.m3.rahmani.studywithme.PomodoroTimerService
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
    @Inject lateinit var pomodoroFragment: PomodoroFragment
    @Inject lateinit var challengeFragment: ChallengeFragment
    @Inject lateinit var statsFragment: StatsFragment
    @Inject lateinit var profileFragment: ProfileFragment

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setUserData()
        setHomeFragments()

    }

    private fun setUserData() {
        homeViewModel.userData.observe(this) { user ->
            binding.username.text = user?.username ?: ""
            binding.coin.text = (user?.coin).toString()
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
}