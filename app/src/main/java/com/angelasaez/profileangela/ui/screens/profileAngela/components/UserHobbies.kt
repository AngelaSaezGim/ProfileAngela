package com.angelasaez.profileangela.ui.screens.profileAngela.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.profileangela.R
import com.angelasaez.profileangela.model.User

@Composable
fun UserHobbies(user: User) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Hobbies de ${user.userName}",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        //Uso lazy column por si en el futuro querriamos agregar mas hobbies
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            //Itero sobre la lista de hobbies y agrego imagenes de iconos que he guardado con ese nombre
            items(user.userHobbies) { hobby ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 3.dp, horizontal = 15.dp)
                        .border(1.dp, Color.Black)
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_fitness_center_24),
                        contentDescription = "Hobby icon",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(end = 8.dp)
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