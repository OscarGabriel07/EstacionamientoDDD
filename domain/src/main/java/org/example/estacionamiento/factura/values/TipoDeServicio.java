package org.example.estacionamiento.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeServicio implements ValueObject<String> {
    private final String valor;

    public TipoDeServicio(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    @Override
    public String value() {
        return valor;
    }
}
