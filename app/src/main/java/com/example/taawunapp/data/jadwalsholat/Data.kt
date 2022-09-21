package com.example.taawunapp.data.jadwalsholat

import com.google.gson.annotations.SerializedName

data class Data(
	@field:SerializedName("jadwal")
	val jadwal: List<JadwalItem?>? = null,

	@field:SerializedName("id")
	val id: String? = null,
)