package com.example.taawunapp.ui.dzikir

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.taawunapp.R
import com.example.taawunapp.databinding.FragmentDzikirBinding

class DzikirFragment : Fragment() {

    private var _binding: FragmentDzikirBinding? = null
    private val binding get() = _binding as FragmentDzikirBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDzikirBinding.inflate(layoutInflater, container, false)
        val dzikirViewModel = ViewModelProvider(this)[DzikirViewModel::class.java]
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}