package com.example.dely.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class RegistroViewModel : ViewModel() {
        var username = mutableStateOf("")
        var email = mutableStateOf("")
        var password = mutableStateOf("")
        var fechaNacimiento = mutableStateOf("")
        var telefono = mutableStateOf("")

        fun register(onSuccess: () -> Unit){

        }

}