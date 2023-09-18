package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.jetpack.R


@Composable
fun BotaoComida(
    nome: String,
) {
    Row(
        modifier = Modifier

            .height(50.dp)
           //.offset(x = (-70).dp, y = 0.dp)
            .padding(top = 10.dp, start = 15.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.circle_24),
            contentDescription = "Ponto",
            modifier = Modifier
                .size(width = 10.dp, height = 10.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 8.dp)
                .size(width = 100.dp, height = 100.dp),

            shape = RoundedCornerShape(size = 5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(244, 233, 227), contentColor = Color.Black),

            ) {
            Text(text = nome)
        }

    }
    Divider(modifier = Modifier.padding(start = 40.dp, end = 30.dp))
}

