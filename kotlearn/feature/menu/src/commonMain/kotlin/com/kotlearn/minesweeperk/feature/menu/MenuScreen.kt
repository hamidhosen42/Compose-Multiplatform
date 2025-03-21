package com.kotlearn.hamidhosen.feature.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MenuScreen(
    goToPlay: () -> Unit,
    goToHighscores: () -> Unit,
    goToSettings: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        TextButton(
            onClick = goToPlay,
        ) {
            Text("Play")
        }
        TextButton(
            onClick = goToHighscores,
        ) {
            Text("Highscores")
        }
        TextButton(
            onClick = goToSettings,
        ) {
            Text("Settings")
        }
    }
}