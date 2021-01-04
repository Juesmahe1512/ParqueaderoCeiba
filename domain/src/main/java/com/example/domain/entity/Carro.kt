package com.example.domain.entity

import com.example.domain.exepciones.ExepcionNull
import com.example.domain.valueobject.Placa
import com.example.domain.valueobject.TipoVehiculo

class Carro(var tipoVehiculo: TipoVehiculo,var placa: Placa) {
    override fun toString(): String {
        return "Carro()"+this.tipoVehiculo.tipoVehiculo()
    }
}