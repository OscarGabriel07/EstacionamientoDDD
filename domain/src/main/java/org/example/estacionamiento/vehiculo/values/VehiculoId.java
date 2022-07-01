package org.example.estacionamiento.vehiculo.values;

import co.com.sofka.domain.generic.Identity;
import org.example.estacionamiento.sede.values.CeldaId;

public class VehiculoId extends Identity {
    public VehiculoId(){

    }
    private VehiculoId(String id){
        super(id);
    }

    public static VehiculoId of(String id){
        return new VehiculoId(id);
    }
}
