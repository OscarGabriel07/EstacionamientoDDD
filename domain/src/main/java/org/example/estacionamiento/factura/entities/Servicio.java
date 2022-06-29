package org.example.estacionamiento.factura.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.factura.values.ServicioId;
import org.example.estacionamiento.factura.values.Tarifa;
import org.example.estacionamiento.factura.values.TipoDeServicio;


public class Servicio extends Entity<ServicioId> {

    private TipoDeServicio tipoDeServicio;
    private Tarifa tarifa;


    public Servicio(ServicioId entityId, TipoDeServicio tipoDeServicio, Tarifa tarifa) {

        super(entityId);
        this.tipoDeServicio = tipoDeServicio;
        this.tarifa = tarifa;
    }
}
