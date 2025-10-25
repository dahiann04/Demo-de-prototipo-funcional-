package com.example.dely.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dely.ui.buttons.InputText
import com.example.dely.ui.buttons.PrimaryButton
import com.example.dely.ui.theme.DelyTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dely.ui.viewmodel.RegisterViewModel

@Composable
fun RegistroScreen(viewModel: RegisterViewModel, navController: NavController){
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
        val viewModel: RegisterViewModel = viewModel()
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
            text = "Fecha de nacimiento",
        )
        InputText(
            value = viewModel.telefono.value,
            onValueChange = { viewModel.telefono.value = it },
            text = "Teléfono",
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
        val viewModel = RegisterViewModel()

        RegistroScreen(
            viewModel = viewModel,
            navController = navController
        )
    }
}