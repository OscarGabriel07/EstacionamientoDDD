package org.example.estacionamiento.sede;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.commands.CambiarCorreoEmpleado;
import org.example.estacionamiento.sede.entities.Empleado;
import org.example.estacionamiento.sede.events.CorreoEmpleadoActualizado;
import org.example.estacionamiento.sede.events.EmpleadoAsociado;
import org.example.estacionamiento.sede.events.SedeCreada;
import org.example.estacionamiento.sede.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CambiarCorreoEmpleadoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CambiarCorreoEmpleadoUseCase useCase;

    @Test
    public void CambiarCorreoEmpleado() {
        SedeId sedeId = SedeId.of("1");
        EmpleadoId empleadoId = EmpleadoId.of("1");
        Correo correo = new Correo("Felipemaringiraldo@gmail.com");

        var command = new CambiarCorreoEmpleado(sedeId, empleadoId, correo);

        when(repository.getEventsBy(sedeId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (CorreoEmpleadoActualizado)events.get(0);
        Assertions.assertEquals("Felipemaringiraldo@gmail.com" ,event.getCorreo().value());


    }

    private List<DomainEvent> history() {

        Horario horario = new Horario(LocalDate.now());
        Ubicacion ubicacion = new Ubicacion("Diagonal50C");
        Cupo cupo = new Cupo(15);


        EmpleadoId empleadoId = EmpleadoId.of("1");
        Nombre nombre = new Nombre("Daniel Felipe");
        Correo correo = new Correo("Felipemaringiraldo@gmail.com");


        return List.of(
                new SedeCreada(horario, ubicacion, cupo),
                new EmpleadoAsociado(empleadoId,nombre,correo));


    }
}