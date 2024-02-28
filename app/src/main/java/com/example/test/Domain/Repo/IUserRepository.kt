package com.example.test.Domain.Repo

import com.example.test.Data.Remote.Entity.DBRandomUser
import com.example.test.Domain.Entity.RandomUser

interface IUserRepository {
    suspend fun getRandomUser():List<RandomUser>
    suspend fun getRandomUserFromDatabase():List<RandomUser>
    suspend fun insertRandomUserInDatabase(user: DBRandomUser)
    suspend fun updateUsersList(): List<RandomUser>
}