package com.example.nutritionapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.nutritionapp.R
import com.example.nutritionapp.ui.theme.components.FormatLabel

//@Preview
@Composable
fun LogInScreen(
    onNavigateToHome: () -> Unit
) {
    var username: String by remember { mutableStateOf("") }
    var password: String by remember { mutableStateOf("") }
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(R.drawable.app_logo),
                contentDescription = "App Logo",
                modifier = Modifier.size(80.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(24.dp))

            FormatLabel("Email")

            Spacer(modifier = Modifier.height(24.dp))

            FormatLabel("Password")

            Spacer(modifier = Modifier.height(24.dp))

            //LogIn Button
            Button(
                onClick = onNavigateToHome,
                modifier = Modifier.height(35.dp),
            ) {
                Text("Log In")
            }

            Spacer(modifier = Modifier.height(10.dp))

            //Create an account message
            Row(
                modifier = Modifier.padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Don't have an account?",
                    style = TextStyle(fontSize = 14.sp)
                )

                TextButton(
                    onClick = { },
                    ) {
                    Text(
                        text = "Create an account.",
                        style = TextStyle(fontSize = 14.sp)
                    )
                }
            }
        }
    }
}