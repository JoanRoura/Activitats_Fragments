package com.example.projecte_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import com.example.projecte_fragments.databinding.FragmentIniciBinding

class FragmentInici : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentIniciBinding>(inflater, R.layout.fragment_inici,container,false)




        val spinner: Spinner = findViewById(R.id.spinner)

        ArrayAdapter.createFromResource(this, R.array.fragments_array, android.R.layout.simple_spinner_item).also {
                adapter ->

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spinner.adapter = adapter
        }

        return binding.root


    }
}