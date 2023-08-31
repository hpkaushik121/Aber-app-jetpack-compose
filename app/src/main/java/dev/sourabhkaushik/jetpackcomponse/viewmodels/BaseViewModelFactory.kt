package dev.sourabhkaushik.jetpackcomponse.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class BaseViewModelFactory(
    private val mParam: Map<String, Any>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        when {
            modelClass.isAssignableFrom(NavigationViewModel::class.java) -> {
                return NavigationViewModel(mParam) as T
            }

            else -> throw IllegalArgumentException("Unknown ViewModel class")
        }

    }
}