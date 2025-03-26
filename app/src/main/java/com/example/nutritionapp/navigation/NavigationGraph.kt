package com.example.nutritionapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.nutritionapp.ui.theme.screens.HomeScreen
import com.example.nutritionapp.ui.theme.screens.RunScreen
import com.example.nutritionapp.ui.theme.screens.SearchScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoutesParams.HOME,
        modifier = Modifier.padding(paddingValues)
    ){
        composable(NavigationRoutesParams.HOME) {
            HomeScreen()
        }
        composable(NavigationRoutesParams.SEARCH) {
            SearchScreen()
        }
        composable(NavigationRoutesParams.RUN) {
            RunScreen()
        }
    }
}