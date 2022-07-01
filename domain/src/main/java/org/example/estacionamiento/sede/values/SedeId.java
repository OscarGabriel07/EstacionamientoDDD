package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.Identity;
import org.example.estacionamiento.factura.values.TicketId;

public class SedeId extends Identity{
    public SedeId(){

    }
    private SedeId(String id){
        super(id);
    }

    public static SedeId of(String id){
        return new SedeId(id);
    }
}
