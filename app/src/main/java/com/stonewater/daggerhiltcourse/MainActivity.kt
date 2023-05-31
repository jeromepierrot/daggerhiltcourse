package com.stonewater.daggerhiltcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.stonewater.daggerhiltcourse.ui.theme.DaggerhiltcourseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerhiltcourseTheme {
                val viewModel = hiltViewModel<DummyViewModel>()
            }
        }
    }
}