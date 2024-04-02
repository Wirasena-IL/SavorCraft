package com.example.savorcraft.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Explore : Screen("jelajahi")
    object Scan : Screen("scan")
    object Suka : Screen("suka")
    object Profil : Screen("profil")
}