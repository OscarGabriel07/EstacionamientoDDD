package org.example.estacionamiento.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tarifa implements ValueObject<Integer> {
    private final Integer valor;

    public Tarifa(Integer valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Integer value() {
        return valor;
    }
}
