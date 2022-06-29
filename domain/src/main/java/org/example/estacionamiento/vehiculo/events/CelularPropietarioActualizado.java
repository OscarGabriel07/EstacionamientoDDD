package org.example.estacionamiento.vehiculo.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.values.Celular;
import org.example.estacionamiento.vehiculo.values.PropietarioId;

public class CelularPropietarioActualizado extends DomainEvent {
    private final PropietarioId propietarioId;
    private final Celular celular;

    public CelularPropietarioActualizado(PropietarioId propietarioId, Celular celular) {
        super("org.example.estacionamiento.CelularPropietarioActualizado");
        this.propietarioId = propietarioId;
        this.celular = celular;
    }

    public PropietarioId getPropietarioId() {
        return propietarioId;
    }

    public Celular getCelular() {
        return celular;
    }
}
