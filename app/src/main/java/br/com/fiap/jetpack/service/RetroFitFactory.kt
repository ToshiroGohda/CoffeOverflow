package br.com.fiap.jetpack.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory

class RetroFitFactory {

    private val URL = "http://localhost:8080/"


    private val retroFitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getIngredientsService(): IngredientsService {
        return retroFitFactory.create(IngredientsService::class.java)
    }

    fun getPratoService(): PratoService {
        return retroFitFactory.create(PratoService::class.java)
    }

}