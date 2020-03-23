package com.example.blocodenotas.ui

import android.os.Bundle
import com.example.blocodenotas.R
import com.example.blocodenotas.di.DaggerAppComponent
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
