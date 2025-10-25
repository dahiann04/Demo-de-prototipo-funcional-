package com.example.dely.ui.viewmodel

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
        var username = mutableStateOf("")
        var email = mutableStateOf("")
        var password = mutableStateOf("")
        var fechaNacimiento = mutableStateOf("")
        var telefono = mutableStateOf("")

        fun register(onSuccess: () -> Unit) {
                if (username.value.isNotEmpty() && email.value.isNotEmpty() && password.value.isNotEmpty() && fechaNacimiento.value.isNotEmpty() && telefono.value.isNotEmpty()) {
                        onSuccess()
                }
        }
}