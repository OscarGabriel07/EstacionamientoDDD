package org.example.estacionamiento.sede;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.estacionamiento.factura.Factura;
import org.example.estacionamiento.sede.values.Cupo;
import org.example.estacionamiento.sede.values.Horario;
import org.example.estacionamiento.sede.values.Ubicacion;
import org.example.estacionamiento.vehiculo.Vehiculo;

import java.util.Set;

public class Sede extends AggregateEvent<SedeId> {
    protected Horario horario;
    protected Ubicacion ubicacion;
    protected Cupo cupo;

    protected Set<Factura> facturas;

    protected Set<Vehiculo> vehiculos;

    protected Set<Celda> celdas;

    protected Empleado empleado;

    public Sede(SedeId entityId, Horario horario, Ubicacion ubicacion, Cupo cupo) {
        super(entityId);
    }


}
