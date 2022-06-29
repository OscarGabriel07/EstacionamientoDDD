package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.Entity;

public class Propietario extends Entity<PropietarioId> {
    private Nombre nombre;
    private Celular celular;

    public Propietario(PropietarioId entityId, Nombre nombre, Celular celular) {
        super(entityId);
        this.nombre = nombre;
        this.celular = celular;
    }
}
