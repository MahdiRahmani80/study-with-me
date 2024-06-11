package ir.m3.rahmani.core.utils.ui.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
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

private val DarkColors  = darkColorScheme(
    primary = Color.White,
    secondary = Color.Black,
    background = Color(0xFF0F0F0F),
    onPrimary = Color(0xFF0F0F0F),
    onSecondary = Color(0xFF232D3F),
    onBackground = Color.White,
)

@Composable
fun PomodoroTheme(content: @Composable () -> Unit) {
    val colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors
    MaterialTheme (
        colorScheme = colorScheme,
        content = content
    )
}