package co.icesi.compunet_taller.model;
import co.icesi.compunet_taller.model.Vehicle;

import java.util.ArrayList;
import java.util.List;


public class Driver {

    private String id;
    private String name;
    private String cargo;
    private int tipo_identifacion;
    private String num_identificacion;
    private List<Vehicle> vehicles = new ArrayList<>();

    public String getId() {
        return id;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    // Método para agregar vehículo
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Driver) {
            Driver driver = (Driver) obj;
            return this.id.equals(driver.getId());
        }
        return false;
    }
    public String getName() {
        return name;
    }
}
