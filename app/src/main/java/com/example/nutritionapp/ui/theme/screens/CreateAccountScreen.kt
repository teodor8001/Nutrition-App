package com.example.nutritionapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nutritionapp.R
import com.example.nutritionapp.ui.theme.components.FormatLabel


@Composable
fun CreateAccountScreen() {
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

        Spacer(modifier = Modifier.height(20.dp))

        FormatLabel("Your Email")

        Spacer(modifier = Modifier.height(20.dp))

        FormatLabel("Password")

        Spacer(modifier = Modifier.height(20.dp))

        FormatLabel("Repeat Password")

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .height(40.dp)
        ) {
            Text("Create Account")
        }
    }
}

@Preview
@Composable
fun CreateAccountScreenPreview(){
    CreateAccountScreen()
}