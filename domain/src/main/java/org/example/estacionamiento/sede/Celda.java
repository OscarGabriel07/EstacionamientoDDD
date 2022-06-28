package org.example.estacionamiento.sede;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.sede.values.Estado;
import org.example.estacionamiento.sede.values.TipoDeCelda;

public class Celda extends Entity<CeldaId> {

    private TipoDeCelda tipoDeCelda;
    private Estado estado;

    public Celda(CeldaId entityId, TipoDeCelda tipoDeCelda, Estado estado) {
        super(entityId);
        this.tipoDeCelda = tipoDeCelda;
        this.estado = estado;
    }
}
