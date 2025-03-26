package com.example.nutritionapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val route: String,
    val title: String,
    val image: ImageVector
) {
    companion object {
        val navigationItems = listOf(
            BottomNavItem(
                route = NavigationRoutesParams.HOME,
                title = NavigationRoutesParams.HOME,
                image = Icons.Default.Home
            ),
            BottomNavItem(
                route = NavigationRoutesParams.SEARCH,
                title = NavigationRoutesParams.SEARCH,
                image = Icons.Default.Search
            ),
            BottomNavItem(
                route = NavigationRoutesParams.RUN,
                title = NavigationRoutesParams.RUN,
                image = Icons.Default.Place
            ),
        )
    }
}