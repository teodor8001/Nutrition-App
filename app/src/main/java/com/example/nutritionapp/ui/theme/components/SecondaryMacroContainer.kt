package com.example.nutritionapp.ui.theme.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.nutritionapp.ui.theme.BitterSweet
import com.example.nutritionapp.ui.theme.LetterColor
import com.example.nutritionapp.ui.theme.MayaBlue

@Composable
fun SecondaryMacroContainer() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        ProteinsContainer(30, 90)
        CarbosContainer(100, 200)
    }

    Spacer(Modifier.height(10.dp))

    FatsContainer(20, 80)
}

@Composable
fun ProteinsContainer(
    proteins: Int,
    maxProteins: Int
) {
    val progressProtein = proteins.toFloat() / maxProteins

    Card(
        modifier = Modifier.fillMaxWidth()
            .height(200.dp)
    ){
        Spacer(Modifier.height(20.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Proteins",
            color = LetterColor,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(10.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "${proteins} / ${maxProteins} g"
        )

        Spacer(Modifier.height(20.dp))

        LinearProgressIndicator(
            progress = { progressProtein },
            modifier = Modifier.fillMaxWidth()
                .height(20.dp)
                .padding(horizontal = 40.dp),
            color = BitterSweet,
            trackColor = MayaBlue
        )
    }
}

@Composable
fun CarbosContainer(
    carbos: Int,
    maxCarbos: Int
) {
    val progressCarbos = carbos.toFloat() / maxCarbos
    Card(
        modifier = Modifier.fillMaxWidth()
            .height(200.dp)
    ){
        Spacer(Modifier.height(20.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Carbos",
            color = LetterColor,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(10.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "${carbos} / ${maxCarbos} g"
        )

        Spacer(Modifier.height(20.dp))

        LinearProgressIndicator(
            progress = { progressCarbos },
            modifier = Modifier.fillMaxWidth()
                .height(20.dp)
                .padding(horizontal = 40.dp),
            color = BitterSweet,
            trackColor = MayaBlue
        )
    }
}

@Composable
fun FatsContainer(
    fats: Int,
    maxFats: Int
) {
    val progressFats = fats.toFloat() / maxFats
    Card(
        modifier = Modifier.fillMaxWidth()
            .height(200.dp)
    ){
        Spacer(Modifier.height(20.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Fats",
            color = LetterColor,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(10.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "${fats} / ${maxFats} g"
        )

        Spacer(Modifier.height(20.dp))

        LinearProgressIndicator(
            progress = { progressFats },
            modifier = Modifier.fillMaxWidth()
                .height(20.dp)
                .padding(horizontal = 40.dp),
            color = BitterSweet,
            trackColor = MayaBlue
        )
    }
}

@Composable
fun WeightTargetContainer() {

}