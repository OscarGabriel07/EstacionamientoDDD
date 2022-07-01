package org.example.estacionamiento.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Fecha implements ValueObject<String> {
    private final LocalDate fecha;
    private final String formato;

    public Fecha(int day, int month, int year, LocalDate fecha) {
        this.fecha = Objects.requireNonNull(fecha);

        formato = generarFormato();
    }

    private String generarFormato(){
        return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String value() {//(3)
        return formato;
    }


}
