package com.example.pokedexv2.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class BorderRadius(
    val extraSmall : Dp = 2.dp,
    val small : Dp = 4.dp,
    val medium : Dp = 8.dp,
    val large : Dp = 16.dp,
    val extraLarge : Dp = 32.dp,
    val extraExtraLarge : Dp = 48.dp
)

val LocalBorderRadius = compositionLocalOf { BorderRadius() }

/** Provides generic border radius
 * default : Dp = 2.dp,
 * extraSmall - 2.dp,
 * small - 4.dp,
 * medium :Dp = 8.dp,
 * large : Dp = 16.dp,
 * extraLarge :Dp = 32.dp,
 * extraExtraLarge :Dp = 48.dp
 * **/
val MaterialTheme.borderRadius :BorderRadius
    @Composable
    @ReadOnlyComposable
    get() = LocalBorderRadius.current
