package org.example.estacionamiento.factura;

import co.com.sofka.domain.generic.AggregateEvent;

import org.example.estacionamiento.factura.events.*;
import org.example.estacionamiento.factura.values.*;
import org.example.estacionamiento.vehiculo.VehiculoId;

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

}
