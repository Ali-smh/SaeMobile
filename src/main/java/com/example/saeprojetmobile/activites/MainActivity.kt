package com.example.saeprojetmobile.activites

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.saeprojetmobile.ui.theme.SaeProjetMobileTheme
import com.example.saeprojetmobile.ui.screens.SplashScreen
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaeProjetMobileTheme {
                SplashScreen()
                val context = LocalContext.current

                LaunchedEffect(Unit) {
                    delay(3000)
                    context.startActivity(Intent(context, LoginActivity::class.java))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SaeProjetMobileTheme {
        SplashScreen()
    }
}