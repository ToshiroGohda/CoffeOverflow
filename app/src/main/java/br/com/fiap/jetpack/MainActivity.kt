package br.com.fiap.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.jetpack.Telas.TelaIngredientes
import br.com.fiap.jetpack.Telas.TelaRefeicao
import br.com.fiap.jetpack.View.TelaIngredientesViewModel
import br.com.fiap.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Ingredientes") {

                        composable(route = "Ingredientes") {
                            TelaIngredientes(TelaIngredientesViewModel())
                        }

                        composable(route = "Refeicao") {
                            TelaRefeicao()
                        }

                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun JetPackThemePreview() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Ingredientes") {

        composable(route = "Ingredientes") {
            TelaIngredientes(TelaIngredientesViewModel())
        }

    }
}