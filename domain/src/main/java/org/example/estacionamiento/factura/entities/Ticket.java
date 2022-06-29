package org.example.estacionamiento.factura.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.factura.values.Tiempo;
import org.example.estacionamiento.factura.values.Fecha;
import org.example.estacionamiento.factura.values.TicketId;

public class Ticket extends Entity<TicketId> {
    private Fecha fecha;
    private Tiempo tiempo;

    public Ticket(TicketId entityId, Fecha fecha, Tiempo tiempo) {
        super(entityId);
        this.fecha = fecha;
        this.tiempo = tiempo;
    }
}
