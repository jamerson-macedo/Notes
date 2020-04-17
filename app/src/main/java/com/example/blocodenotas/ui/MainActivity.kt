package com.example.blocodenotas.ui

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.blocodenotas.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = findNavController(R.id.container)
        fab.setOnClickListener {
            // proxima activity
            navController.navigate(R.id.action_listFragment_to_addFragment)
            fab.hide()
        }
    }

    fun showfloatactionbuttun() {
        fab.show()
        fab.visibility = View.VISIBLE
    }
}
