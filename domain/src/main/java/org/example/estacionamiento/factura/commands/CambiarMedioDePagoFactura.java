package org.example.estacionamiento.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.example.estacionamiento.factura.values.FacturaId;
import org.example.estacionamiento.factura.values.MedioDePago;

public class CambiarMedioDePagoFactura extends Command {
    private final FacturaId facturaId;
    private final MedioDePago medioDePago;

    public CambiarMedioDePagoFactura(FacturaId facturaId, MedioDePago medioDePago) {
        this.facturaId = facturaId;
        this.medioDePago = medioDePago;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
