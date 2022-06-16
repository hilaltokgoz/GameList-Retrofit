package com.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 4.06.2022                │
//└──────────────────────────┘
//Api da hangi veriler var.

data class Game(
    val id:Int,
    val name:String,
    val background_image:String,
    val rating:Float,
    val rating_top:Int
):Serializable

