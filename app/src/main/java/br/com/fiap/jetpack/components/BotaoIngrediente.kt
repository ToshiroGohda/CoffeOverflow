package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BotaoIngrediente(nome: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(start = 5.dp, end = 5.dp)
            .fillMaxWidth(0.25f)
            .fillMaxHeight(0.25f),

        shape = RoundedCornerShape(size = 5.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(244, 233, 227), contentColor = Color.Black),

        ) {
        Text(text = nome)
    }
}