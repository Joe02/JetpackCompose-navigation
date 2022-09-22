package com.example.navigation_tests.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.navigation_tests.ui.screens.SettingsScreen

@Composable
fun SettingsScaffold(navController: NavController) {
    Scaffold {
        SettingsScreen(navController = navController)
    }
}