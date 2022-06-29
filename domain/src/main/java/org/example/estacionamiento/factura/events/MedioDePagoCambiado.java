package org.example.estacionamiento.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.values.MedioDePago;

public class MedioDePagoCambiado extends DomainEvent {
    private final MedioDePago medioDePago;

    public MedioDePagoCambiado(MedioDePago medioDePago) {
        super("org.example.estacionamiento.MedioDePagoCambiado");
        this.medioDePago = medioDePago;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }
}
