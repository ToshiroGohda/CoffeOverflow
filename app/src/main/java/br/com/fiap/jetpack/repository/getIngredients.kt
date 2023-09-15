package br.com.fiap.jetpack.repository

fun getAllIngredients(): List<String>{
    return listOf<String>(
        "Frango",
        "Arroz",
        "Feijão",
        "Frango",
        "Arroz",
        "Feijão",
        "Frango",
        "Arroz",
        "Feijão"
    )
}


fun getIngredientsByName(nome: String): List<String> {
    return getAllIngredients().filter {
        it.startsWith(prefix = nome, ignoreCase = false)
    }
}