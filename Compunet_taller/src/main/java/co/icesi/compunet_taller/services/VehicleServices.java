package co.icesi.compunet_taller.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.repository.VehicleRepository;
import java.util.List;

@ApplicationScoped
@Named("vehicleServices")
public class VehicleServices {

    @Inject
    private VehicleRepository vehicleRepository;

    @Inject
    private DriverServices driverService;

    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = vehicleRepository.getAllVehicles();
        if (vehicles.isEmpty()) {
            System.out.println("Vehículo no encontrado");
        }
        return vehicles;
    }

    public Vehicle getVehicle(String placa) {
        return vehicleRepository.findVehicle(placa);
    }

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
        driver.addVehicle(vehicle);
        vehicleRepository.save(vehicle);
        System.out.println("Vehículo agregado exitosamente al conductor: " + driver.getName());
    }

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
