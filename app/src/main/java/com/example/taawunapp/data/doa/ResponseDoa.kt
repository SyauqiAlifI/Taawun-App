package com.example.taawunapp.data.doa

import com.google.gson.annotations.SerializedName

data class ResponseDoa(

	@field:SerializedName("Response")
	val response: List<ResponseItemDoa?>? = null
)