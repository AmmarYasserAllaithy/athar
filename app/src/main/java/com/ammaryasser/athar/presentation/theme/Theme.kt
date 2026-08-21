package com.ammaryasser.athar.presentation.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.ammaryasser.athar.R


val LightColorScheme = lightColorScheme(
    primary = LightColors.ForestGreen,
    onPrimary = LightColors.White,
    primaryContainer = LightColors.PaleSage,
    onPrimaryContainer = LightColors.DeepForest,

    secondary = LightColors.WarmGold,
    onSecondary = LightColors.DeepBrown,
    secondaryContainer = LightColors.SoftGold,
    onSecondaryContainer = LightColors.WarmBrown,

    background = LightColors.WarmIvory,
    onBackground = LightColors.CharcoalText,

    surface = LightColors.PaperWhite,
    onSurface = LightColors.CharcoalText,
    surfaceVariant = LightColors.SoftWarmGray,
    onSurfaceVariant = LightColors.MutedSageGray,

    outline = LightColors.WarmBorder,
    outlineVariant = LightColors.SubtleBorder,

    error = LightColors.MutedTerracotta,
    onError = LightColors.White,
)


val DarkColorScheme = darkColorScheme(
    primary = DarkColors.SageGreen,
    onPrimary = DarkColors.DeepMoss,
    primaryContainer = DarkColors.DeepSage,
    onPrimaryContainer = DarkColors.PaleSage,

    secondary = DarkColors.WarmGold,
    onSecondary = DarkColors.DeepBrown,
    secondaryContainer = DarkColors.DarkGold,
    onSecondaryContainer = DarkColors.SoftGold,

    background = DarkColors.Charcoal,
    onBackground = DarkColors.WarmWhite,

    surface = DarkColors.SoftCharcoal,
    onSurface = DarkColors.WarmWhite,
    surfaceVariant = DarkColors.SlateCharcoal,
    onSurfaceVariant = DarkColors.WarmGray,

    outline = DarkColors.CharcoalBorder,
    outlineVariant = DarkColors.SubtleBorder,

    error = DarkColors.MutedTerracotta,
    onError = DarkColors.DeepRed,
)


@Composable
fun AtharTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography.applyDefaultFont(FontFamily(Font(R.font.estedad_variable_font_weight))),
        content = content,
    )
}