package org.example.estacionamiento.factura;

import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.events.*;
import org.example.estacionamiento.factura.values.*;
import org.example.estacionamiento.vehiculo.values.VehiculoId;

import java.util.List;

public class Factura extends AggregateEvent<FacturaId> {
    protected Detalle detalle;
    protected MedioDePago medioDePago;

    protected VehiculoId vehiculoId;
    protected ServicioId servicioId;
    protected TicketId ticketId;


    public Factura(FacturaId entityId, Detalle detalle, MedioDePago medioDePago, VehiculoId vehiculoId) {
        super(entityId);

        appendChange(new FacturaCreada(detalle, medioDePago, vehiculoId)).apply();
        subscribe(new FacturaEventChange(this));
    }

    public void asociarVehiculo(VehiculoId vehiculoId){
        appendChange(new VehiculoAsociado(vehiculoId)).apply();

    }

    public void asociarServicio(ServicioId servicioId){
        appendChange(new ServicioAsociado(servicioId)).apply();

    }
    public void asociarTicket(TicketId ticketId){
        appendChange(new TicketAsociado(ticketId)).apply();

    }
    public void cambiarMedioDePago(MedioDePago medioDePago){
        appendChange(new MedioDePagoCambiado(medioDePago)).apply();

    }
    private Factura(FacturaId facturaId){
        super(facturaId);
        subscribe(new FacturaEventChange(this));

    }

    public static Factura from(FacturaId facturaId, List<DomainEvent> events){
        var factura = new Factura(facturaId);
        events.forEach(factura::applyEvent);
        return factura;
    }

    public Detalle detalle() {
        return detalle;
    }

    public MedioDePago medioDePago() {
        return medioDePago;
    }

    public VehiculoId vehiculoId() {
        return vehiculoId;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public TicketId ticketId() {
        return ticketId;
    }
}
