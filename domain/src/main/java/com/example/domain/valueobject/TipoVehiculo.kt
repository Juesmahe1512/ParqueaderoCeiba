package com.example.domain.valueobject

import com.example.domain.exepciones.ExepcionNull

class TipoVehiculo {
    private lateinit var tipoVheiculo: String

    constructor(tipoVheiculo: String) {
        if (tipoVheiculo == null || tipoVheiculo.isEmpty()) {
            throw ExepcionNull("Dato no puede estar vacio")
        }
        this.tipoVheiculo = tipoVheiculo
    }

    fun tipoVehiculo():String
    {
        return tipoVheiculo
    }
}