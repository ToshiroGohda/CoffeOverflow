package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IngredientesColumn(comida: List<String> ) {



    LazyColumn(
        modifier = Modifier
            .height(100.dp)
    ){

        items(comida) { comida ->
            BotaoComida(nome = comida)
        }

    }

    
}


@Preview(showSystemUi = true)
@Composable
fun IngredientesColumnPreview() {

    var comida = listOf("")

    IngredientesColumn(comida = comida)
}