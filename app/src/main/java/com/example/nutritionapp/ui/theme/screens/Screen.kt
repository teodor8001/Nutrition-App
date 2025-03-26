package com.example.nutritionapp.ui.theme.screens

sealed class Screen(val route : String) {
    object Home : Screen("home")
    object Search : Screen("search")
    object Run : Screen("run")
}