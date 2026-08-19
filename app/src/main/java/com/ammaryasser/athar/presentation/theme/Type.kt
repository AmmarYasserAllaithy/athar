package com.ammaryasser.athar.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)


@Composable
fun Typography.applyDefaultFont(fontFamily: FontFamily) = copy(
    displayLarge = displayLarge.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    displayMedium = displayMedium.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    displaySmall = displaySmall.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    headlineLarge = headlineLarge.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    headlineMedium = headlineMedium.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    headlineSmall = headlineSmall.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    titleLarge = titleLarge.copy(
        fontFamily = fontFamily,
        fontSize = 22.sp,
        textDirection = TextDirection.Content,
    ),
    titleMedium = titleMedium.copy(
        fontFamily = fontFamily,
        fontSize = 20.sp,
        textDirection = TextDirection.Content,
    ),
    titleSmall = titleSmall.copy(
        fontFamily = fontFamily,
        fontSize = 18.sp,
        textDirection = TextDirection.Content,
    ),
    bodyLarge = bodyLarge.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    bodyMedium = bodyMedium.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    bodySmall = bodySmall.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    labelLarge = labelLarge.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    labelMedium = labelMedium.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
    labelSmall = labelSmall.copy(
        fontFamily = fontFamily,
        textDirection = TextDirection.Content,
    ),
)