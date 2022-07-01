package org.example.estacionamiento.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Detalle implements ValueObject<String> {
    private final String valor;

    public Detalle(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public String value() {
        return valor;
    }


}
