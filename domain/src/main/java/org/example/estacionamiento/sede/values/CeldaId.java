package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.Identity;
import org.example.estacionamiento.factura.values.TicketId;

public class CeldaId extends Identity {
    public CeldaId(){

    }
    private CeldaId(String id){
        super(id);
    }

    public static CeldaId of(String id){
        return new CeldaId(id);
    }
}
