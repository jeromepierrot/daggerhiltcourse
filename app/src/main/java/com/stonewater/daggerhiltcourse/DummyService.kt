package com.stonewater.daggerhiltcourse

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class DummyService: Service() {
    @Inject
    lateinit var repository: DummyRepository

    override fun onCreate() {
        super.onCreate()
        /* service code here */
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}