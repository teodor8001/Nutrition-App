package com.example.nutritionapp.ui.theme.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormatLabel(
    textHint: String = "",
) {
    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text (textHint) },
        shape = RoundedCornerShape( 30),
        modifier = Modifier.height(45.dp)
    )
}