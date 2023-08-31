package dev.sourabhkaushik.jetpackcomponse.screens

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.sourabhkaushik.jetpackcomponse.ui.theme.JetPackComponseTheme
import kotlinx.coroutines.delay

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier,navController: NavController){
    mainOnBoardingScreen()
}
@Composable
fun mainOnBoardingScreen(){
    Text(text = "onBoarding",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight())
}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreen1Preview() {
    JetPackComponseTheme {
        OnBoardingScreen(navController = rememberNavController())
    }
}
