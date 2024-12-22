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
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun UserCard(userName: String, profilePicture: Int) {

    var isFollowing by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .border(1.dp, Color.Black)
            .padding(20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier
                .size(90.dp)
                .border(1.dp, Color.Black)
        ) {
            Image(
                painter = painterResource(id = profilePicture),
                contentDescription = "Imagen del usuario",
                modifier = Modifier.size(100.dp)
            )
        }
        Spacer(Modifier.width(20.dp));
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = userName, fontSize = 25.sp
            )
        }

        Spacer(Modifier.width(30.dp));
        // Botón de Seguir/Siguiendo
        FilledTonalButton(
            onClick = {
                isFollowing = !isFollowing
            }, colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = if (isFollowing) Color.Gray else Color.LightGray // Cambia el color según el estado
            )
        ) {
            Text(
                text = if (isFollowing) "Siguiendo" else "Seguir", color = Color.White
            )
        }

    }
}