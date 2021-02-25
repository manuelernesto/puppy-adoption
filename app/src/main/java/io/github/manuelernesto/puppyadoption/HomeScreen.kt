package io.github.manuelernesto.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.github.manuelernesto.puppyadoption.ui.component.PuppyListItem
import io.github.manuelernesto.puppyadoption.ui.data.puppies

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {

        Surface(color = colorResource(id = R.color.primary), modifier = Modifier.fillMaxSize()) {
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()
            ) {
                Row {
                    Column(
                        modifier = Modifier.padding(
                            start = 16.dp,
                            top = 16.dp,
                            bottom = 16.dp
                        )
                    ) {
                        Text(

                            text = "Your Best Friend\n" +
                                    "is waiting.",
                            fontSize = 30.sp,
                            fontWeight = FontWeight(600),
                            color = colorResource(id = R.color.color_txt)
                        )

                        Text(
                            text = "Let your love change \n" +
                                    "the world!",
                            fontSize = 18.sp,
                            color = colorResource(id = R.color.color_txt),
                            modifier = Modifier.padding(top = 16.dp)

                        )
                    }

                    Image(
                        alignment = Alignment.CenterEnd,
                        painter = painterResource(id = R.mipmap.logo_home),
                        contentDescription = null, modifier = Modifier.padding(
                            top = 16.dp, bottom = 16.dp, end = 16.dp
                        )
                    )

                }
                Card(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Location",
                            fontSize = 18.sp,
                            color = colorResource(id = R.color.color_txt),
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Row(
                            modifier = Modifier.padding(start = 8.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
                                contentDescription = null
                            )
                            Text(
                                text = "Luanda, Angola", fontSize = 12.sp,
                                color = colorResource(id = R.color.color_txt)
                            )

                        }

                        LazyColumn {
                            itemsIndexed(items = puppies) { index, puppy ->
                                PuppyListItem(navController = navController, puppy, index)
                            }
                        }
                    }

                }
            }


        }


    }
}