package co.icesi.compunet_taller.repository;

import org.springframework.stereotype.Repository;
import co.icesi.compunet_taller.model.Vehicle;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    public Vehicle findVehicle(String placa) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlaca().equalsIgnoreCase(placa)) {
                return vehicle;
            }
        }
        return null;
    }

    public void save(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

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
