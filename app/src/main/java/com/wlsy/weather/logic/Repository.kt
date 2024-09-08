package com.wlsy.weather.logic

import androidx.lifecycle.liveData
import com.wlsy.weather.logic.model.Place
import com.wlsy.weather.logic.network.WeatherNetwork
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher

object Repository {

    fun searchPlace(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = WeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(java.lang.RuntimeException("响应状态是：${placeResponse.status}"))
            }
        } catch (e: java.lang.Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}