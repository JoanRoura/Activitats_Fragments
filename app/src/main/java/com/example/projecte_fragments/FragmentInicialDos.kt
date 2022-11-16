package com.example.projecte_fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.projecte_fragments.databinding.FragmentInicialDosBinding


class FragmentInicialDos : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentInicialDosBinding>(inflater,
            R.layout.fragment_inicial_dos,container,false)

        val spinner: Spinner = binding.fragmentsSpinner

        var llistaItems = arrayOf("Selecciona", "Llistat", "Botó", "Buit")

        spinner.adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, llistaItems);

        spinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long  ) {
                var paginaNavegar: Int? = null

                when (spinner.selectedItem) {
                    "Llistat" -> paginaNavegar = R.id.action_fragmentInici_to_fragmentLlistat
                    "Botó" -> paginaNavegar = R.id.action_fragmentInici_to_fragmentBoto
                    "Buit" -> paginaNavegar = R.id.action_fragmentInici_to_fragmentBuit
                    else -> paginaNavegar = null
                }

                if (paginaNavegar != null) view?.findNavController()?.navigate(paginaNavegar)

                spinner.setSelection(0);
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {

            }
        });

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.opcions_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)





    }
}