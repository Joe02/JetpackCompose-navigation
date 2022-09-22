package com.example.navigation_tests.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation_tests.ui.screens.HomeScreen
import com.example.navigation_tests.ui.screens.ProfileScreen

@Composable
fun HomeScaffold(appNavController: NavController) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            AppBottomNavigationBar(navController)
        }
    ) {
        NavHost(navController = navController, startDestination = "Home") {
            composable("Profile") {
                ProfileScreen(navController = appNavController)
            }
            composable("Home") {
                HomeScreen()
            }
        }
    }
}