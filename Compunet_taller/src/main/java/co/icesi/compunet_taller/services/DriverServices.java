package co.icesi.compunet_taller.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import co.icesi.compunet_taller.repository.DriverRepository;
import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.model.Vehicle;
import java.util.List;

@Service
public class DriverServices {

    @Autowired
    private DriverRepository driverRepository;

    public List<Driver> findAllDrivers() {
        List<Driver> conductores = driverRepository.getDrivers();
        if (conductores.isEmpty()) {
            System.out.println("No hay conductores registrados");
        }
        return conductores;
    }

    public void createDriver(Driver driver) {
        if (!driverRepository.exists(driver)) {
            driverRepository.save(driver);
        } else {
            System.out.println("Conductor ya existe");
        }
    }

    public Driver findDriver(String numId) {
        if (numId == null) {
            throw new IllegalArgumentException("El número de identificación no puede ser nulo");
        }
        Driver driver = driverRepository.findDriver(numId);
        if (driver == null) {
            System.out.println("Conductor no encontrado con el número de identificación: " + numId);
        } else {
            System.out.println("Vehículos del conductor " + driver.getName() + ":");
            for (Vehicle vehicle : driver.getVehicles()) {
                System.out.println("- Placa: " + vehicle.getPlaca() +
                        ", Marca: " + vehicle.getMarca() +
                        ", Modelo: " + vehicle.getModelo());
            }
        }
        return driver;
    }
}
