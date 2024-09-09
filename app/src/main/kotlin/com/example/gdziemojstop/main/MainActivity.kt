package com.example.gdziemojstop.main

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.core.app.ActivityCompat
import androidx.lifecycle.lifecycleScope
import com.example.gdziemojstop.navigation.AppNavigation
import com.example.gdziemojstop.ui.theme.GdzieMojStopTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    private val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                //TODO if access is granted
            } else {
                //TODO if access is denied the user is directed to explanation screen. App is useful only with the location
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            mainViewModel.isFirstTimeAccess.collect { isFirstTimeAccess ->
                if (isFirstTimeAccess) {
                    mainViewModel.setFirstTimeAccessed()
                }
            }


            when {
                ActivityCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED -> {
                    //TODO direct to the home screen
                }

                ActivityCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_DENIED -> {
                    //TODO direct to the explanation screen (the app has no sense without the location) with the option to access the location settings
                }

                shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_FINE_LOCATION) -> {
                    //TODO implement custom dialog to request the permission
                }

                else -> {
                    requestPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
                }
            }
            mainViewModel.setFirstTimeAccessed()
        }

            setContent {
                MyApp {
                    AppNavigation()
                }
            }

    }

    @Composable
    fun MyApp(content: @Composable () -> Unit) {
        GdzieMojStopTheme {
            content()
        }
    }
}
