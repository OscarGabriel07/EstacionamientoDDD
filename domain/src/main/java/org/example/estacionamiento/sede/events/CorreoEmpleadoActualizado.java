package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.values.EmpleadoId;
import org.example.estacionamiento.sede.values.Correo;

public class CorreoEmpleadoActualizado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Correo correo;

    public CorreoEmpleadoActualizado(EmpleadoId empleadoId, Correo correo) {
        super("org.example.estacionamiento.CorreoEmpleadoActualizado");
        this.empleadoId = empleadoId;
        this.correo = correo;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Correo getCorreo() {
        return correo;
    }
}
