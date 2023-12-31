package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.fiap.jetpack.model.Pratos

@Composable
fun SurfaceComida(modifier: Modifier, pratos: List<Pratos>) {
    Surface(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth(0.85f)
            .fillMaxHeight(0.8f),
        color = Color.White,
        shape = RoundedCornerShape(18.dp),
        shadowElevation = 4.dp,
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxHeight()
                //.height(250.dp)
        ) {
            items(pratos) { prato ->
                Comida(
                    carbs = prato.carbs,
                    gordura = prato.gordura,
                    porcao = prato.porcao,
                    proteina = prato.proteina,
                    fibra = prato.fibra,
                    name = prato.name
                )

            }
        }
    }

}