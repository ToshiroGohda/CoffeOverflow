package br.com.fiap.jetpack.repository

import br.com.fiap.jetpack.model.Ingredients
import br.com.fiap.jetpack.service.RetroFitFactory


class IngredientsRepository {

    private val ingredientsService = RetroFitFactory().getIngredientsService()


    suspend fun getIngredients(): List<Ingredients> {
        return ingredientsService.getAllIngredients()
    }


}