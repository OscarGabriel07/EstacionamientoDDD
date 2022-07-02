package org.example.estacionamiento.sede.factura;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.commands.CambiarMedioDePagoFactura;
import org.example.estacionamiento.factura.events.FacturaCreada;
import org.example.estacionamiento.factura.events.MedioDePagoCambiado;
import org.example.estacionamiento.factura.values.Detalle;
import org.example.estacionamiento.factura.values.FacturaId;
import org.example.estacionamiento.factura.values.MedioDePago;
import org.example.estacionamiento.vehiculo.values.Descripcion;
import org.example.estacionamiento.vehiculo.values.VehiculoId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CambiarMedioDePagoUseCaseTest {
    @InjectMocks
    CambiarMedioDePagoUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void cambiarMedioDePagoFactura(){
        //Arrange
        FacturaId facturaId = FacturaId.of("f1");
        MedioDePago medioDePago = new MedioDePago("tarjeta");
        var command = new CambiarMedioDePagoFactura(facturaId,medioDePago);
        when(repository.getEventsBy(facturaId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //Act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Asserts
        var event = (MedioDePagoCambiado)events.get(0);
        Assertions.assertEquals("tarjeta",event.getMedioDePago().value());

    }

    private List<DomainEvent> history() {
        FacturaId facturaId = FacturaId.of("f1");
        VehiculoId vehiculoId = VehiculoId.of("v1");
        Detalle detalle = new Detalle("detalle");
        MedioDePago medioDePago= new MedioDePago("efectivo");

        return List.of(
          new FacturaCreada(detalle,medioDePago,vehiculoId)
        );

    }
}