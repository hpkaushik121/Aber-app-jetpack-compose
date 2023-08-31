package dev.sourabhkaushik.jetpackcomponse.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.sourabhkaushik.jetpackcomponse.screens.OnBoardingScreen
import dev.sourabhkaushik.jetpackcomponse.screens.Splash
import dev.sourabhkaushik.jetpackcomponse.utils.NavigationState

@Composable
fun APP(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationState.INIT) {
        navigation(
            startDestination = NavigationState.SPLASH,
            route = NavigationState.INIT ) {
            composable(NavigationState.SPLASH) {
                Splash(navController = navController)
            }
        }
        onBoardingGraph(navController)
    }

}
fun NavGraphBuilder.onBoardingGraph(navController: NavHostController) {
    navigation(startDestination =NavigationState.ON_BOARDING_1,route=NavigationState.ON_BOARDING){
        composable(NavigationState.ON_BOARDING_1){
            OnBoardingScreen(navController = navController)
        }

    }
}

@Composable
inline fun <reified T:ViewModel> NavBackStackEntry.navigationViewModel(navController: NavHostController) : T{
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}