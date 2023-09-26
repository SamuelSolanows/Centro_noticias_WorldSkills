package com.example.centrodenoticiasdeworldskills.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.centrodenoticiasdeworldskills.R
import com.example.centrodenoticiasdeworldskills.databinding.FragmentHomeBinding


class home : Fragment() {
    lateinit var bindding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindding = FragmentHomeBinding.inflate(inflater, container, false)
        return bindding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}