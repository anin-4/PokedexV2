package com.example.pokedexv2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pokedexv2.R


val Poppins = FontFamily(
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_extrabold, FontWeight.ExtraBold)
 )

val Typography = Typography(
    headlineLarge = TextStyle(
            fontSize = 32.sp,
            fontFamily = Poppins,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF000000)
    ),
    titleLarge = TextStyle(
        fontSize = 21.sp,
        fontFamily = Poppins,
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
    ),
    titleMedium = TextStyle(
        fontSize = 14.sp,
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF333333),
    ),
    bodySmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontSize = 11.sp,
        fontFamily = Poppins,
        fontWeight = FontWeight(500),
        color = Color(0xFF000000)
    )
)