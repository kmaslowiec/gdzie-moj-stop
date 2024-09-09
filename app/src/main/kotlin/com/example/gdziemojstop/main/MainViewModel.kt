package com.example.gdziemojstop.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gdziemojstop.preferences.FirstTimeAccessRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: FirstTimeAccessRepositoryImpl) : ViewModel() {

    val isFirstTimeAccess = repository.isFirstTimeAccess

    fun setFirstTimeAccessed() {
        viewModelScope.launch {
            repository.setFirstTimeAccess()
        }
    }
}
