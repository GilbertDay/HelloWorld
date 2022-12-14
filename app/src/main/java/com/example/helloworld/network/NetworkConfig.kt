package com.example.helloworld.network

import com.example.helloworld.model.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

class NetworkConfig {
        // set interceptor
        fun getInterceptor() : OkHttpClient {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
            return okHttpClient
        }

        fun getRetrofit() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://kpsi.fti.ukdw.ac.id/")
                .client(getInterceptor())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        fun getService() = getRetrofit().create(Users::class.java)
}
    interface Users {
        @GET("api/progmob/mhs/72200391")
        fun getMahasiswa(): Call<List<DataMahasiswaItem>>
        @POST("api/progmob/mhs/create")
        fun addMahasiswa(@Body req : ResponseAddMahasiswaItem): Call<ResponseAddMahasiswa>
        fun enqueue(callback: Callback<List<DataMahasiswaItem>>)
        @POST("api/progmob/mhs/delete")
        fun deleteMahasiswa(): Call<List<DataMahasiswaItem>>

    }
