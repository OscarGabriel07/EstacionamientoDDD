package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.entities.Empleado;
import org.example.estacionamiento.sede.values.Correo;
import org.example.estacionamiento.sede.values.EmpleadoId;
import org.example.estacionamiento.sede.values.Nombre;

public class EmpleadoAsociado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;
    private final Correo correo;

    public EmpleadoAsociado(EmpleadoId empleadoId, Nombre nombre, Correo correo) {
        super("org.example.estacionamiento.EmpleadoAsociado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.correo = correo;

    }


    public EmpleadoId empleadoId() {
        return empleadoId;
    }

    public Correo correo() {
        return correo;
    }

    public Nombre nombre() {
        return nombre;
    }
}
