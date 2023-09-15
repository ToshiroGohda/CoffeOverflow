package br.com.fiap.jetpack.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitFactory {

    private val URL = "https://virtserver.swaggerhub.com/CISQUA_1/Meeal/1.0.0/ingredients"


    private val retroFitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getIngredientsService(): IngredientsService {
        return retroFitFactory.create(IngredientsService::class.java)
    }

}