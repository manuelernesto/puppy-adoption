package io.github.manuelernesto.puppyadoption.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import io.github.manuelernesto.puppyadoption.R


@Composable
fun PuppyListItem(navController: NavController) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(159.dp)
            .padding(16.dp)
            .clickable {
                navController.navigate("detail_screen/manuel")
            }
    ) {

        Card(
            backgroundColor = colorResource(id = R.color.color_primary_1)
        ) {
            Image(
                painter = painterResource(id = R.mipmap.dobermann),
                contentDescription = null,
                modifier = Modifier.padding(5.dp)
            )
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(133.dp)
                .padding(top = 13.dp, bottom = 13.dp)
                .clip(shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)),
            color = colorResource(id = R.color.color_secondary_1)
        ) {
            Column(modifier = Modifier.padding(5.dp)) {
                Text(text = "Mandy")
                Text(text = "Rottweiler")
                Text(text = "1 year old")
            }
        }
    }

}