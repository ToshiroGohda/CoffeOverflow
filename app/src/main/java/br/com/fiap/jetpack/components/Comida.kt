package br.com.fiap.jetpack.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Comida(carbs: String, gordura: String, porcao: Int, proteina: String, fibra: String, name: String) {

    Column(
        modifier = Modifier
            .height(125.dp)
            .padding(bottom = 10.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.White, shape = RoundedCornerShape(20.dp))
            .drawBehind {
                val borderSize = 1.dp.toPx()
                val y = size.height - borderSize / 2

                drawLine(
                    color = Color.Black,
                    start = Offset(x = 0f, y),
                    end = Offset(size.width, y),
                    strokeWidth = borderSize
                )
            },
    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 5.dp)
        ) {

            Text(
                modifier = Modifier
                    .padding(start = 5.dp)
                    .width(250.dp),
                fontSize = 22.sp,
                text = name,
            )
            RadioButton(
                selected = false,
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 15.dp)
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Carboidratos: $carbs",
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth(0.33f)
                    .padding(start = 5.dp)

            )
            Text(
                text = "Gorduras: $gordura",
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth(0.33f)
                    .offset(x = 20.dp)
            )
            Text(
                text = "$porcao porção",
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth(0.34f)
                    .offset(x = 70.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Text(
                text = "Proteinas: $proteina ",
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(start = 5.dp)
                    .fillMaxWidth(0.33f)
            )
            Text(
                text = "Fibra: $fibra ",
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth(0.33f)
                    .offset(17.dp)

            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(110.dp, 28.dp)
                    .padding(start = 5.dp)
                    .offset(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(187, 71, 72))
            ) {
                Text(text = "Ver receitas", fontSize = 10.sp)
            }
        }
    }
}