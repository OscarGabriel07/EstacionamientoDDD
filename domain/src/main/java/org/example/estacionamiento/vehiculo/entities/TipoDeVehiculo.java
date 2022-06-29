package org.example.estacionamiento.vehiculo.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.vehiculo.values.Descripcion;
import org.example.estacionamiento.vehiculo.values.TipoDeVehiculoId;

public class TipoDeVehiculo extends Entity<TipoDeVehiculoId> {
    private Descripcion descripcion;

    public TipoDeVehiculo(TipoDeVehiculoId entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
    }

    public void cambiarDescripcion(Descripcion descripcion){
        this.descripcion = descripcion;
    }
}
