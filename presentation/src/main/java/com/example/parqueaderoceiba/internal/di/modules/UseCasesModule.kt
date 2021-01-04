package com.example.parqueaderoceiba.internal.di.modules

import com.example.domain.service.ParquearCarroCasoDeUso
import com.example.parqueaderoceiba.internal.di.PerActivity
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {

    @Provides
    @PerActivity
    fun provideParquearCarroCasoDeUso(): ParquearCarroCasoDeUso {
        return ParquearCarroCasoDeUso()
    }
}