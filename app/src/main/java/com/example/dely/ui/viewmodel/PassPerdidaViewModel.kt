package com.example.dely.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class PassPerdidaViewModel: ViewModel(){
    var correo = mutableStateOf("")
    var passnew = mutableStateOf("")
    fun pass(onSuccess: () -> Unit){
        onSuccess()

    }

}