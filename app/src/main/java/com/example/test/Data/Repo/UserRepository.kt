package com.example.test.Data.Repo

import com.example.test.Data.DataSource.RemoteDataSource
import com.example.test.Data.Database.AppDatabase
import com.example.test.Data.Remote.Entity.DBRandomUser
import com.example.test.Data.Remote.Entity.toDBRandomUser
import com.example.test.Data.Remote.Entity.toRandomUser
import com.example.test.Domain.Entity.RandomUser
import com.example.test.Domain.Repo.IUserRepository

class UserRepository(
    private val source:RemoteDataSource,
    private val database: AppDatabase
): IUserRepository {
    override suspend fun getRandomUser(): List<RandomUser> {
        val dbUsers = getRandomUserFromDatabase()
        return dbUsers.ifEmpty {
            val result = source.getUsers()
            return result.map {
                database.getRandomUserDao().insertNewUsers(it.toDBRandomUser())
                it.toRandomUser()
            }
        }
    }

    override suspend fun getRandomUserFromDatabase(): List<RandomUser> {
        return database.getRandomUserDao().getFullUserInfo().map {
            it.toRandomUser()
        }
    }

    override suspend fun insertRandomUserInDatabase(user: DBRandomUser) {
        database.getRandomUserDao().insertNewUsers(user)
    }

    override suspend fun updateUsersList() : List<RandomUser>{
        database.getRandomUserDao().dropTableList()
        return getRandomUser()
    }
}


