package co.icesi.compunet_taller.repository;



import co.icesi.compunet_taller.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    // Obtener todos los vehículos
    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    // Obtener un vehículo por placa
    public Vehicle findVehicle(String placa) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlaca().equalsIgnoreCase(placa)) {
                return vehicle;
            }
        }
        return null;
    }

    // Agregar un vehículo
    public void save(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Eliminar un vehículo usando la placa
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
