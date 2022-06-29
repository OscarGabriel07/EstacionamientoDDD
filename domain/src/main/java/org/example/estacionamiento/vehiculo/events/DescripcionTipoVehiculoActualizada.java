package org.example.estacionamiento.vehiculo.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.values.Descripcion;
import org.example.estacionamiento.vehiculo.values.TipoDeVehiculoId;

public class DescripcionTipoVehiculoActualizada extends DomainEvent {
    private final TipoDeVehiculoId tipoDeVehiculoId;
    private final Descripcion descripcion;

    public DescripcionTipoVehiculoActualizada(TipoDeVehiculoId tipoDeVehiculoId, Descripcion descripcion) {
        super("org.example.estacionamiento.DescripcionTipoVehiculoActualizada");
        this.tipoDeVehiculoId = tipoDeVehiculoId;
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoDeVehiculoId getTipoDeVehiculoId() {
        return tipoDeVehiculoId;
    }
}
