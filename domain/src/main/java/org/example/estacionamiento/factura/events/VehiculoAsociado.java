package org.example.estacionamiento.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.VehiculoId;

public class VehiculoAsociado extends DomainEvent {
    private final VehiculoId vehiculoId;

    public VehiculoAsociado(VehiculoId vehiculoId) {
        super("org.example.estacionamiento.VehiculoAsociado");


        this.vehiculoId = vehiculoId;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
