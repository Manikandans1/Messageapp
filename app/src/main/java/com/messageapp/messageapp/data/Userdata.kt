package com.messageapp.messageapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.messageapp.messageapp.R

data class Userdata(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    val hobbies: Int
)
val userdatas = listOf(
    Userdata(R.drawable.animal1, R.string.name1, 2, R.string.hobbies1),
    Userdata(R.drawable.animal2, R.string.name2, 3, R.string.hobbies2),
    Userdata(R.drawable.animal3, R.string.name3, 4, R.string.hobbies3),
)
