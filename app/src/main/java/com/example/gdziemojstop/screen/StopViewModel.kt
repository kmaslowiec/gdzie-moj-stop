package com.example.gdziemojstop.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gdziemojstop.repository.StopRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StopViewModel @Inject constructor(private val repo: StopRepository) : ViewModel() {

    //todo add flow
    init {
        viewModelScope.launch {
            val stops = repo.getSops()

            Log.d("Bughunt", "$stops ")
            Log.d("Bughunt", "${stops.data.size} ")
        }
    }
}