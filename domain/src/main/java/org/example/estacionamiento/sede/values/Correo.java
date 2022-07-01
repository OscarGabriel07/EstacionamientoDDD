package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private final String correo;

    public Correo(String valor) {
        this.correo = Objects.requireNonNull(valor);

        if(!correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("El correo no es válido");
        }
    }

    @Override
    public String value() {
        return correo;
    }

    public Correo cambiarCorreo(String numeroAModificar){
        return new Correo(Objects.requireNonNull(numeroAModificar));
    }
}
