package org.example.estacionamiento.sede;

import co.com.sofka.domain.generic.Entity;
import org.example.estacionamiento.sede.values.Correo;
import org.example.estacionamiento.sede.values.Nombre;

public class Empleado extends Entity<EmpleadoId> {

    private Nombre nombre;
    private Correo correo;

    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }
}
