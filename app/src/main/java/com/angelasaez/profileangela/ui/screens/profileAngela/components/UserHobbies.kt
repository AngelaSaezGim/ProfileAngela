package com.angelasaez.profileangela.ui.screens.profileAngela.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.profileangela.model.User
import com.angelasaez.profileangela.ui.screens.common.CustomSpacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material3.Icon
import androidx.compose.material3.VerticalDivider
import androidx.compose.ui.res.colorResource
import com.angelasaez.profileangela.R

@Composable
fun UserHobbies(user: User) {

    //Hobbie - Icono
    val hobbyIcons = mapOf(
        "Leer" to Icons.Default.Book,
        "Cine" to Icons.Default.Movie,
        "Videojuegos" to Icons.Default.VideogameAsset,
        "Música" to Icons.Default.MusicNote,
        "Viajar" to Icons.Default.Public
    )
    //Icono predeterminado si asignamos hobbies sin iconos asociados
    val defaultIcon = Icons.Default.AddCircle

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp)
    ) {
        Text(
            text = "Hobbies de ${user.userName}",
            fontSize = 20.sp,
        )

        CustomSpacer(height = 16)

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            //Itero sobre la lista de hobbies y agrego iconos (HashMap)
            user.userHobbies.forEach { hobby ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 3.dp, horizontal = 15.dp)
                        .border(1.dp, Color.Black)
                        .padding(10.dp)
                ) {
                    //Aqui coloco cada icono - HashMap hobbyIcons[hobby]
                    // Obtener el icono del mapa, o usar el predeterminado
                    val icon = hobbyIcons[hobby] ?: defaultIcon
                    Icon(
                        imageVector = icon,
                        contentDescription = "$hobby icon",
                        tint = colorResource(id = R.color.icon_color),
                        modifier = Modifier.size(24.dp).padding(end = 8.dp)
                    )
                    // Uso vertical Divider - separar iconos/Texto
                    VerticalDivider(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .height(24.dp),
                        color = Color.Gray,
                        thickness = 1.dp
                    )
                    Text(
                        text = hobby,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}