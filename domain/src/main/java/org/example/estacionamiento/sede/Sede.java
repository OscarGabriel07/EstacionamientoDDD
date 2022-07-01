package org.example.estacionamiento.sede;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.factura.Factura;
import org.example.estacionamiento.sede.entities.Celda;
import org.example.estacionamiento.sede.entities.Empleado;
import org.example.estacionamiento.sede.events.*;
import org.example.estacionamiento.sede.values.*;
import org.example.estacionamiento.vehiculo.Vehiculo;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Sede extends AggregateEvent<SedeId> {
    protected Horario horario;
    protected Ubicacion ubicacion;
    protected Cupo cupo;

    protected Set<Factura> facturas;

    protected Set<Vehiculo> vehiculos;

    protected Map<CeldaId, Celda> celdas;

    protected Set<Empleado> empleados;

    public Sede(SedeId sedeId, Horario horario, Ubicacion ubicacion, Cupo cupo) {
        super(sedeId);
        appendChange(new SedeCreada(horario, ubicacion, cupo)).apply();
        subscribe(new SedeEventChange(this));
    }



    public void cambiarEstadoCelda(CeldaId celdaId, Estado estado){
        appendChange(new EstadoCeldaCambiado(celdaId, estado)).apply();
    }

    public void asociarEmpleado(EmpleadoId empleadoid,Nombre nombre,Correo correo){
        appendChange(new EmpleadoAsociado(empleadoid,nombre,correo)).apply();
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        appendChange(new VehiculoAgregado(vehiculo)).apply();
    }

    public void actualizarNombreEmpleado(EmpleadoId empleadoId, Nombre nombre){
        appendChange(new NombreEmpleadoActualizado(empleadoId, nombre)).apply();
    }

    public void cambiarCorreoEmpleado(EmpleadoId empleadoId, Correo correo){
        appendChange(new CorreoEmpleadoActualizado(empleadoId, correo)).apply();
    }

    public void agregarFactura(Factura factura){
        appendChange(new FacturaAgregada(factura)).apply();
    }

    public Optional<Empleado> getEmpleadoPorId(EmpleadoId empleadoId){
        return empleados.stream().filter(empleado -> empleado.identity().equals(empleadoId)).findFirst();
    }

    private Sede(SedeId sedeId){
        super(sedeId);
        subscribe(new SedeEventChange(this));
    }

    public static Sede from(SedeId sedeId, List<DomainEvent> events){
        var sede = new Sede(sedeId);
        events.forEach(sede::applyEvent);
        return sede;
    }

    public Horario horario() {
        return horario;
    }

    public Cupo cupo() {
        return cupo;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Set<Empleado> gempleados() {
        return empleados;
    }

    public Map<CeldaId, Celda> celdas() {
        return celdas;
    }

    public Set<Factura> facturas() {
        return facturas;
    }

    public Set<Vehiculo> vehiculos() {
        return vehiculos;
    }


}
