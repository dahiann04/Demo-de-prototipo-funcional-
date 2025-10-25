package com.example.dely.ui.cards

import androidx.annotation.DrawableRes

data class Productos(
    val id: Int,
    val platillo: String,
    val descripcion: String,
    val precio: String,
    @DrawableRes val imagen: Int
)