package com.example.dely.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.dely.ui.cards.ProductosList
import com.example.dely.ui.viewmodel.MenuViewModel


@Composable
fun MenuScreen(viewModel: MenuViewModel, navController: NavController){
    Column{
        Text("Platillos Registrados")
        val productos by viewModel.productos.collectAsStateWithLifecycle()
        ProductosList(productos){}
        }
}

