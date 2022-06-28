package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {
    @Override
    public Boolean value() {
        return false;
    }
}
