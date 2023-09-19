package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BotaoVoltar(modifier: Modifier, onClick: () -> Unit) {

    Row(modifier = modifier) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .offset(x = (-35).dp, y = (-15).dp)
                .then(Modifier.size(width = 100.dp, height = 75.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(189, 71, 71)
            ),

            ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Voltar",
                modifier = Modifier.absolutePadding(left = 20.dp, top = 5.dp)
            )
        }
    }

}