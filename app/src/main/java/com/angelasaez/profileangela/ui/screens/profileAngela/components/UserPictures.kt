package com.angelasaez.profileangela.ui.screens.profileAngela.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun UserPictures(picture1: Int, picture2: Int) { //Only 2 pictures

    var isLiked1 by remember { mutableStateOf(false) }
    var isLiked2 by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .border(1.dp, Color.Black)
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center,
    ) {

        Column(
            modifier = Modifier
                .border(1.dp, Color.Black)
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = picture1),
                contentDescription = "Imagen 1",
                modifier = Modifier.size(120.dp)
            )

            // Botón para like
            FilledTonalButton(
                onClick = {
                    isLiked1 = !isLiked1
                },
                modifier = Modifier.padding(top = 8.dp),
                colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = if (isLiked1) Color.Gray else Color.LightGray
                )
            ) {
                Text(
                    text = if (isLiked1) "Me gusta" else "No me gusta", color = Color.White
                )
            }
        }

        Spacer(Modifier.width(30.dp));

        Column(
            modifier = Modifier
                .border(1.dp, Color.Black)
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = picture1),
                contentDescription = "Imagen 1",
                modifier = Modifier.size(120.dp)
            )

            // Botón para like
            FilledTonalButton(
                onClick = {
                    isLiked2 = !isLiked2
                },
                modifier = Modifier.padding(top = 8.dp),
                colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = if (isLiked2) Color.Gray else Color.LightGray
                )
            ) {
                Text(
                    text = if (isLiked2) "Me gusta" else "No me gusta", color = Color.White
                )
            }
        }
    }
}