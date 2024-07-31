package mada.alain.animalrealm.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mada.alain.animalrealm.R
import mada.alain.animalrealm.ui.theme.AnimalRealmTheme

@Composable
fun SplashScreen(nameApp : String, modifier: Modifier) {
    val logo = R.drawable.logo_animalrealm_lion_paw
    Box(modifier = Modifier
        .fillMaxSize()){
        Column(
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            Image(
                painter = painterResource(id = logo),
                contentDescription = nameApp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .align(Alignment.End)
                    .size(100.dp)
            )

            Text(
                text = nameApp,
                style = MaterialTheme.typography.titleLarge,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .align(alignment = Alignment.CenterHorizontally)
                    .align(Alignment.End)

            )
        }
    }

}

@Preview(
    showBackground = true,
    widthDp = 350
)
@Composable
fun DebutPreview() {
    AnimalRealmTheme {
        SplashScreen(nameApp = "AnimalRealm", modifier = Modifier)
    }
}