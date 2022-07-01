package org.example.estacionamiento.sede.commands;

import co.com.sofka.domain.generic.Command;
import org.example.estacionamiento.sede.values.Correo;
import org.example.estacionamiento.sede.values.EmpleadoId;
import org.example.estacionamiento.sede.values.SedeId;

public class CambiarCorreoEmpleado extends Command {

    private final SedeId sedeId;
    private final EmpleadoId empleadoId;
    private final Correo correo;

    public CambiarCorreoEmpleado(SedeId sedeId, EmpleadoId empleadoId, Correo correo){

        this.sedeId = sedeId;
        this.empleadoId = empleadoId;
        this.correo = correo;
    }

    public SedeId getSedeId() {
        return sedeId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Correo getCorreo() {
        return correo;
    }
}
