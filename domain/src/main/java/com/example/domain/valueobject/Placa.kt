package com.example.domain.valueobject


import com.example.domain.exepciones.ExepcionNull
import java.util.*

class Placa {
    private lateinit var numero: String

    constructor(numero: String) {
        if (numero == null || numero.isEmpty()) {
            throw ExepcionNull("Dato no puede estar vacio")
        }
        validarLetraPlaca(numero)
        this.numero = numero
    }

    fun validarLetraPlaca(numero: String) {
        val calendar: Calendar = Calendar.getInstance(TimeZone.getDefault())
        val day: Int = calendar.get(Calendar.DAY_OF_WEEK)
        if (numero.startsWith("A") && (day == Calendar.MONDAY || day == Calendar.SUNDAY)) {
            throw ExepcionNull("Placa letra a")
        }
    }
}