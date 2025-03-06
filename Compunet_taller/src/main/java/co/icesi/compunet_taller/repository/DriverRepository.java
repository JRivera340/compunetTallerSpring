package co.icesi.compunet_taller.repository;


import co.icesi.compunet_taller.model.Driver;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DriverRepository {

    private List<Driver> drivers = new ArrayList<>();

    // Obtener todos los conductores
    public List<Driver> getDrivers() {
        return drivers;
    }

    // Agregar un conductor
    public void save(Driver driver) {
        drivers.add(driver);
    }

    // Obtener a un conductor específico con todos sus vehículos usando su número de identificación.
    public Driver findDriver(String numId) {
        for (Driver driver : drivers) {
            if (driver.getId().equals(numId)) {
                // Este conductor ya contiene la lista de vehículos
                return driver;
            }
        }
        return null;
    }

    public boolean exists(Driver driver) {
        return drivers.contains(driver);
    }
}
