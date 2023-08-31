package dev.sourabhkaushik.jetpackcomponse.screens

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import dev.sourabhkaushik.jetpackcomponse.R
import dev.sourabhkaushik.jetpackcomponse.ui.theme.JetPackComponseTheme
import dev.sourabhkaushik.jetpackcomponse.utils.NavigationState
import kotlinx.coroutines.delay

@Composable
fun Splash(modifier: Modifier = Modifier,navController: NavController) {
    LaunchedEffect(key1 = true){
        delay(3000)
        navController.navigate(NavigationState.ON_BOARDING)
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .fillMaxSize()
            .background(color = colorResource(R.color.colorPrimary), RectangleShape),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(147.dp)
                    .height(147.dp)
                    .padding(1.dp),
                painter = painterResource(id = R.drawable.ic_launcher),
                contentDescription = stringResource(id = R.string.icon)
            )
            Text(
                text = stringResource(id = R.string.app_name),
                style = TextStyle(
                    fontSize = 70.sp,
                    fontWeight = FontWeight(400),
                    color = colorResource(id = R.color.white),
                    textAlign = TextAlign.Center
                )
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(id = R.drawable.buildings_bg_1),
                contentDescription =stringResource(id = R.string.app_name),
                contentScale = ContentScale.FillWidth
            )

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Row (modifier =Modifier.fillMaxWidth()){
                Image(
                    modifier=Modifier.weight(0.4f) ,
                    painter = painterResource(id = R.drawable.building_bg_half_2),
                    contentDescription =stringResource(id = R.string.app_name),
                    contentScale = ContentScale.FillBounds
                )
                Image(
                    modifier=Modifier.weight(0.6f) ,
                    painter = painterResource(id = R.drawable.building_bg_half_1),
                    contentDescription =stringResource(id = R.string.app_name),
                    contentScale = ContentScale.FillBounds
                )
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComponseTheme {
        Splash(navController = rememberNavController())
    }
}