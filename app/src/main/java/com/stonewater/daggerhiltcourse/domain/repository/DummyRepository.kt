package com.stonewater.daggerhiltcourse.domain.repository

interface DummyRepository {
    suspend fun doNetworkCall()
}