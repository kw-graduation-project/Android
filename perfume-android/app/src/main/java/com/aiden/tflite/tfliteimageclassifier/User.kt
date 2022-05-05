package com.aiden.tflite.tfliteimageclassifier

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    var name: String,
    val cost: String,
    val scent: String,
    val memo: String
){
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}

