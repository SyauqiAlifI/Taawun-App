package com.example.taawunapp.network.doa

import com.example.taawunapp.data.doa.DoaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DoaService {
    @GET("api")
    fun getAllDoa(): Call<ArrayList<DoaResponse>>

    @GET("api/doa/{namaDoa}")
    fun searchDoa(
        @Path("namaDoa")
        namaDoa: String
    ) : Call<ArrayList<DoaResponse>>
}