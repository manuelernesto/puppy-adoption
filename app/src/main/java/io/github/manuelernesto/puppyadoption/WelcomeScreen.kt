package io.github.manuelernesto.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate


@Composable
fun Welcome(navController: NavController) {
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

                        text = "Find your next\nbest friend",
                        fontSize = 30.sp,
                        fontWeight = FontWeight(600),
                        color = colorResource(id = R.color.color_txt)
                    )

                    Text(
                        text = "We will help you to find your \nnext best friend.",
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.color_txt),
                        modifier = Modifier.padding(top = 16.dp)

                    )
                }


                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = { navController.navigate("home_screen") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.green_btn))
                )
                {
                    Text(
                        text = stringResource(R.string.btn_start_txt),
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