package com.example.helloworld.model

import com.google.gson.annotations.SerializedName

data class DataMahasiswa(

	@field:SerializedName("DataMahasiswa")
	val dataMahasiswa: List<DataMahasiswaItem?>? = null
)

data class DataMahasiswaItem(

	@field:SerializedName("nim")
	val nim: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("foto")
	val foto: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null
)
