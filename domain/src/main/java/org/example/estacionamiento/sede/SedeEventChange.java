package org.example.estacionamiento.sede;

import co.com.sofka.domain.generic.EventChange;
import org.example.estacionamiento.sede.events.*;

import java.util.HashMap;
import java.util.HashSet;

public class SedeEventChange extends EventChange {
    public SedeEventChange(Sede sede){
        apply((SedeCreada event ) -> {
            sede.cupo = event.getCupo();
            sede.horario = event.getHorario();
            sede.ubicacion = event.getUbicacion();
            sede.facturas = new HashSet<>();
            sede.vehiculos = new HashSet<>();
            sede.celdas = new HashMap<>();
            sede.empleados = new HashSet<>();
        });

        apply((EstadoCeldaCambiado event) -> {
            sede.celdas.get(event.getCeldaId()).cambiarEstado(event.getEstado());
        });

        apply((EmpleadoAsociado event) -> {
            sede.empleados.add(event.getEmpleado());
        });

        apply((VehiculoAgregado event) -> {
            sede.vehiculos.add(event.getVehiculo());
        });

        apply((NombreEmpleadoActualizado event) -> {
            var empleado = sede.getEmpleadoPorId(event.getEmpleadoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el empleado"));
            empleado.actualizarNombre(event.getNombre());
        });

        apply((CorreoEmpleadoActualizado event) -> {
            var empleado = sede.getEmpleadoPorId(event.getEmpleadoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el empleado"));
            empleado.actualizarCorreo(event.getCorreo());
        });

        apply((FacturaAgregada event) -> {
            //TODO: Falta asociar los atributos de la factura<agregado>
            sede.facturas.add(event.getFactura());
        });
    }

}
