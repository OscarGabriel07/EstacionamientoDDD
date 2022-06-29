package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.Vehiculo;

public class VehiculoAgregado extends DomainEvent {
    private final Vehiculo vehiculo;

    public VehiculoAgregado(Vehiculo vehiculo) {
        super("org.example.estacionamiento.VehiculoAgregado");
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
