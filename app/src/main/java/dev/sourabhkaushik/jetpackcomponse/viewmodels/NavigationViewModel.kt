package dev.sourabhkaushik.jetpackcomponse.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import dev.sourabhkaushik.jetpackcomponse.utils.NavigationState
import dev.sourabhkaushik.jetpackcomponse.utils.States
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class NavigationViewModel(private val mParam: Map<String, Any>):ViewModel() {
    fun initSplash(navController: NavHostController) {
        viewModelScope.launch{
            delay(3000)
            navController.navigate(NavigationState.ON_BOARDING)
        }
    }

    fun startOnBoarding(navController: NavHostController) {
       viewModelScope.launch {
            delay(1000)
            navController.navigate(NavigationState.ON_BOARDING_2)
            delay(1000)
            navController.navigate(NavigationState.ON_BOARDING_3)
        }
    }

}