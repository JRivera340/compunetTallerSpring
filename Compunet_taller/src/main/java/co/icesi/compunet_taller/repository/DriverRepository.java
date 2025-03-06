package co.icesi.compunet_taller.repository;

import org.springframework.stereotype.Repository;
import co.icesi.compunet_taller.model.Driver;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DriverRepository {

    private List<Driver> drivers = new ArrayList<>();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void save(Driver driver) {
        drivers.add(driver);
    }

    public Driver findDriver(String numId) {
        for (Driver driver : drivers) {
            if (driver.getId().equals(numId)) {
                return driver;
            }
        }
        return null;
    }

    public boolean exists(Driver driver) {
        return drivers.contains(driver);
    }
}
