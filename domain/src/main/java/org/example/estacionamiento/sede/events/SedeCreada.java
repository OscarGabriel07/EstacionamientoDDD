package org.example.estacionamiento.sede.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.sede.entities.Empleado;
import org.example.estacionamiento.sede.values.Cupo;
import org.example.estacionamiento.sede.values.Horario;
import org.example.estacionamiento.sede.values.Ubicacion;

public class SedeCreada extends DomainEvent {
    private Horario horario;
    private Ubicacion ubicacion;
    private Cupo cupo;
    private Empleado empleado;

    public SedeCreada(Horario horario, Ubicacion ubicacion, Cupo cupo, Empleado empleado) {
        super("org.example.estacionamiento.SedeCreada");
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.cupo = cupo;
        this.empleado = empleado;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public Horario getHorario() {
        return horario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
