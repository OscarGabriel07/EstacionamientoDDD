package org.example.estacionamiento.vehiculo.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.values.Nombre;
import org.example.estacionamiento.vehiculo.values.PropietarioId;

public class NombrePropietarioActualizado extends DomainEvent {
    private final PropietarioId propietarioId;
    private final Nombre nombre;

    public NombrePropietarioActualizado(PropietarioId propietarioId, Nombre nombre) {
        super("org.example.estacionamiento.NombrePropietarioActualizado");
        this.propietarioId = propietarioId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public PropietarioId getPropietarioId() {
        return propietarioId;
    }
}
