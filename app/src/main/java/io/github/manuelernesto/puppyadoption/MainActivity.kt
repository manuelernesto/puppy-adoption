package io.github.manuelernesto.puppyadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.manuelernesto.puppyadoption.ui.theme.PuppyAdoptionTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuppyAdoptionTheme {
                Surface(color = MaterialTheme.colors.background) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    ComposeNavigation()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PuppyAdoptionTheme {
        App()
    }
}


