package com.example.test.Data.DataSource

import com.example.test.Data.Remote.Entity.Result
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

interface UsersAPI {

    @GET("api/?results=10")
    suspend fun getUsers(): Response<Result>

    companion object {
        private const val CONNECTION_TIMEOUT_IN_SECONDS = 30L
        private const val BASE_URL = "https://randomuser.me/"
        fun provideUsersApi(): UsersAPI {

            val client = OkHttpClient.Builder()
                .callTimeout(CONNECTION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .readTimeout(CONNECTION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .writeTimeout(CONNECTION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(UsersAPI::class.java)
        }
    }
}