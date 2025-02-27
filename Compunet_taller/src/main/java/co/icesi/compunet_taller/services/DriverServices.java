package co.icesi.compunet_taller.services;

import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.repository.DriverRepository;

import java.util.List;

//Clase para implementar la logica
public class DriverServices {
    private DriverRepository driverRepository;

    public DriverServices(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    //Obtener todos los conductores
    public List<Driver> findAllDrivers() {
        List<Driver> conductores = driverRepository.getDrivers();
        if (conductores.isEmpty()) {
            System.out.println("No hay conductores registrados");
        }
        return conductores;
    }

    //Crear un conductor
    public void createDriver(Driver driver) {
        if (!driverRepository.exists(driver)) {
            driverRepository.save(driver);
        } else {
            System.out.println("Conductor ya existe");
        }
    }

    //Buscar un conductor por ID
    public Driver findDriver(String numId) {
        if (numId == null) {
            throw new IllegalArgumentException("El número de identificación no puede ser nulo");
        }
        Driver driver = driverRepository.findDriver(numId);
        if (driver == null) {
            System.out.println("Conductor no encontrado con el número de identificación: " + numId);
        } else {
            // Imprimir la lista de vehículos del conductor
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
