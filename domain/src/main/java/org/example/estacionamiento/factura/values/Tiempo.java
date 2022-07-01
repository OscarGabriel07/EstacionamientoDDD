package org.example.estacionamiento.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Time;
import java.util.Objects;

public class Tiempo implements ValueObject <Time> {
    private final Time valor;

    public Tiempo(Time valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Time value() {
        return valor;
    }
}
