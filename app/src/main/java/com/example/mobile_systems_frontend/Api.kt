package com.example.mobile_systems_frontend

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.mobile_systems_frontend.Results

interface Api {
    @GET("/startingMap")
    suspend fun getMap() : Response<Results>
}