package org.example.estacionamiento.vehiculo.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.entities.Propietario;
import org.example.estacionamiento.vehiculo.entities.TipoDeVehiculo;

public class VehiculoCreado extends DomainEvent {
    private final Propietario propietario;
    private final TipoDeVehiculo tipoDeVehiculo;

    public VehiculoCreado(Propietario propietario, TipoDeVehiculo tipoDeVehiculo) {
        super("org.example.estacionamiento.VehiculoCreado");
        this.propietario = propietario;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public TipoDeVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
