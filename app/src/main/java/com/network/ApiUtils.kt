package com.network


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 4.06.2022                  │
//└──────────────────────────┘

class ApiUtils {
    companion object{
        private const val  BASE_URL="https://api.rawg.io/api/"
        fun gameDAOGet():GameDAO{ //Dao isteğini çek retrofite gönder
            return RetrofitClient.getClient(BASE_URL).create(GameDAO::class.java)
        }
    }
}