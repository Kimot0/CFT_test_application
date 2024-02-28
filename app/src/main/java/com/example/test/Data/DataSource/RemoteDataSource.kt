package com.example.test.Data.DataSource

import com.example.test.Data.Remote.Entity.ApiRandomUser

class RemoteDataSource(private val usersAPI: UsersAPI) {
    suspend fun getUsers(): List<ApiRandomUser> {
        val response = usersAPI.getUsers()
        if(response.isSuccessful){
            response.body()?.let {
                return it.users
            }
        }
        throw RuntimeException("Error while loading user from remote source")
    }
}