package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.EventChange;
import org.example.estacionamiento.vehiculo.events.CelularPropietarioActualizado;
import org.example.estacionamiento.vehiculo.events.DescripcionTipoVehiculoActualizada;
import org.example.estacionamiento.vehiculo.events.NombrePropietarioActualizado;
import org.example.estacionamiento.vehiculo.events.VehiculoCreado;

public class VehiculoEventChange extends EventChange {
    public VehiculoEventChange(Vehiculo vehiculo) {

        apply((VehiculoCreado event)->{
            vehiculo.tipoDeVehiculo = event.getTipoDeVehiculo();
            vehiculo.propietario = event.getPropietario();
        });

        apply((NombrePropietarioActualizado event) -> {
            vehiculo.actualizarNombrePropietario(event.getPropietarioId(), event.getNombre());
        });

        apply((DescripcionTipoVehiculoActualizada event) -> {
            vehiculo.actualizarDescripcionTipoVehiculo(event.getTipoDeVehiculoId(), event.getDescripcion());
        });

        apply((CelularPropietarioActualizado event) -> {
            vehiculo.actualizarCelularPropietario(event.getPropietarioId(), event.getCelular());
        });

    }
}
