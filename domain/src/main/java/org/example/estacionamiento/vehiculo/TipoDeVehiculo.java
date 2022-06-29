package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.Entity;

public class TipoDeVehiculo extends Entity<TipoDeVehiculoId> {
    private Descripcion descripcion;

    public TipoDeVehiculo(TipoDeVehiculoId entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
    }
}
