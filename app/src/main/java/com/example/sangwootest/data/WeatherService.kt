package com.example.sangwootest.data

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("weather")
    suspend fun getCurrentList(
        @Query("id") id: Int,
        @Query("appid") apiKey: String
    ): WeatherData

    @GET("forecast")
    suspend fun getWeekendList(
        @Query("id") id: Int,
        @Query("appid") apiKey: String
    ): WeatherForecast

}