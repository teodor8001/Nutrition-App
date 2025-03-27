package com.example.nutritionapp.ui.theme.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nutritionapp.ui.theme.BitterSweet
import com.example.nutritionapp.ui.theme.LetterColor
import com.example.nutritionapp.ui.theme.MayaBlue

@Composable
fun MacroContainer(
    calories: Int,
    maxCalories: Int
) {
    val progressCalorie = calories.toFloat() / maxCalories
    Card(
        modifier = Modifier.fillMaxWidth()
            .height(200.dp)
    ) {
        Spacer(Modifier.height(20.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Calorie Budget",
            color = LetterColor,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(20.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "${calories} / ${maxCalories}",
            color = LetterColor,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.height(20.dp))

        LinearProgressIndicator(
            progress = { progressCalorie },
            modifier = Modifier.fillMaxWidth()
                .height(20.dp)
                .padding(horizontal = 40.dp),
            color = BitterSweet,
            trackColor = MayaBlue
        )
    }
}

@Composable
@Preview
fun MacroContainerPreview() {
    MacroContainer(500, 2000)
}