package br.com.fiap.jetpack.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.jetpack.components.BotaoCriar
import br.com.fiap.jetpack.components.BotaoVoltar
import br.com.fiap.jetpack.components.SurfaceComida
import br.com.fiap.jetpack.model.Ingredients
import br.com.fiap.jetpack.model.Pratos
import br.com.fiap.jetpack.service.RetroFitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun TelaRefeicao(navController: NavController) {

    var listPrato by remember {
        mutableStateOf(listOf<Pratos>())
    }

    val callback = RetroFitFactory().getPratoService().getAllPratos();

    callback.enqueue(object : Callback<List<Pratos>>{
        override fun onResponse(call: Call<List<Pratos>>, response: Response<List<Pratos>>) {
            listPrato = response.body()!!
        }

        override fun onFailure(call: Call<List<Pratos>>, t: Throwable) {
            TODO("Not yet implemented")
        }

    })



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(242, 231, 208, 255)),
        horizontalAlignment = CenterHorizontally,

        ) {


        BotaoVoltar(
            modifier = Modifier.align(Start),
            onClick = {
                navController.navigate(route = "Ingredientes")
            }
        )

        Text(
            text = "Escolha uma refeição personalizada!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "As receitas abaixo foram cuidadosamente calculadas" +
                    " levando em conta as suas especificidades biológicas, " +
                    "seus objetivos, e os alimentos disponíveis em sua casa",
            modifier = Modifier.padding(horizontal = 25.dp, vertical = 10.dp)
        )

        SurfaceComida(modifier = Modifier.align(CenterHorizontally), listPrato)

        BotaoCriar(
            texto = "Selecionar Prato",
            modifier = Modifier.align(CenterHorizontally),
            onClick = {

            }
        )

    }
}


@Preview
@Composable
fun TelaRefeicaoPreview() {
    val navController = rememberNavController()
    TelaRefeicao(navController)

}
