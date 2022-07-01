package org.example.estacionamiento.sede.values;

import co.com.sofka.domain.generic.Identity;
import org.example.estacionamiento.factura.values.TicketId;

public class EmpleadoId extends Identity {
    public EmpleadoId(){

    }
    private EmpleadoId(String id){
        super(id);
    }

    public static EmpleadoId of(String id){
        return new EmpleadoId(id);
    }
}
