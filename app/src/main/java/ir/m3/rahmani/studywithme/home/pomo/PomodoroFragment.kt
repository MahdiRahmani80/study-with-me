package ir.m3.rahmani.studywithme.home.pomo

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroClock
import ir.m3.rahmani.core.utils.ui.compose.PomodoroTheme
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.FragmentPomodoroBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.home.pomo.PomodoroUiHelper.iconHandler
import ir.m3.rahmani.studywithme.home.pomo.PomodoroUiHelper.showSanckbarWhenDone
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PomodoroFragment @Inject constructor() : Fragment() {

    @Inject
    lateinit var pomodoroViewModel: PomodoroViewModel

    private var _binding: FragmentPomodoroBinding? = null
    private val binding: FragmentPomodoroBinding
        get() = _binding!!
    private lateinit var context: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.context = context
        Injector.inject(requireActivity().application, this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPomodoroBinding.inflate(inflater, container, false)
        val view = binding.root
        setPomodoroClockCompose()
        return view
    }

    private fun setPomodoroClockCompose() {
        binding.includeComposePomodoro.pomodoroClock.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            val application = requireActivity()
            pomodoroViewModel.timeBySec.observe(application) { sec ->
                setContent {
                    PomodoroTheme {
                        PomodoroClock(
                            timeBySec = sec,
                            timerText = pomodoroViewModel.setTimerText(sec),
                            PomodoroConstants.POMODORO_STUDY_TIME_BY_MINUTES
                        )
                    }
                }
            }
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = requireActivity()


        pomodoroViewModel.state.observe(activity) { state ->
            listener(state)
            iconHandler(state, binding, context)

            pomodoroViewModel.userState.observe(activity) {
                if (it != 0 && state == TimerState.NOT_STARTED) showSanckbarWhenDone(context, binding)
            }
        }

        pomodoroViewModel.notifyUserInfo.observe(activity) { info ->
            binding.status.text =
                getString(
                    R.string.your_company_status,
                    info.leftToLongBreak.toString(),
                    info.pomodoroCount.toString(), // todo update this when new challenge started to 0
                    info.championCount.toString() // todo get this from api server
                )
        }

    }

    private fun listener(state: TimerState) {
        binding.imgPlay.setOnClickListener { view ->
            playButtonCondition(state)
        }

        binding.imgNext.setOnClickListener {
            val state = TimerState.NOT_STARTED
            pomodoroViewModel.nextPomodoro(state)
        }
        binding.imgStop.setOnClickListener {
            val state = TimerState.NOT_STARTED
            pomodoroViewModel.stopTimer(state)
        }
    }


    private fun playButtonCondition(state: TimerState) {
        when (state) {
            TimerState.IN_PROGRESS -> {
                val state = TimerState.PAUSE
                pomodoroViewModel.pauseTimer(state)
            }

            TimerState.DONE -> {
                val state = TimerState.IN_PROGRESS
                pomodoroViewModel.startTimer(state)
            }

            else -> {
                val state = TimerState.IN_PROGRESS
                pomodoroViewModel.startTimer(state)
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}