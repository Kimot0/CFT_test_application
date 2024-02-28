package com.example.test.Data.Remote.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.test.Domain.Entity.RandomUser

@Entity(
    tableName = "RandomUsers"
)
data class DBRandomUser(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    @ColumnInfo(name = "gender") val gender:String,
    @ColumnInfo(name = "photo") val photo:String,
    @ColumnInfo(name = "fio") val fio:String,
    @ColumnInfo(name = "phone") val phone:String,
    @ColumnInfo(name = "address") val address:String,
    @ColumnInfo(name = "email") val email:String,
    @ColumnInfo(name = "dob") val dob:String,
    @ColumnInfo(name = "age") val age:String,
    @ColumnInfo(name = "nat") val nat:String,
)
fun DBRandomUser.toRandomUser() = RandomUser(
    id = this.id,
    gender = this.gender,
    name = this.fio,
    location = this.address,
    email = this.email,
    dob = this.dob,
    age = this.age,
    phone = this.phone,
    picture = this.photo,
    nat = this.nat
)