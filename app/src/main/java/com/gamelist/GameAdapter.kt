package com.gamelist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gamelist.databinding.ItemDesignBinding
import com.model.Game
import com.squareup.picasso.Picasso

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.co   │
//│ ──────────────────────── │
//│ 4.06.2022                │
//└──────────────────────────┘

class GameAdapter(private var gameList: MutableList<Game>):
RecyclerView.Adapter<GameAdapter.GameViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
       val layoutInflater=LayoutInflater.from(parent.context)
       val view=ItemDesignBinding.inflate(layoutInflater,parent,false)
       return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
       val gameData: Game =gameList[position]
        holder.gameCardBinding.apply {
            tvId.text=gameList[position].id.toString()
             tvGameName.text=gameList[position].name
              Picasso.get().load(gameList[position].background_image).into(ivGameImage)
        }
    }
    override fun getItemCount(): Int =gameList.size

    class GameViewHolder(val gameCardBinding: ItemDesignBinding):
        RecyclerView.ViewHolder(gameCardBinding.root)

  fun updateGame(newGameList: List<Game>){
      gameList.clear()
      gameList.addAll(newGameList)
      notifyDataSetChanged()

  }


}