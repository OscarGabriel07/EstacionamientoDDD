package org.example.estacionamiento.sede.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.sede.values.Correo;
import org.example.estacionamiento.sede.values.EmpleadoId;
import org.example.estacionamiento.sede.values.Nombre;

public class Empleado extends Entity<EmpleadoId> {

    private Nombre nombre;
    private Correo correo;

    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void actualizarCorreo(Correo correo){
        this.correo = correo;
    }
}
