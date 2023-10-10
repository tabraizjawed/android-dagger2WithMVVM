package com.me.dagger2example

import android.app.Application
import com.me.dagger2example.di.ApplicationComponent
import com.me.dagger2example.di.DaggerApplicationComponent


class CountriesApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}