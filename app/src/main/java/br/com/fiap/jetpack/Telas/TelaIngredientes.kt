package br.com.fiap.jetpack.Telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.jetpack.View.TelaIngredientesViewModel
import br.com.fiap.jetpack.components.BotaoCriar
import br.com.fiap.jetpack.components.BotaoIngrediente
import br.com.fiap.jetpack.components.BotaoVoltar
import br.com.fiap.jetpack.components.BuscarIngredientes
import br.com.fiap.jetpack.components.IngredientesColumn
import br.com.fiap.jetpack.repository.getAllIngredients
import br.com.fiap.jetpack.repository.getIngredientsByName

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaIngredientes(telaIngredientesViewModel: TelaIngredientesViewModel) {

    //val comida = remember { mutableStateListOf<String>() }
    val comida by telaIngredientesViewModel.comida.observeAsState(initial = listOf<String>())

    var valorBusca by remember {
        mutableStateOf("")
    }

    var listIngredients by remember {
        mutableStateOf(getIngredientsByName(valorBusca))
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                Color(242, 231, 208, 255)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        BotaoVoltar(modifier = Modifier.align(Alignment.Start))

        Column(
            modifier = Modifier
                .background(
                    Color(243, 245, 244),
                    shape = RoundedCornerShape(topEnd = 32.dp, bottomEnd = 32.dp)
                )
                .fillMaxHeight(0.5f)
                .fillMaxWidth(0.8f)
                .clip(RoundedCornerShape(topEnd = 32.dp, bottomEnd = 32.dp))
                .drawBehind {
                    val borderSize = 2.dp.toPx()
                    val y = size.height - borderSize / 2

                    drawLine(
                        color = Color.Black,
                        start = Offset(x = 0f, y),
                        end = Offset(size.width, y),
                        strokeWidth = borderSize
                    )
                },

            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            Text(
                text = "Ingredientes em casa:",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                modifier = Modifier.padding(top = 20.dp)
            )
            Divider(modifier = Modifier.padding(start = 40.dp, end = 30.dp))

            if (!comida.isEmpty()) {
                IngredientesColumn(comida = comida)
            }


        }

        Surface(
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .height(35.dp)
                .offset(x = 0.dp, y = (-405).dp),
            color = Color(189, 71, 71)
        ) {}

        BuscarIngredientes(
            texto = "Buscar Ingredientes",
            value = valorBusca,
            changeValue = {
                valorBusca = it
            },
            getIngredientsByName = {
                listIngredients = getIngredientsByName(valorBusca)
            }
        )



        Surface(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxHeight(0.6f)
                .fillMaxWidth(0.8f),
            shadowElevation = 3.dp
        ) {

            LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 110.dp)) {
                items(listIngredients) { ingrediente ->
                    BotaoIngrediente(nome = ingrediente)
                }
            }

        }

        BotaoCriar(
            texto = "Crie Refeições",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}

@Preview
@Composable
fun TelaIngredientesPreview() {

    TelaIngredientes(TelaIngredientesViewModel())

}