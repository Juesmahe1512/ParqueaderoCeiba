package com.example.parqueaderoceiba.presenters

import com.example.domain.entity.Carro
import com.example.domain.service.ParquearCarroCasoDeUso

class MainPresenter(var parquearCarroCasoDeUso: ParquearCarroCasoDeUso) {

    fun crearCarro():Carro{
        return this.parquearCarroCasoDeUso.crearCarro()
    }
}