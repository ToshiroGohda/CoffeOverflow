package br.com.fiap.jetpack.service

import br.com.fiap.jetpack.model.Pratos
import retrofit2.Call
import retrofit2.http.GET

interface PratoService {


    @GET("http://localhost:8080/pratos")
    fun getAllPratos(): Call<List<Pratos>>

}