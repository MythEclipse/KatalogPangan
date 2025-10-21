package com.mytheclipse.KatalogPangan.model

data class Food(
    val id: Int,
    val name: String,
    val overview: String,
    val description: String,
    val origin: String,
    val ingredients: String,
    val imageRes: Int
)

