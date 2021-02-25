package io.github.manuelernesto.puppyadoption

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController?, string: String?) {
    Text(text = "$string")
}