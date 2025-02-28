package com.example.saeprojetmobile.ui.screens

import androidx.compose.foundation.*;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.*;
import androidx.compose.ui.*;
import androidx.compose.ui.unit.*;
import com.example.saeprojetmobile.R;
import androidx.compose.ui.res.painterResource;
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_splash1),
            contentDescription = "Splash Image",
            modifier = Modifier
                .width(360.dp)
                .height(235.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Connexion",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF6460A0),
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(32.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Identifiant",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif
            )

            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                shape = RoundedCornerShape(20),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.Black.copy(alpha = 0.3f),
                    focusedIndicatorColor = Color.Black.copy(alpha = 0.5f)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Mot de passe",
                fontSize = 15.sp,
                color = Color.Black,
                fontFamily = FontFamily.SansSerif)

            OutlinedTextField(
                value = password,
                onValueChange = {password = it },
                shape = RoundedCornerShape(20),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.Black.copy(alpha = 0.3f),
                    focusedIndicatorColor = Color.Black.copy(alpha = 0.5f)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                visualTransformation = PasswordVisualTransformation()
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(red=245, green=105, blue=79)),
            shape = RoundedCornerShape(20),
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
        ) {
            Text(text = "Connexion",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontSize = 19.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row {
            Text(
                text = "Tu n'as pas de compte?",
                fontSize = 16.sp,
                color = Color.Black.copy(0.7f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Crée en un",
                fontSize = 16.sp,
                color = Color(red=73, green=41, blue=254).copy(0.7f),
                modifier = Modifier.clickable { }
            )
        }
    }
}

@Composable
@Preview(device = "spec:width=411dp,height=891dp")
fun LoginScreenPreview(){
    LoginScreen()
}