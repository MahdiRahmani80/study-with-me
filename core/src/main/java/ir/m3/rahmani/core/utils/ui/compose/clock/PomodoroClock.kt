package ir.m3.rahmani.core.utils.ui.compose.clock

import android.app.Application
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.asIntState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import java.util.Timer


@Composable
fun PomodoroClock(
    timeBySec: Int,
    timerText: String,
    countdownMinutes: Int
) {

    val primaryColor = Color(0xFF006769)

    Canvas(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(40.dp)
    ) {

        val strokePomo = Stroke(width = 28.dp.toPx())
        val strokePomo2 = Stroke(width = 20.dp.toPx())

        drawArc(
            color = Color.LightGray,
            startAngle = 130f,
            sweepAngle = PomodoroConstants.MAX_SWEEP,
            useCenter = false,
            style = strokePomo
        )

        drawArc(
            color = primaryColor,
            startAngle = 130f,
            sweepAngle = calculateProgressBySecond(
                timeBySec,
                PomodoroConstants.MAX_SWEEP,
                minutes = countdownMinutes
            ),
            useCenter = false,
            style = strokePomo2,
        )


        val canvasCenterX = size.width / 2
        val canvasCenterY = size.height / 2

        val paint = Paint().asFrameworkPaint().apply {
            isAntiAlias = true
            textSize = 36.sp.toPx()
            typeface = android.graphics.Typeface.DEFAULT_BOLD
            color = android.graphics.Color.BLACK
            textAlign = android.graphics.Paint.Align.CENTER
        }

        drawContext.canvas.nativeCanvas.apply {
            drawText(
                timerText,
                canvasCenterX,
                canvasCenterY + (paint.descent() - paint.ascent()) / 4,
                paint,
            )
        }
    }

}

private fun calculateProgressBySecond(
    stateBySec: Int, value: Float, minutes: Int = 25
): Float {

    val sec = minutes * 60
    val p = (stateBySec.toFloat() / sec.toFloat() * 100).toInt()
    return percentProgressPomodoro(p, value)
}

private fun percentProgressPomodoro(percent: Int, value: Float): Float {
    return ((percent * value) / 100).toFloat()
}
