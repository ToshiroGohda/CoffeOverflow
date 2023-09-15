package br.com.fiap.jetpack.View

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TelaIngredientesViewModel: ViewModel() {

    private val _comida = MutableLiveData<List<String>>()
    val comida: LiveData<List<String>> = _comida


    fun onComidaChange(novaComida: String) {
        _comida.value = _comida.value?.plus(novaComida) ?: listOf(novaComida)
    }

}