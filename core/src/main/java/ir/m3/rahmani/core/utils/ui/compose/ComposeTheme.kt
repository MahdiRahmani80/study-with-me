package ir.m3.rahmani.core.utils.ui.compose

import androidx.compose.material.lightColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(

    primary = Color(0xFF006769),
    secondary = Color(0xFF9DDE8B),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFF006769),
    onSurface = Color.Black,
)

@Composable
fun PomodoroTheme(content: @Composable () -> Unit) {
    MaterialTheme (
        colorScheme = LightColors,
        content = content
    )
}