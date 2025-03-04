package co.icesi.compunet_taller.repository;

import co.icesi.compunet_taller.model.Vehicle;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.ArrayList;


@ApplicationScoped
public class VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    //Obtener todos los vehiculos
    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    //obtener placa
    public Vehicle findVehicle(String placa) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlaca().equalsIgnoreCase(placa)) {
                return vehicle;
            }
        }
        return null;
    }

    //Agregar un vehiculo a un conductor
    public void save(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    //Eliminar un vehiculo especifico usando la placa
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public boolean existByPlaca(String placa) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }
}
