package com.example.domain.service

import com.example.domain.entity.Carro
import com.example.domain.valueobject.Placa
import com.example.domain.valueobject.TipoVehiculo

class ParquearCarroCasoDeUso {

    fun crearCarro():Carro{
        return Carro(TipoVehiculo("carro"), Placa("ABC984"))
    }
}