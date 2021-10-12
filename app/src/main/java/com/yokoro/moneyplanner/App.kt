package com.yokoro.moneyplanner

import android.app.Application
import com.yokoro.moneyplanner.di.diModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        // Dependency Injection
        startKoin {
            androidContext(this@App)
            modules(diModules)
        }
    }
}