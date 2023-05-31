package com.stonewater.daggerhiltcourse

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class DummyService @Inject constructor( // NOT POSSIBLE as a service CANNOT have a constructor
    private val repository: DummyRepository
): Service() {


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}