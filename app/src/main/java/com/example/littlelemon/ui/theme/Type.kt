package com.example.littlelemon.ui.theme

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

val  karla = FontFamily(Font(R.font.karla_regular))
val markazi = FontFamily(Font(R.font.markazi_text_regular))

// Set of Material typography styles to start with
val LittleLemonTypography = Typography(
    headlineMedium = TextStyle(
        fontFamily = markazi,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        color = Color.DarkGray
    ),
    headlineSmall = TextStyle(
        fontFamily = markazi,
        color = Color.DarkGray,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    ),
    bodyMedium = TextStyle(
        fontFamily = karla,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = PrimaryYellow
    ),
    bodySmall = TextStyle(
        fontFamily = markazi,
        fontWeight = FontWeight.Bold,
        color = PrimaryGreen
    ),
    labelLarge = TextStyle(
        fontFamily = karla,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Color.DarkGray
    )
)
