package org.example.estacionamiento.vehiculo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Celular implements ValueObject<Long> {
    private final Long valor;

    public Celular(Long valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public Long value() {
        return valor;
    }
}
