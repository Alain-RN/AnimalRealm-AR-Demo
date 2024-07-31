package mada.alain.animalrealm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mada.alain.animalrealm.components.SplashScreen
import mada.alain.animalrealm.ui.theme.AnimalRealmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimalRealmTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashScreen(nameApp = "AnimalRealm", modifier = Modifier)
                }
            }
        }
    }


@Preview(
    showBackground = true,
    widthDp = 350
    )
@Composable
fun OpeningPreview() {
    AnimalRealmTheme {

    }
    }
}