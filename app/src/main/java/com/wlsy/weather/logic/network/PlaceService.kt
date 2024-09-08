package com.wlsy.weather.logic.network

import com.wlsy.weather.WeatherApplication
import com.wlsy.weather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    /**
     * 搜索城市数据
     */
    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}