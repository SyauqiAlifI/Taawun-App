package com.example.taawunapp.network

import com.example.taawunapp.data.Data
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("Jadwalsholat")
    fun getListUser() : Call<ArrayList<Data>>

}