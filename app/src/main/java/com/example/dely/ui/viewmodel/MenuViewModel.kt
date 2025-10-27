package com.example.dely.ui.viewmodel


import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.dely.R
import com.example.dely.ui.cards.Productos
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MenuViewModel: ViewModel() {
    val _productos = MutableStateFlow<List<Productos>>(emptyList())
    val productos: StateFlow<List<Productos>> = _productos

    init {
        _productos.value = listOf(
            Productos(
                1,
                "Pizza",
                "Pizza Italiana",
                "250",
                R.drawable.icono
            ),
            Productos(
                2,
                "Hamburguesa",
                "Sencilla con Papas",
                "130",
                R.drawable.icono
            ),
            Productos(
                3,
                "Helado",
                "Sabor Vainilla",
                "15",
                R.drawable.icono
            ),
            Productos(
                4,
                "Lasaña",
                "Lasaña de carne",
                "180",
                R.drawable.icono
            ),
            Productos(
                5,
                "Hot Dog",
                "Sencillo",
                "40",
                R.drawable.icono
            ),
            Productos(
                6,
                "Refresco",
                "Sabor Coca Cola",
                "25",
                R.drawable.icono
            ),
            )
        }
}
