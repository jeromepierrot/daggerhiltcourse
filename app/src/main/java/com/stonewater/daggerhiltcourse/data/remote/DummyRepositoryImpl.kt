package com.stonewater.daggerhiltcourse.data.remote

import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository

class DummyRepositoryImpl: DummyRepository {
    override suspend fun doNetworkCall() {

    }
}