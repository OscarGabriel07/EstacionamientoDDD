package org.example.estacionamiento.vehiculo.values;


import co.com.sofka.domain.generic.Identity;
import org.example.estacionamiento.sede.values.CeldaId;

public class PropietarioId extends Identity {
    public PropietarioId(){

    }
    private PropietarioId(String id){
        super(id);
    }

    public static PropietarioId of(String id){
        return new PropietarioId(id);
    }
}
