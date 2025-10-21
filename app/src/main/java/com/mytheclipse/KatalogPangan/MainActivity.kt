package com.mytheclipse.KatalogPangan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.mytheclipse.KatalogPangan.data.FoodData
import com.mytheclipse.KatalogPangan.model.Food
import com.mytheclipse.KatalogPangan.screen.AboutScreen
import com.mytheclipse.KatalogPangan.screen.DetailScreen
import com.mytheclipse.KatalogPangan.screen.MainScreen
import com.mytheclipse.KatalogPangan.ui.theme.KatalogPanganTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KatalogPanganTheme {
                KatalogPanganApp(
                    onShareFood = { food ->
                        shareFood(food)
                    }
                )
            }
        }
    }
    
    private fun shareFood(food: Food) {
        val shareText = """
            ${food.name}
            
            ${food.overview}
            
            Asal: ${food.origin}
            
            Deskripsi:
            ${food.description}
            
            Bahan-bahan:
            ${food.ingredients}
            
            ${if (food.calories.isNotEmpty()) "Kalori: ${food.calories}\n" else ""}${if (food.cookingTime.isNotEmpty()) "Waktu Memasak: ${food.cookingTime}\n" else ""}${if (food.difficulty.isNotEmpty()) "Tingkat Kesulitan: ${food.difficulty}\n" else ""}
            Lihat lebih lengkap di Aplikasi Katalog Pangan Indonesia!
        """.trimIndent()
        
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, shareText)
            type = "text/plain"
        }
        
        val shareIntent = Intent.createChooser(sendIntent, "Bagikan ${food.name}")
        startActivity(shareIntent)
    }
}

@Composable
fun KatalogPanganApp(
    onShareFood: (Food) -> Unit = {}
) {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Main) }
    var selectedFood by remember { mutableStateOf<Food?>(null) }

    when (currentScreen) {
        Screen.Main -> {
            MainScreen(
                foodList = FoodData.foodList,
                onFoodClick = { food ->
                    selectedFood = food
                    currentScreen = Screen.Detail
                },
                onAboutClick = {
                    currentScreen = Screen.About
                }
            )
        }
        Screen.Detail -> {
            selectedFood?.let { food ->
                DetailScreen(
                    food = food,
                    onBackClick = {
                        currentScreen = Screen.Main
                    },
                    onShareClick = {
                        onShareFood(food)
                    }
                )
            }
        }
        Screen.About -> {
            AboutScreen(
                onBackClick = {
                    currentScreen = Screen.Main
                }
            )
        }
    }
}

sealed class Screen {
    object Main : Screen()
    object Detail : Screen()
    object About : Screen()
}
