package org.example.estacionamiento.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.values.Detalle;
import org.example.estacionamiento.factura.values.MedioDePago;
import org.example.estacionamiento.vehiculo.values.VehiculoId;

public class FacturaCreada extends DomainEvent {
    private final Detalle detalle;
    private final MedioDePago medioDePago;
    private final VehiculoId vehiculoId;

    public FacturaCreada(Detalle detalle, MedioDePago medioDePago, VehiculoId vehiculoId) {
        super("org.example.estacionamiento.FacturaCreada");
        this.detalle = detalle;
        this.medioDePago = medioDePago;

        this.vehiculoId = vehiculoId;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
