package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

public class Vehiculo extends AggregateEvent<VehiculoId> {
    public Vehiculo(VehiculoId entityId) {
        super(entityId);
    }
}
