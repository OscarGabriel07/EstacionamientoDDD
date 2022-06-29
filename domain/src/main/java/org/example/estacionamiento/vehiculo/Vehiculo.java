package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.AggregateEvent;


public class Vehiculo extends AggregateEvent<VehiculoId> {
    protected Propietario propietario;
    protected TipoDeVehiculo tipoDeVehiculo;

    public Vehiculo(VehiculoId entityId, Propietario propietario, TipoDeVehiculo tipoDeVehiculo) {
        super(entityId);

        appendChange(new VehiculoCreado(propietario,tipoDeVehiculo)).apply();
        subscribe(new VehiculoEventChange(this));
    }


}
