package br.com.fiap.jetpack.Telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.jetpack.components.BotaoCriar
import br.com.fiap.jetpack.components.BotaoVoltar
import br.com.fiap.jetpack.components.SurfaceComida

@Composable
fun TelaRefeicao() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(242, 231, 208, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {


        BotaoVoltar(modifier = Modifier.align(Start))

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

        SurfaceComida(modifier = Modifier.align(Alignment.CenterHorizontally))

        BotaoCriar(texto = "Selecionar Prato", modifier = Modifier.align(CenterHorizontally))

    }
}


@Preview
@Composable
fun TelaRefeicaoPreview() {

    TelaRefeicao()

}
