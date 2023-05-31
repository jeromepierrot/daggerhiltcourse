package com.stonewater.daggerhiltcourse.data.remote

import android.app.Application
import com.stonewater.daggerhiltcourse.R
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository

class DummyRepositoryImpl(
    private val api: DummyApi,
    private val appContext: Application
): DummyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Un petit Bonjour du repository. Le nom de l'application est $appName")
    }
    override suspend fun doNetworkCall() {

    }
}