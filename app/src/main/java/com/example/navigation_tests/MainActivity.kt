package com.example.navigation_tests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation_tests.ui.HomeScaffold
import com.example.navigation_tests.ui.SettingsScaffold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppScaffold()
        }
    }
}

@Composable
fun AppScaffold() {
    val appNavController = rememberNavController()

    Scaffold {
        NavHost(
            navController = appNavController,
            startDestination = "HomeScaffold"
        ) {
            composable("HomeScaffold") {
                HomeScaffold(appNavController)
            }
            composable("SettingsScaffold") {
                SettingsScaffold(appNavController)
            }
        }
    }
}