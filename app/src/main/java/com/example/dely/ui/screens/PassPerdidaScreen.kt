package com.example.dely.ui.screens

import LoginScreen
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dely.R
import com.example.dely.ui.buttons.InputText
import com.example.dely.ui.buttons.PrimaryButton
import com.example.dely.ui.theme.DelyTheme
import com.example.dely.ui.viewmodel.LoginViewModel
import com.example.dely.ui.viewmodel.MenuViewModel
import com.example.dely.ui.viewmodel.PassPerdidaViewModel


@Composable
fun PassPerdidaScreen(viewModel: PassPerdidaViewModel, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Contraseña perdida",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 42.sp,
            modifier = Modifier
        )
        Spacer(Modifier.padding(12.dp))
        InputText(
            value = viewModel.correo.value,
            onValueChange = { viewModel.correo.value = it },
            text = "Ingresa tu correo"
        )
        InputText(
            value = viewModel.passnew.value,
            onValueChange = { viewModel.passnew.value = it },
            text = "Ingresa la nueva contraseña"
        )
        InputText(
            value = viewModel.passnew.value,
            onValueChange = { viewModel.passnew.value = it },
            text = "Confirmar la nueva contraseña"
        )
        Image(
            painterResource(R.drawable.iconodely),
            contentDescription = "Dely",
            modifier = Modifier
                .padding(0.dp)
                .width(420.dp)
                .height(320.dp))
        PrimaryButton("Aceptar") {
            viewModel.pass {
                navController.navigate("passperdida") {
                    popUpTo("login") { inclusive = true }
                }
            }
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun PreviewContraPerdidaScreen() {
    DelyTheme {
        val navController = rememberNavController()
        val viewModel = PassPerdidaViewModel()

        PassPerdidaScreen(
            viewModel = viewModel,
            navController = navController
        )
    }
}
