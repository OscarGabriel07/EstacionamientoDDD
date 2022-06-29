package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.values.EmpleadoId;
import org.example.estacionamiento.sede.values.Nombre;

public class NombreEmpleadoActualizado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Nombre nombre;

    public NombreEmpleadoActualizado(EmpleadoId empleadoId, Nombre nombre) {
        super("org.example.estacionamiento.NombreEmpleadoActualizado");

        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
