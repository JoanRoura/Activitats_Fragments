package com.example.projecte_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.projecte_fragments.databinding.FragmentTornarBinding

class FragmentTornar : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTornarBinding>(inflater, R.layout.fragment_tornar,container,false);

        binding.button.setOnClickListener{}

        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragmentTornar_to_fragmentInici);
        }

        return binding.root

    }



}