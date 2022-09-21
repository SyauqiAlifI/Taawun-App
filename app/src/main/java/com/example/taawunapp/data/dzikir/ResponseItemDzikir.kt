package com.example.taawunapp.data.dzikir

import com.google.gson.annotations.SerializedName

data class ResponseItemDzikir(

	@field:SerializedName("faedah")
	val faedah: String? = null,

	@field:SerializedName("latin")
	val latin: String? = null,

	@field:SerializedName("arti")
	val arti: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("arab")
	val arab: String? = null
)