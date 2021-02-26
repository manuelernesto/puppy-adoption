package io.github.manuelernesto.puppyadoption.ui.composables

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import io.github.manuelernesto.puppyadoption.R
import io.github.manuelernesto.puppyadoption.ui.data.Puppy


@Composable
fun PuppyListItem(navController: NavController, puppy: Puppy, index: Int) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(159.dp)
            .padding(16.dp)
            .clickable {
                navController.navigate("detail_screen/$index")
            }
    ) {

        PuppyPhotoCard(puppy)
        PuppyDescriptionCard(puppy)
    }

}

@Composable
fun PuppyPhotoCard(puppy: Puppy) {
    Card(
        backgroundColor = colorResource(id = puppy.color)
    ) {
        Image(
            painter = painterResource(id = puppy.img),
            contentDescription = null,
            modifier = Modifier.padding(5.dp)
        )
    }
}

@Composable
fun PuppyDescriptionCard(puppy: Puppy) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(133.dp)
            .padding(top = 13.dp, bottom = 13.dp)
            .clip(shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)),
        color = colorResource(id = puppy.bgColor)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            Column(
                modifier = Modifier.padding(5.dp)
            ) {
                Text(
                    text = puppy.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    color = colorResource(id = R.color.color_txt),
                    modifier = Modifier.padding(top = 16.dp)
                )

                Text(
                    text = puppy.category,
                    fontSize = 15.sp,
                    color = colorResource(id = R.color.color_txt),
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = puppy.age,
                    fontSize = 10.sp,
                    color = colorResource(id = R.color.color_txt)
                )
            }

        }
    }
}