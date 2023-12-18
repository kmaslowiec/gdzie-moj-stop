package com.example.gdziemojstop.stops.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gdziemojstop.api.NetworkResult
import com.example.gdziemojstop.stops.repository.StopRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StopViewModel @Inject constructor(private val repo: StopRepository) : ViewModel() {

    init {
        viewModelScope.launch {
            when (val response = repo.fetchStops()) {
                is NetworkResult.Success -> Log.d("Bughunt", "SUCCESS ${response.data} ")
                is NetworkResult.Error -> Log.e("Bughunt", "ERROR ${response.code} and message ${response.message}")
                is NetworkResult.Exception -> Log.e("Bughunt", "EXCEPTION ${response.e.message}")
            }
        }
    }
}
