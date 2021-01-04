package com.example.parqueaderoceiba.internal.di.modules

import com.example.domain.service.ParquearCarroCasoDeUso
import com.example.parqueaderoceiba.MainActivity
import com.example.parqueaderoceiba.internal.di.PerActivity
import com.example.parqueaderoceiba.presenters.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(var mainActivity: MainActivity) {

    @Provides
    @PerActivity
    fun provideMainPresenter(parquearCarroCasoDeUso: ParquearCarroCasoDeUso):MainPresenter{
        return MainPresenter(parquearCarroCasoDeUso)
    }

    @Provides
    @PerActivity
    fun provideMainActivity():MainActivity{
        return this.mainActivity
    }
}