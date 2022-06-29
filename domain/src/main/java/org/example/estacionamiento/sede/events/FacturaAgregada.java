package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.Factura;

public class FacturaAgregada extends DomainEvent {
    private final Factura factura;

    public FacturaAgregada(Factura factura) {
        super("org.example.estacionamiento.FacturaAgregada");
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
}
