package org.example.estacionamiento.sede;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.events.SedeCreada;
import org.example.estacionamiento.sede.values.Cupo;
import org.example.estacionamiento.sede.values.Horario;
import org.example.estacionamiento.sede.values.SedeId;
import org.example.estacionamiento.sede.values.Ubicacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearSedeUseCaseTest {

    @Test
    void crearNuevaSede(){

        //arrange
        var sedeId = new SedeId();
        var horario = new Horario(LocalDate.now());
        var ubicación = new Ubicacion("Calle 15 85 - 09, Bogotá");
        var cupo = new Cupo(20);

        var command = new CrearSede(sedeId, horario, ubicación, cupo);

        var useCase = new CrearSedeUseCase();

        //act
        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        SedeCreada event = (SedeCreada) events.get(0);
        Assertions.assertEquals("Calle 15 85 - 09, Bogotá", event.getUbicacion().value());
        Assertions.assertEquals(20, event.getCupo().value());

    }

}