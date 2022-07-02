package org.example.estacionamiento.sede.factura;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.estacionamiento.factura.Factura;
import org.example.estacionamiento.factura.commands.CambiarMedioDePagoFactura;

public class CambiarMedioDePagoUseCase extends UseCase<RequestCommand<CambiarMedioDePagoFactura>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarMedioDePagoFactura> cambiarMedioDePagoFacturaRequestCommand) {
        var command = cambiarMedioDePagoFacturaRequestCommand.getCommand();
        var factura = Factura.from(command.getFacturaId(),repository().getEventsBy(command.getFacturaId().value()));
        factura.cambiarMedioDePago(command.getMedioDePago());
        emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));

    }
}
