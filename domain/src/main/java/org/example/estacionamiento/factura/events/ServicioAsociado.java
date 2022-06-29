package org.example.estacionamiento.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.values.ServicioId;

public class ServicioAsociado extends DomainEvent {
    private final ServicioId servicioId;

    public ServicioAsociado(ServicioId servicioId) {
        super("org.example.estacionamiento.ServicioAsociado");
        this.servicioId = servicioId;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }
}
