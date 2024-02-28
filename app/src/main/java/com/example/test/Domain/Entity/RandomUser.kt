package com.example.test.Domain.Entity

import com.example.test.Data.Remote.Entity.Dob
import com.example.test.Data.Remote.Entity.Location
import com.example.test.Data.Remote.Entity.Name
import com.example.test.Data.Remote.Entity.Picture

data class RandomUser(
    val id:Int,
    val gender:String,
    val name: String,
    val location: String,
    val email:String,
    val dob: String,
    val age:String,
    val phone:String,
    val picture: String,
    val nat:String
)

