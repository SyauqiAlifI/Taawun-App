package com.example.taawunapp.data.jadwalsholat

import com.google.gson.annotations.SerializedName

data class JadwalSholatResponse(
	@field:SerializedName("data")
	val data: Data? = null,
)