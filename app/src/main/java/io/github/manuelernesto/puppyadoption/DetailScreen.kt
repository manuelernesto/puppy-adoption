package io.github.manuelernesto.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import io.github.manuelernesto.puppyadoption.ui.data.puppies

@Composable
fun DetailScreen(navController: NavController?, puppyId: String?) {
    val puppy = puppies[puppyId?.toInt()!!]

    Column(modifier = Modifier.fillMaxSize()) {

        Surface(color = colorResource(id = puppy.bgColor), modifier = Modifier.fillMaxSize()) {
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()
            ) {
                Row {
                    Column(
                        modifier = Modifier.padding(top = 32.dp, start = 32.dp, end = 32.dp)
                    ) {
                        Image(
                            alignment = Alignment.CenterEnd,
                            painter = painterResource(id = puppy.bgImg),
                            contentDescription = null, modifier = Modifier.padding(
                                top = 16.dp, end = 16.dp
                            )
                        )
                    }

                }
                Card(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {

                            Text(
                                text = puppy.name,
                                fontSize = 20.sp,
                                fontWeight = FontWeight(600),
                                color = colorResource(id = R.color.color_txt),
                                modifier = Modifier.padding(start = 16.dp)
                            )

                            Image(
                                painter = painterResource(id = puppy.fav),
                                contentDescription = null,
                                alignment = Alignment.TopEnd,
                                modifier = Modifier.padding(end = 16.dp)

                            )
                        }

                        Text(
                            text = "Luanda, Angola",
                            color = colorResource(id = R.color.color_txt),
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 16.dp, top = 8.dp)
                        )

                        Row(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)) {
                            Text(
                                text = puppy.category, fontSize = 12.sp,
                                color = colorResource(id = R.color.color_txt),
                                modifier = Modifier.padding(start = 16.dp)
                            )

                            Text(
                                text = puppy.age, fontSize = 12.sp,
                                color = colorResource(id = R.color.color_txt),
                                modifier = Modifier.padding(start = 16.dp)
                            )

                        }

                        Text(
                            text = puppy.description, fontSize = 16.sp,
                            color = colorResource(id = R.color.color_txt),
                            modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
                        )

                        Button(
                            shape = RoundedCornerShape(10.dp),
                            onClick = { },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = puppy.color))
                        )
                        {
                            Text(
                                text = "Adoption me",
                                fontSize = 18.sp,
                                fontWeight = FontWeight(400),
                                color = colorResource(id = R.color.color_txt),
                                modifier = Modifier.padding(8.dp)
                            )
                        }

                    }

                }
            }


        }


    }
}