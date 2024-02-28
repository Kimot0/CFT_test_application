package com.example.test.Data.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.test.Data.Remote.Entity.DBRandomUser

@Dao
interface RandomUserDao {
    @Query("""Select * from RandomUsers""")
    suspend fun getFullUserInfo():List<DBRandomUser>

    @Upsert
    suspend fun insertNewUsers(user: DBRandomUser)

    @Query("""Delete from RandomUsers""")
    suspend fun dropTableList()
}
