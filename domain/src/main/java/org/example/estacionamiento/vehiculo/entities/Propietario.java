package org.example.estacionamiento.vehiculo.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.vehiculo.values.Celular;
import org.example.estacionamiento.vehiculo.values.Nombre;
import org.example.estacionamiento.vehiculo.values.PropietarioId;

public class Propietario extends Entity<PropietarioId> {
    private Nombre nombre;
    private Celular celular;

    public Propietario(PropietarioId entityId, Nombre nombre, Celular celular) {
        super(entityId);
        this.nombre = nombre;
        this.celular = celular;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void actualizarCelular(Celular celular){
        this.celular = celular;
    }
}
