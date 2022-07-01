package org.example.estacionamiento.vehiculo.values;

import co.com.sofka.domain.generic.Identity;
import org.example.estacionamiento.sede.values.CeldaId;

public class TipoDeVehiculoId extends Identity {
    public TipoDeVehiculoId(){

    }
    private TipoDeVehiculoId(String id){
        super(id);
    }

    public static TipoDeVehiculoId of(String id){
        return new TipoDeVehiculoId(id);
    }
}
