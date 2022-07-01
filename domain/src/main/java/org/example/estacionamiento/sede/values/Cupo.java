package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cupo implements ValueObject<Integer> {
    private final Integer valor;

    public Cupo(Integer valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Integer value() {
        return valor;
    }
}
