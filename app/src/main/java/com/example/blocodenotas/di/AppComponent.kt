package com.example.blocodenotas.di

import android.app.Application
import com.example.blocodenotas.BaseAppication
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import java.util.*
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilderModule::class, ViewModelFactoryModule::class])
interface AppComponent:AndroidInjector<BaseAppication> {


    @Component.Builder
    interface Builder {
        fun build():AppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }
}