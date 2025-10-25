package com.example.dely.ui.cards

import com.example.dely.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dely.ui.theme.DelyTheme

@Composable
fun ProductosCard(usr: Productos, x: (Productos) -> Unit){
    Column {
        Card (modifier = Modifier.clickable{x(usr)}) {
            Row (verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(usr.imagen),
                    contentDescription = "Imagen de usuario"
                )
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text=usr.platillo)
                    Text(text=usr.precio)
                    Text(text=usr.descripcion)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUserCard(){
    val u1 = Productos(
        1,
        "Pizza",
        "Pizza italiana deliciosa",
        "$ 260",
        R.drawable.icono
        )
    DelyTheme {
        ProductosCard(u1) { }
    }

}