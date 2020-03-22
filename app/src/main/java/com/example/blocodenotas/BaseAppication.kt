package com.example.blocodenotas

import com.example.blocodenotas.di.AppComponent
import com.example.blocodenotas.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseAppication:DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
     return  DaggerAppComponent.builder().application(this).build()
  }
}