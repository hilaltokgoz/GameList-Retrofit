package com.network

import com.model.GameList
import retrofit2.http.GET
import retrofit2.http.Query


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 4.06.2022                │
//└──────────────────────────┘
// Retrofitin HTTP isteklerini kullanarak nasıl server ile iletişim kuracağını belirleyeceğimiz yer.
//Rest Mimarisin de tek tip Interface vardır (Get,Post,Put,Delete i kullanır.)

//Game bilgilerini çekecek fonksiyon Dao içinde yazılır.
interface GameDAO {
    @GET("games")
    fun getGame(
        @Query("key") key: String = "79dedefa6e87462c8c5c97bc19089451"
    ): retrofit2.Call<GameList>
}