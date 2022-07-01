package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class Horario implements ValueObject<LocalDate> {
    private final LocalDate valor;

    public Horario(LocalDate valor) {
        this.valor = (valor);
    }

    @Override
    public LocalDate value() {
        return valor;
    }
}
