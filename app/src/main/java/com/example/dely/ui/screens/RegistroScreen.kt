package com.example.dely.ui.screens

import LoginScreen
import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dely.ui.buttons.InputText
import com.example.dely.ui.theme.DelyTheme
import com.example.dely.ui.viewmodel.LoginViewModel
import com.example.dely.ui.viewmodel.MenuViewModel
import com.example.dely.ui.viewmodel.RegistroViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dely.ui.buttons.PrimaryButton

@Composable
fun RegistroScreen(viewModel: RegistroViewModel, navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.padding(25.dp)
    ) {

            Text(
                text = "Registro",
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                fontFamily = FontFamily.Cursive,
            )
        val viewModel: RegistroViewModel = viewModel()
        InputText(
            value = viewModel.username.value,
            onValueChange = { viewModel.username.value = it },
            text = "Usuario",
        )
        InputText(
            value = viewModel.email.value,
            onValueChange = { viewModel.email.value = it },
            text = "Correo",
        )
        InputText(
            value = viewModel.password.value,
            onValueChange = { viewModel.password.value = it },
            text = "Contraseña",
        )
        InputText(
            value = viewModel.fechaNacimiento.value,
            onValueChange = { viewModel.fechaNacimiento.value = it },
            text = "Fecha de Nacimiento",
        )
        InputText(
            value = viewModel.telefono.value,
            onValueChange = { viewModel.telefono.value = it },
            text = "Telfono",
        )
        PrimaryButton("Aceptar",) {
            viewModel.register {
                navController.navigate("login") {
                    popUpTo("register") { inclusive = true }
                }
            }
        }

    }
    }


@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun PreviewRegistro() {
    DelyTheme {
        val navController = rememberNavController()
        val viewModel = RegistroViewModel()

        RegistroScreen(
            viewModel = viewModel,
            navController = navController
        )
    }
}