package com.example.taawunapp.network.jadwal

import com.example.taawunapp.data.jadwalsholat.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JadwalSholatService {
    @GET("sholat/jadwal/{idkota}/{tahun}/{bulan}/{tanggal}")
    fun getJadwalSholat(
        @Path("idkota") idKota: String,
        @Path("tahun") tahun: String,
        @Path("bulan") bulan: String,
        @Path("tanggal") tanggal: String
    ) : Call<ArrayList<Data>>
}