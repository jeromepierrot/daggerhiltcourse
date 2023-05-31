package com.stonewater.daggerhiltcourse

import androidx.lifecycle.ViewModel
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository
import dagger.Lazy // the Lazy interface is from Dagger library (NOT Kotlin one)
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor (
    private val repository: Lazy<DummyRepository>
): ViewModel() {

    init {
        repository.get()
        println("[Message]: Lazy injection")
    }
}