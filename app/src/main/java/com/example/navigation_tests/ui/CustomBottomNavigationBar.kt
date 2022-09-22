package com.example.navigation_tests.ui

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun AppBottomNavigationBar(navController: NavController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Profile
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screenRoute ->
            AddItem(
                navController = navController,
                currentDestination = currentDestination,
                screenRoute = screenRoute
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    navController: NavController,
    currentDestination: NavDestination?,
    screenRoute: BottomBarScreen
) {
    BottomNavigationItem(
        label = {
            Text(screenRoute.title)
        },
        icon = {
            Icon(
                imageVector = screenRoute.icon,
                contentDescription = screenRoute.title
            )
        },
        selected = currentDestination?.route == screenRoute.title,
        onClick = {
            navController.navigate(screenRoute.title) {
                launchSingleTop = true
            }
        }
    )
}