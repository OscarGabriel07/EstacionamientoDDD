package org.example.estacionamiento.sede.commands;

import co.com.sofka.domain.generic.Command;
import org.example.estacionamiento.sede.values.Cupo;
import org.example.estacionamiento.sede.values.Horario;
import org.example.estacionamiento.sede.values.SedeId;
import org.example.estacionamiento.sede.values.Ubicacion;

public class CrearSede extends Command {

    private final SedeId sedeId;
    private final Horario horario;
    private final Ubicacion ubicacion;
    private final Cupo cupo;

    public CrearSede(SedeId sedeId, Horario horario, Ubicacion ubicacion, Cupo cupo){

        this.sedeId = sedeId;
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.cupo = cupo;
    }

    public SedeId getSedeId() {
        return sedeId;
    }

    public Horario getHorario() {
        return horario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Cupo getCupo() {
        return cupo;
    }
}
