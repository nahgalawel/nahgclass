package com.nahgalawel.mas.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = IndigoPrimary,
    secondary = IndigoDark,
    tertiary = IndigoLight,
    background = BackgroundLight,
    surface = SurfaceLight,
    onPrimary = SurfaceLight,
    onSecondary = SurfaceLight,
    onBackground = TextPrimary,
    onSurface = TextPrimary
)

@Composable
fun NahgAlAwelTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}
