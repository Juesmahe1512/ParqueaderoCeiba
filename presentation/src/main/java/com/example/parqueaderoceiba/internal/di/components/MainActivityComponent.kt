package com.example.parqueaderoceiba.internal.di.components

import com.example.parqueaderoceiba.MainActivity
import com.example.parqueaderoceiba.internal.di.PerActivity
import com.example.parqueaderoceiba.internal.di.modules.MainActivityModule
import com.example.parqueaderoceiba.internal.di.modules.UseCasesModule
import dagger.Component

@PerActivity
@Component(modules = arrayOf(MainActivityModule::class, UseCasesModule::class))
interface MainActivityComponent {
    fun inject(mainActivity: MainActivity)
}