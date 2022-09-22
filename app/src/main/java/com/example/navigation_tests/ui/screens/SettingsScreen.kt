package com.example.navigation_tests.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigation_tests.ui.theme.NavigationtestsTheme

@Composable
fun SettingsScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hello Jow! This is your settings screen.",
            style = MaterialTheme.typography.h3,
            textAlign = TextAlign.Center
        )
        Button(onClick = {
            navController.navigateUp()
        }
        ) {
            Text("Voltar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    NavigationtestsTheme {
        SettingsScreen(rememberNavController())
    }
}