package com.stonewater.daggerhiltcourse

import androidx.lifecycle.ViewModel
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor (
    private val repository: DummyRepository
): ViewModel() {

}