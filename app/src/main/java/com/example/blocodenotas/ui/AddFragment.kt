package com.example.blocodenotas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.blocodenotas.R
import com.example.blocodenotas.util.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_add.*
import javax.inject.Inject

class AddFragment : DaggerFragment() {
    lateinit var noteViewModel: NoteViewModel

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add, container, false)
        setupViewModel()
        btnAdd.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.container).popBackStack()


        }

    }

    private fun setupViewModel() {
        noteViewModel =
            ViewModelProvider(this, viewModelProviderFactory).get(NoteViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}