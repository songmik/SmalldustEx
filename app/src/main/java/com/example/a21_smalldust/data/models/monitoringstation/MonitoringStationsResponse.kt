package com.example.a21_smalldust.data.models.monitoringstation

import com.google.gson.annotations.SerializedName

data class MonitoringStationsResponse(
    @SerializedName("response")
    val response: Response?
)