package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private final String valor;

    public Correo(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public String value() {
        return valor;
    }
}
