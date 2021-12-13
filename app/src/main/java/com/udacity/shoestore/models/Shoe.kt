package com.udacity.shoestore.models

import android.os.Parcelable
import androidx.databinding.BaseObservable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Shoe(var name: String, var size: String, var company: String, var description: String) : Parcelable