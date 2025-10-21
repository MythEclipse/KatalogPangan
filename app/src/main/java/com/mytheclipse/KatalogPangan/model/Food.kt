package com.mytheclipse.KatalogPangan.model

data class Food(
    val id: Int,
    val name: String,
    val overview: String,
    val description: String,
    val origin: String,
    val ingredients: String,
    val imageRes: Int,
    val calories: String = "",
    val nutrition: String = "",
    val cookingTime: String = "",
    val difficulty: String = "",
    val servings: String = "",
    val tips: String = ""
)

