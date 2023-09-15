package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BotaoCriar(texto: String, modifier: Modifier) {

    Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(size = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(187, 71, 72)
            ),
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(text = texto)
        }

}