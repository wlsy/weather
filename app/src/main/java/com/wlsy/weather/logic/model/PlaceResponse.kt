package com.wlsy.weather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(
    /**
     * 请求状态
     */
    val status: String,
    /**
     * 地区信息
     */
    val places: List<Place>
)

data class Place(
    /**
     * 地区名称
     */
    val name: String,
    /**
     * 地区经纬度
     */
    val location: Location,
    /**
     * 地址
     */
    @SerializedName("formatted_address") val address: String
)

data class Location(
    /**
     * 经度
     */
    val lng: String,
    /**
     * 纬度
     */
    val lat: String
)