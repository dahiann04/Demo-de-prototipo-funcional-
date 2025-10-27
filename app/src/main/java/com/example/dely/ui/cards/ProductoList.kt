package com.example.dely.ui.cards


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.Person
import com.example.dely.ui.cards.Productos
import com.example.dely.ui.cards.ProductosCard
import com.example.dely.R
import com.example.dely.ui.theme.DelyTheme

@Composable
fun ProductosList(lista: List<Productos>, x: (Productos) -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items = lista, key = {it.id} ) {producto ->
            ProductosCard(producto) { x(producto) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProductosList(){
    val lista = listOf(
        Productos(
            1,
            "Pizza",
            "Pizza Italiana",
            "$250",
            R.drawable.pizza
        ),
        Productos(
            2,
            "Papas",
            "Papas ala Francesa",
            "60",
            R.drawable.papasfrancesas
        ),
    )
    DelyTheme {
        ProductosList(lista){}}
}