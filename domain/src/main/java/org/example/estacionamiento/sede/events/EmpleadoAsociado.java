package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.entities.Empleado;

public class EmpleadoAsociado extends DomainEvent {
    private final Empleado empleado;

    public EmpleadoAsociado(Empleado empleado) {
        super("org.example.estacionamiento.EmpleadoAsociado");
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

}
