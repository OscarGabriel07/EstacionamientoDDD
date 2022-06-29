package org.example.estacionamiento.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.values.TicketId;

public class TicketAsociado extends DomainEvent {
    private final TicketId ticketId;

    public TicketAsociado(TicketId ticketId) {
        super("org.example.estacionamiento.TicketAsociado");
        this.ticketId = ticketId;
    }

    public TicketId getTicketId() {
        return ticketId;
    }
}
