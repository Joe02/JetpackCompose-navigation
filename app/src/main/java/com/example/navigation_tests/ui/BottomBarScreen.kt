package com.example.navigation_tests.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        title = "Profile",
        icon = Icons.Default.Person
    )
}