package br.com.fiap.jetpack.service

import br.com.fiap.jetpack.model.Ingredients
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface IngredientsService {

    //http://localhost:8080/ingredients



    @GET("http://localhost:8080/ingredients")
    fun getAllIngredients(): Call<List<Ingredients>>





//    @GET
//    fun getIngredientsByName(nome: String = ""): Call<Ingredients>
//        return getAllIngredients().filter {
//            it.startsWith(prefix = nome, ignoreCase = false)
//        }
//    }


}

