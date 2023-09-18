package br.com.fiap.jetpack.View

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.fiap.jetpack.model.Ingredients
import br.com.fiap.jetpack.repository.IngredientsRepository
import kotlinx.coroutines.launch

class TelaIngredientesViewModel: ViewModel() {

//    private val repository = IngredientsRepository()
//
//
//    private val _comida = MutableLiveData<List<String>>()
//    val comida: LiveData<List<String>> = _comida
//
//    private val _listIngredients = MutableLiveData<List<Ingredients>>()
//    val listIngredients: LiveData<List<Ingredients>> = _listIngredients
//
//
//
//    fun onComidaChange(novaComida: String) {
//        _comida.value = _comida.value?.plus(novaComida) ?: listOf(novaComida)
//    }
//
//
//    fun fetchIngredients() {
//        viewModelScope.launch {
//            try {
//                val ingr = repository.getIngredients()
//                _listIngredients.value = ingr
//            } catch (e: Exception) {
//                Log.i("error", e.message!!)
//            }
//        }
//    }
//
//


}