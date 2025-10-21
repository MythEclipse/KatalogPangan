package com.mytheclipse.KatalogPangan

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
                KatalogPanganApp()
            }
        }
    }
}

@Composable
fun KatalogPanganApp() {
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
