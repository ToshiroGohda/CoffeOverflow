package br.com.fiap.jetpack.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.jetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuscarIngredientes(texto: String = "") {

    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = texto)
        },
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search_24),
                contentDescription = "Buscar"
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.Gray,
            disabledTextColor = Color.Transparent,
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(size = 10.dp),
        modifier = Modifier
            .padding(bottom = 30.dp)
    )

}