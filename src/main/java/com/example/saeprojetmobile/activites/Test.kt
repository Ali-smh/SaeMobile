package com.example.saeprojetmobile.activites

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.saeprojetmobile.ui.theme.SaeProjetMobileTheme
import com.example.saeprojetmobile.ui.screens.LoginScreen

class Test : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaeProjetMobileTheme {
                LoginScreen()
            }
        }
    }
}