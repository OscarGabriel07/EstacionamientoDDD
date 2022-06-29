package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.EventChange;

public class VehiculoEventChange extends EventChange {
    public VehiculoEventChange(Vehiculo vehiculo) {

        apply((VehiculoCreado event)->{
            vehiculo.tipoDeVehiculo = event.getTipoDeVehiculo();
            vehiculo.propietario = event.getPropietario();
        });



    }
}
