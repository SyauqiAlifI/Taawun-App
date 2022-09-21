package com.example.taawunapp.data.doa

import com.google.gson.annotations.SerializedName

data class ResponseItemDoa(

	@field:SerializedName("ayat")
	val ayat: String? = null,

	@field:SerializedName("doa")
	val doa: String? = null,

	@field:SerializedName("artinya")
	val artinya: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("latin")
	val latin: String? = null
)