package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<Boolean> {
    private final Boolean estado;

    public Estado(Boolean estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    @Override
    public Boolean value() {
        return estado;
    }
}
