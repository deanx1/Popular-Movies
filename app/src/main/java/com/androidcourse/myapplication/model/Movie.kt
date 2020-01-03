package com.androidcourse.myapplication.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("backdrop_path") var backdrop_image_path: String,
    @SerializedName("poster_path") var poster_image_path: String,
    @SerializedName("title") var title: String,
    @SerializedName("release_date") var release_date: String,
    @SerializedName("vote_average") var average_rating: Double,
    @SerializedName("overview") var overview: String,
    var id: Int
): Parcelable {
    fun getBackdrop() = "https://image.tmdb.org/t/p/w500/$backdrop_image_path"

    fun getPoster() = "https://image.tmdb.org/t/p/w500/$poster_image_path"

}