package com.angelasaez.profileangela.ui.screens.profileAngela.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.profileangela.model.User
import com.angelasaez.profileangela.ui.screens.common.CustomSpacer

@Composable
fun UserMessages(user: User) {

    val messageCount = remember { mutableIntStateOf(user.userMessages) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // Centra todo horizontalmente
        verticalArrangement = Arrangement.Center,  // Centra los elementos verticalmente
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        BadgedBox(
            badge = {
                Badge(
                    containerColor = Color.Red,
                    modifier = Modifier
                        .size(23.dp)
                ) {
                    Text(
                        text = messageCount.intValue.toString(),
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            }
        ) {
            Icon(
                imageVector = Icons.Default.Mail,
                contentDescription = "Messages",
                tint = Color.Gray,
                modifier = Modifier.size(40.dp) // Tamaño del icono
            )
        }

       CustomSpacer(width = 50)

        Button(
            onClick = { messageCount.intValue += 1 },
            modifier = Modifier
                .padding(top = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            )
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "+1 mensaje",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}