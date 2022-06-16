package com.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.model.Game
import com.model.GameList
import com.network.ApiUtils
import retrofit2.Call
import retrofit2.Response


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ       │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com                 │            
//│ ──────────────────────── │
//│ 8.06.2022                  │
//└──────────────────────────┘

class   MyViewModel : ViewModel() {

   var gameList=MutableLiveData<List<Game>>(listOf())
    fun getGameList() {
        ApiUtils.gameDAOGet().getGame().enqueue(
            object : retrofit2.Callback<GameList> {
                override fun onResponse(
                    //Başarılı cevap döndüğünde
                    call: Call<GameList>,
                    response: Response<GameList>
                ) {
                   response.body()?.result?.let {
                       gameList.value=it
                   }
                }
                override fun onFailure(call: Call<GameList>, t: Throwable) {
                     // Toast.makeText(this,"Error",Toast.LENGTH_LONG).show()
                }
            }
        )
    }
}