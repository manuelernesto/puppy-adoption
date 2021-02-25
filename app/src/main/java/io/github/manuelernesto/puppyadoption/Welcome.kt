package io.github.manuelernesto.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Welcome() {
    Column(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.mipmap.logo_welcome),
            contentDescription = null
        )

        Surface(color = colorResource(id = R.color.primary), modifier = Modifier.fillMaxSize()) {
            Column(

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()
            ) {
                Column {
                    Text(

                        text = "Find your next\n" +
                                "best friend",
                        fontSize = 30.sp,
                        fontWeight = FontWeight(600),
                        color = colorResource(id = R.color.color_txt)
                    )

                    Text(
                        text = "We will help you to find your \n" +
                                "next best friend.",
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.color_txt),
                        modifier = Modifier.padding(top = 16.dp)

                    )
                }


                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.green_btn))
                )
                {
                    Text(
                        text = "Start",
                        fontSize = 25.sp,
                        fontWeight = FontWeight(600),
                        color = colorResource(id = R.color.color_txt),
                        modifier = Modifier.padding(8.dp)
                    )
                }

            }

        }


    }
}