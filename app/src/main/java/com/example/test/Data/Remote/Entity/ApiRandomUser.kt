package com.example.test.Data.Remote.Entity

import com.example.test.Domain.Entity.RandomUser
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.JsonClass

data class Result(
    @SerializedName("results")
    @Expose
    val users:List<ApiRandomUser>
)

data class ApiRandomUser(
    @SerializedName("gender")
    @Expose
    val gender:String,
    @SerializedName("name")
    @Expose
    val name:Name,
    @SerializedName("location")
    @Expose
    val location:Location,
    @SerializedName("email")
    @Expose
    val email:String,
    @SerializedName("dob")
    @Expose
    val dob:Dob,
    @SerializedName("phone")
    @Expose
    val phone:String,
    @SerializedName("picture")
    @Expose
    val picture:Picture,
    @SerializedName("nat")
    @Expose
    val nat:String
)

data class Name(
    @SerializedName("title")
    @Expose
    val title:String,
    @SerializedName("first")
    @Expose
    val first:String,
    @SerializedName("last")
    @Expose
    val last:String
)

@JsonClass(generateAdapter = true)
data class Location(
    @SerializedName("street")
    @Expose
    val street:Street,
    @SerializedName("city")
    @Expose
    val city:String,
    @SerializedName("state")
    @Expose
    val state:String,
    @SerializedName("country")
    @Expose
    val country:String,
    @SerializedName("coordinates")
    @Expose
    val coordinates:Coordinates,
)

data class Coordinates(
    @SerializedName("latitude")
    @Expose
    val latitude:String,
    @SerializedName("longitude")
    @Expose
    val longitude:String
)

data class Street(
    @SerializedName("number")
    @Expose
    val number:Int,
    @SerializedName("name")
    @Expose
    val name:String
)

data class Dob(
    @SerializedName("date")
    @Expose
    val date:String,
    @SerializedName("age")
    @Expose
    val age:Int
)

data class Picture(
    @SerializedName("large")
    @Expose
    val large:String,
    @SerializedName("medium")
    @Expose
    val medium:String,
    @SerializedName("thumbnail")
    @Expose
    val thumbnail:String
)

fun ApiRandomUser.toRandomUser() = RandomUser(
    gender = this.gender,
    name = "${this.name.title} ${this.name.first} ${this.name.last}",
    location = "${this.location.country}, ${this.location.state}, ${this.location.city}" +
            "${this.location.street.name}, ${this.location.street.number} " +
            "${this.location.coordinates.longitude}, ${this.location.coordinates.latitude}",
    email = this.email,
    dob = this.dob.date,
    age = this.dob.age.toString(),
    phone = this.phone,
    picture = this.picture.large,
    nat = this.nat,
    id = this.toDBRandomUser().id
)

fun ApiRandomUser.toDBRandomUser() = DBRandomUser(
    photo = this.picture.large,
    fio = "${this.name.title} ${this.name.first} ${this.name.last}",
    phone = this.phone,
    address = "${this.location.country}, ${this.location.state}, ${this.location.city}" +
            "${this.location.street.name}, ${this.location.street.number}," +
            "${this.location.coordinates.longitude}, ${this.location.coordinates.latitude}",
    email = this.email,
    dob = this.dob.date,
    gender = this.gender,
    age = this.dob.age.toString(),
    nat = this.nat
)