package com.example.taawunapp.data.dzikir

import com.google.gson.annotations.SerializedName

data class ResponseDzikir(

	@field:SerializedName("Response")
	val response: List<ResponseItemDzikir?>? = null
)