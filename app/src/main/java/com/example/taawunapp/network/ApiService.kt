package com.example.taawunapp.network

import com.example.taawunapp.data.Data
import com.example.taawunapp.data.doa.ResponseDoa
import com.example.taawunapp.data.doa.ResponseItemDoa
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("sholat/jadwal/{idkota}/{tahun}/{bulan}")
    fun getJadwalSholat(
        @Path("idkota")
        idKota: String,
        @Path("tahun")
        tahun: String,
        @Path("bulan")
        bulan: String
    ) : Call<ArrayList<Data>>

    @GET("api")
    fun getDoa() : Call<ArrayList<ResponseDoa>>
}