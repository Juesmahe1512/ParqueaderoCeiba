package com.example.domain.entity

import com.example.domain.exepciones.ExepcionNull
import com.example.domain.valueobject.Placa
import com.example.domain.valueobject.TipoVehiculo

class Moto {
    private lateinit var placa: Placa
    private lateinit var tipoVehiculo: TipoVehiculo
    private var cilindrada: Int

    constructor(placa: Placa, tipoVehiculo: TipoVehiculo, cilindrada: Int) {
        if (cilindrada == null) {
            throw ExepcionNull("Dato no puede estar vacio")
        }
        this.placa = placa
        this.tipoVehiculo = tipoVehiculo
        this.cilindrada = cilindrada
    }
}
