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
    Font(R.font.poppins_light),
    Font(R.font.poppins_regular),
    Font(R.font.poppins_medium),
    Font(R.font.poppins_bold),
    Font(R.font.poppins_extrabold)
 )

val Typography = Typography(
    titleLarge = TextStyle(
        fontSize = 21.sp,
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
    ),
    titleMedium = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight(600),
        color = Color(0xFF333333),
    ),
    bodySmall = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontSize = 11.sp,
        fontFamily = FontFamily(Font(R.font.poppins_medium)),
        fontWeight = FontWeight(500),
        color = Color(0xFF000000),

        )
)