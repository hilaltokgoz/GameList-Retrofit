package com.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 4.06.2022                  │
//└──────────────────────────┘
//Retrofit Objesi Oluşturma
class RetrofitClient {
    companion object{
        fun getClient(baseUrl:String):Retrofit{
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory( //verileri nasıl dönüştüreceğiz
                    GsonConverterFactory //json olarak alınan veileri kullanılabilir şekilde çevirecek
                        .create()
                )
                .build()
        }
    }
}