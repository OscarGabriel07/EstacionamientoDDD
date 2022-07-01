package org.example.estacionamiento.sede.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.sede.values.Correo;
import org.example.estacionamiento.sede.values.EmpleadoId;
import org.example.estacionamiento.sede.values.Nombre;

public class Empleado extends Entity<EmpleadoId> {

    private Nombre nombre;
    private Correo correo;
    private EmpleadoId empleadoId;

    public Empleado(EmpleadoId empleadoId, Nombre nombre, Correo correo) {
        super(empleadoId);
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void actualizarCorreo(EmpleadoId empleadoId, Correo correoAModificar){
        this.empleadoId = empleadoId;
        this.correo = correo.cambiarCorreo(correoAModificar.value());
    }
}
