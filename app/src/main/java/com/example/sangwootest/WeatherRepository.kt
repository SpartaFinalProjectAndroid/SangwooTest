package com.example.sangwootest

class WeatherRepository {
    private val apiKey: String = "e0af01129f537945f596a7ebcaf95d91"
    private val client = RetrofitInstance.createApi()

    suspend fun getCurrentList(id: Int) = client.getCurrentList(id, apiKey)

    suspend fun getWeekendList(id: Int) = client.getWeekendList(id, apiKey)

}