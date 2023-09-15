package br.com.fiap.jetpack.service

import br.com.fiap.jetpack.model.Ingredients
import retrofit2.Call
import retrofit2.http.GET

interface IngredientsService {

    //https://virtserver.swaggerhub.com/CISQUA_1/Meeal/1.0.0/ingredients



    @GET
    fun getAllIngredients(): Call<List<Ingredients>>

    @GET
    fun getIngredientsByName(nome: String = ""): Call<Ingredients>
//        return getAllIngredients().filter {
//            it.startsWith(prefix = nome, ignoreCase = false)
//        }
//    }


}


//fun getAllIngredients(): List<String>{
//    return listOf<String>(
//        "Frango",
//        "Arroz",
//        "Feijão",
//        "Frango",
//        "Arroz",
//        "Feijão",
//        "Frango",
//        "Arroz",
//        "Feijão"
//    )
//}
//
//
//fun getIngredientsByName(nome: String): List<String> {
