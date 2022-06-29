package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.values.CeldaId;
import org.example.estacionamiento.sede.values.Estado;

public class EstadoCeldaCambiado extends DomainEvent {
    private final CeldaId celdaId;
    private final Estado estado;

    public EstadoCeldaCambiado(CeldaId celdaId, Estado estado) {
        super("org.example.estacionamiento.EstadoCeldaCambiado");
        this.celdaId = celdaId;
        this.estado = estado;
    }

    public CeldaId getCeldaId() {
        return celdaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
