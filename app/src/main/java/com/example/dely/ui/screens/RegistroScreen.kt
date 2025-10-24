package com.example.dely.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dely.ui.viewmodel.MenuViewModel


@Composable
fun RegistroScreen(viewModel: MenuViewModel, navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.padding(30.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Registro"
            )
        }
    }
}