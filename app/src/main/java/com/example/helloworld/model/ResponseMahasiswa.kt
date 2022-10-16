package com.example.helloworld.model

import com.google.gson.annotations.SerializedName

data class ResponseMahasiswa(

    @field:SerializedName("ResponseMahasiswa")
    val responseMahasiswa: List<ResponseMahasiswaItem?>? = null
)

data class ResponseMahasiswaItem(

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