package com.example.dely.ui.theme

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dely.ui.screens.MenuScreen
import com.example.dely.ui.screens.PassPerdidaScreen
import com.example.dely.ui.screens.RegistroScreen
import com.example.dely.ui.viewmodel.LoginViewModel
import com.example.dely.ui.viewmodel.MenuViewModel
import com.example.dely.ui.viewmodel.RegistroViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            val viewModel: LoginViewModel = viewModel()
            LoginScreen(viewModel = viewModel, navController = navController)
        }
        composable("forgot_password") { PassPerdidaScreen(navController) }
        composable("register") {
            val viewModel: RegistroViewModel = viewModel()
            RegistroScreen(viewModel = viewModel, navController = navController)
        }
        composable("menu") {
            val viewModel: MenuViewModel = viewModel()
            MenuScreen(viewModel = viewModel, navController = navController)
        }
    }
}


