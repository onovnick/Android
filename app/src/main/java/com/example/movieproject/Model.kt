package com.example.movieproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Model(val title:String ,val description:String,val imageURL:String):Parcelable {
}