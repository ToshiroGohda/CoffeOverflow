package br.com.fiap.jetpack.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.jetpack.R
import br.com.fiap.jetpack.components.BotaoCriar

@Composable
fun TelaHome(navController: NavController) {




    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(242, 231, 208, 255)
            ),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "lol",
            modifier = Modifier
                .size(570.dp)
        )

        Text(
            text = "Bem vindo ao seu plano alimentar.",
            modifier = Modifier
                .padding(bottom = 20.dp)
                .fillMaxWidth(0.6f),
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )


        BotaoCriar(
            texto = "Começar",
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .align(Alignment.CenterHorizontally),
            onClick = {
                navController.navigate(route = "Ingredientes");
            }
        )

    }

}



@Preview
@Composable
fun TelaHomePreview() {
    TelaHome(navController = rememberNavController())
}