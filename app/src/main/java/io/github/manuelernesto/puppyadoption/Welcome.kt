package io.github.manuelernesto.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
                        fontWeight = FontWeight(600)
                    )

                    Text(
                        text = "We will help you to find your \n" +
                                "next best friend."
                    )
                }



                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth().padding(32.dp)
                )
                {
                    Text(text = "Start")
                }
            }
        }


    }
}