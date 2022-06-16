package com.model

import com.google.gson.annotations.SerializedName

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 4.06.2022                │
//└──────────────────────────┘
//Server'a Cevap
//Value tablo ismi
data class GameList(
    @SerializedName("results") val result: List<Game>
)