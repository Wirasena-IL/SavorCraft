package com.example.savorcraft.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

class NavigationItem {
    data class NavigationItem(
        val title: String,
        val icon: ImageVector,
        val screen: Screen
    )
}