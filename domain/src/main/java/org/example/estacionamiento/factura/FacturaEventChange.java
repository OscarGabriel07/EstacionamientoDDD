package org.example.estacionamiento.factura;

import co.com.sofka.domain.generic.EventChange;
import org.example.estacionamiento.factura.events.*;

public class FacturaEventChange extends EventChange {
    public FacturaEventChange(Factura factura) {
        apply((FacturaCreada event) ->{
            factura.servicioId = null;
            factura.detalle = event.getDetalle();
            factura.medioDePago = event.getMedioDePago();
            factura.ticketId = null;
            factura.vehiculoId = event.getVehiculoId();
        });

        apply((VehiculoAsociado event) ->{
            factura.vehiculoId = event.getVehiculoId();

        });

        apply((ServicioAsociado event) -> {
            factura.servicioId = event.getServicioId();
        });

        apply((MedioDePagoCambiado event)->{
            factura.medioDePago = event.getMedioDePago();
        });

        apply((TicketAsociado event) -> {
            factura.ticketId = event.getTicketId();
        });

    }


}
