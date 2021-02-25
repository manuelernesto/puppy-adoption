package io.github.manuelernesto.puppyadoption.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.github.manuelernesto.puppyadoption.R


@Composable
fun PuppyListItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(159.dp)
            .padding(16.dp)
    ) {
        Card(backgroundColor = colorResource(id = R.color.purple_200)) {
            Image(
                painter = painterResource(id = R.mipmap.dobermann),
                contentDescription = null
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(133.dp)
                .padding(top = 13.dp, bottom = 13.dp)
                .clip(shape = RoundedCornerShape(topStart = 0.dp))
        ) {
            Column(modifier = Modifier.padding(5.dp)) {
                Text(text = "Mandy")
                Text(text = "Rottweiler")
                Text(text = "1 year old")
            }
        }
    }

}