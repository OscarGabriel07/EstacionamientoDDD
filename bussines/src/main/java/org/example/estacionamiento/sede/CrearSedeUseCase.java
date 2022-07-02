package org.example.estacionamiento.sede;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.estacionamiento.sede.commands.CrearSede;

public class CrearSedeUseCase extends UseCase<RequestCommand<CrearSede>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSede> crearSedeRequestCommand) {

        var command = crearSedeRequestCommand.getCommand();
        var sede = new Sede(command.getSedeId(), command.getHorario(), command.getUbicacion(), command.getCupo());

        emit().onResponse(new ResponseEvents(sede.getUncommittedChanges()));
    }
}
