package org.example.estacionamiento.vehiculo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.estacionamiento.vehiculo.entities.Propietario;
import org.example.estacionamiento.vehiculo.entities.TipoDeVehiculo;
import org.example.estacionamiento.vehiculo.events.CelularPropietarioActualizado;
import org.example.estacionamiento.vehiculo.events.DescripcionTipoVehiculoActualizada;
import org.example.estacionamiento.vehiculo.events.NombrePropietarioActualizado;
import org.example.estacionamiento.vehiculo.events.VehiculoCreado;
import org.example.estacionamiento.vehiculo.values.*;

import java.util.List;


public class Vehiculo extends AggregateEvent<VehiculoId> {
    protected Propietario propietario;
    protected TipoDeVehiculo tipoDeVehiculo;

    public Vehiculo(VehiculoId entityId, Propietario propietario, TipoDeVehiculo tipoDeVehiculo) {
        super(entityId);

        appendChange(new VehiculoCreado(propietario,tipoDeVehiculo)).apply();
        subscribe(new VehiculoEventChange(this));
    }

    private  Vehiculo(VehiculoId vehiculoId){
        super(vehiculoId);
        subscribe(new VehiculoEventChange(this));
    }

    public static Vehiculo from(VehiculoId vehiculoId, List<DomainEvent> events){
        var vehiculo = new Vehiculo(vehiculoId);
        events.forEach(vehiculo::applyEvent);
        return vehiculo;
    }

    public void actualizarNombrePropietario(PropietarioId propietarioId, Nombre nombre){
        appendChange(new NombrePropietarioActualizado(propietarioId, nombre)).apply();
    }

    public void actualizarDescripcionTipoVehiculo(TipoDeVehiculoId tipoDeVehiculoId, Descripcion descripcion){
        appendChange(new DescripcionTipoVehiculoActualizada(tipoDeVehiculoId, descripcion));
    }

    public void actualizarCelularPropietario(PropietarioId propietarioId, Celular celular){
        appendChange(new CelularPropietarioActualizado(propietarioId, celular));
    }

    public Propietario propietario() {
        return propietario;
    }

    public TipoDeVehiculo tipoDeVehiculo() {
        return tipoDeVehiculo;
    }
}
