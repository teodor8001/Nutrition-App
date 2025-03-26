package com.example.nutritionapp.ui.theme.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.nutritionapp.navigation.NavigationGraph
import com.example.nutritionapp.ui.theme.components.BottomNavigationBar

@Composable
@Preview
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = { BottomNavigationBar(navController) },
    ) {
        paddingValues ->
        NavigationGraph(navController, paddingValues)
    }
}