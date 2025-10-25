package com.example.dely.ui.screens

import LoginScreen
import android.annotation.SuppressLint
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dely.ui.theme.DelyTheme
import com.example.dely.ui.viewmodel.LoginViewModel
import com.example.dely.ui.viewmodel.MenuViewModel
import com.example.dely.ui.viewmodel.RegistroViewModel


@Composable
fun RegistroScreen(navController: NavController) {
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

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun PreviewRegistro() {
    DelyTheme {
        val navController = rememberNavController()

        RegistroScreen(
            navController = navController
        )
    }
}