package co.icesi.compunet_taller.model;
import co.icesi.compunet_taller.model.Vehicle;
import java.io.Serializable;


import java.util.ArrayList;
import java.util.List;


public class Driver implements Serializable {


    private String id;
    private String nombre;
    private String cargo;
    private int tipo_identifacion;
    private String num_identificacion;
    private List<Vehicle> vehicles = new ArrayList<>();

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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTipo_identifacion() {
        return tipo_identifacion;
    }

    public void setTipo_identifacion(int tipo_identifacion) {
        this.tipo_identifacion = tipo_identifacion;
    }

    public String getNum_identificacion() {
        return num_identificacion;
    }

    public void setNum_identificacion(String num_identificacion) {
        this.num_identificacion = num_identificacion;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
