package com.example.blocodenotas.di

import com.example.blocodenotas.ui.AddFragment
import com.example.blocodenotas.ui.EditFragment
import com.example.blocodenotas.ui.ListFragment
import com.example.blocodenotas.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeAddFragment(): AddFragment

    @ContributesAndroidInjector
    abstract fun contributeEditFragment(): EditFragment

    @ContributesAndroidInjector
    abstract fun contributeListFragment(): ListFragment

}