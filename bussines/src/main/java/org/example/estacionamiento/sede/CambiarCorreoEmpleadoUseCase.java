package org.example.estacionamiento.sede;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.estacionamiento.sede.commands.CambiarCorreoEmpleado;

public class CambiarCorreoEmpleadoUseCase extends UseCase<RequestCommand<CambiarCorreoEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarCorreoEmpleado> cambiarCorreoEmpleadoRequestCommand) {
        var command = cambiarCorreoEmpleadoRequestCommand.getCommand();
        var sede = Sede.from(command.getSedeId(),repository().getEventsBy(command.getSedeId().value()));

        sede.cambiarCorreoEmpleado(command.getEmpleadoId(), command.getCorreo());

        emit().onResponse(new ResponseEvents(sede.getUncommittedChanges()));

    }
}
