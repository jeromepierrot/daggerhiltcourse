package com.stonewater.daggerhiltcourse.data.remote

import retrofit2.http.GET

interface DummyApi {
    @GET("test")
    suspend fun doNetworkCall()
}