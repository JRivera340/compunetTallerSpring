package co.icesi.compunet_taller.services;


import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServices {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private DriverServices driverService;

    // Constructor por defecto (opcional)
    public VehicleServices() {
    }

    // Obtener todos los vehículos
    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = vehicleRepository.getAllVehicles();
        if (vehicles.isEmpty()) {
            System.out.println("Vehículo no encontrado");
        }
        return vehicles;
    }

    // Obtener un vehículo por placa
    public Vehicle getVehicle(String placa) {
        return vehicleRepository.findVehicle(placa);
    }

    // Agregar un vehículo a un conductor
    public void addVehicleToDriver(Vehicle vehicle, String id) {
        if (vehicle == null || id == null) {
            System.out.println("Vehículo no encontrado");
            return;
        } else if (vehicleRepository.existByPlaca(vehicle.getPlaca())) {
            throw new IllegalArgumentException("Ya existe un vehículo con la placa: " + vehicle.getPlaca());
        }
        Driver driver = driverService.findDriver(id);
        if (driver == null) {
            throw new IllegalArgumentException("No se encontró un conductor con el número de identificación: " + id);
        }
        // Asignar el vehículo al conductor
        driver.addVehicle(vehicle);
        vehicleRepository.save(vehicle);
        System.out.println("Vehículo agregado exitosamente al conductor: " + driver.getName());
    }

    // Eliminar un vehículo específico usando la placa
    public void deleteVehicleByPlaca(String placa) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("La placa no puede ser nula o vacía.");
        }
        Vehicle vehicle = vehicleRepository.findVehicle(placa);
        if (vehicle == null) {
            throw new IllegalArgumentException("No existe un vehículo con la placa: " + placa);
        }
        vehicleRepository.delete(vehicle);
        System.out.println("Se ha eliminado el vehículo con placa: " + placa);
    }
}
