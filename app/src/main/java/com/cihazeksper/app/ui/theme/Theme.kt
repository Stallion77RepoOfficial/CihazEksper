package com.cihazeksper.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val NavyBg = Color(0xFF0F172A)
val CardBg = Color(0xFF1E293B)
val AccentBlue = Color(0xFF38BDF8)
val AccentGreen = Color(0xFF22C55E)
val TextPrimary = Color(0xFFF8FAFC)
val TextMuted = Color(0xFF94A3B8)

private val CihazEksperColors = darkColorScheme(
    primary = AccentBlue,
    secondary = AccentGreen,
    background = NavyBg,
    surface = CardBg,
    onBackground = TextPrimary,
    onSurface = TextPrimary
)

@Composable
fun CihazEksperTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = CihazEksperColors,
        content = content
    )
}
