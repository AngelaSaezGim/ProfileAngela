package com.angelasaez.profileangela.ui.screens.profileAngela.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.angelasaez.profileangela.model.User
import com.angelasaez.profileangela.ui.screens.common.CustomSpacer

@Composable
fun UserCard(user: User) {

    var isFollowing by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .border(1.dp, Color.Black)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        //Columna para la foto de perfil (dentro de row)
        Column(
            modifier = Modifier
                .size(90.dp)
        ) {
            Image(
                painter = painterResource(id = user.userProfilePicture),
                contentDescription = "Imagen del usuario",
                modifier = Modifier
                    .clip(CircleShape)
                    .border(1.dp,Color.Black,CircleShape)
                    .size(100.dp),
            )
        }
        CustomSpacer(width = 20)
        //Columna para nombre de usuario (dentro de row)
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = user.userName, fontSize = 25.sp
            )
        }
        CustomSpacer(width = 30)

        // Columna para botón de seguir (dentro de Row)
        Column(
            modifier = Modifier.weight(1.4f)
        ) {
            //Uso boton sacado de Material Design 3
            FilledTonalButton(
                onClick = {
                    isFollowing = !isFollowing
                }
                ,colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = if (isFollowing) Color.Gray else Color.LightGray // Cambia el color según el estado
                )
            ) {
                Text(
                    text = if (isFollowing) "Siguiendo" else "Seguir",
                    color = Color.White
                )
            }
        }

    }
}