package com.example.androidlesson10.Models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (val name:String?=null,@DrawableRes val image: Int?=null ):Parcelable {
}