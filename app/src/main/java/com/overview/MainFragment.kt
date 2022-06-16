package com.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.gamelist.GameAdapter
import com.gamelist.R
import com.gamelist.databinding.FragmentMainBinding
import com.model.Game
import com.model.GameList
class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    val gameViewModel:  MyViewModel by viewModels()
    private val gameAdapter = GameAdapter(mutableListOf())
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_detailFragment)
        }
        gameViewModel.getGameList()
        initRecyclerView()
        observeData()
    }
    private fun observeData(){
        gameViewModel.gameList.observe(viewLifecycleOwner) {
            gameAdapter.updateGame(it)
        }
    }
    private fun initRecyclerView() {
        // recyclerView Ayarları
        binding.rvGameList.adapter = gameAdapter
        binding.rvGameList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvGameList.setHasFixedSize(true)
    }
    override fun onStop() {
        super.onStop()
        requireActivity().finish()
    }
}