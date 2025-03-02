package co.icesi.compunet_taller.cofig;

import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.repository.DriverRepository;
import co.icesi.compunet_taller.repository.VehicleRepository;
import co.icesi.compunet_taller.services.DriverServices;
import co.icesi.compunet_taller.services.VehicleServices;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 1. Crear repositorios en memoria
        DriverRepository driverRepo = new DriverRepository();
        VehicleRepository vehicleRepo = new VehicleRepository();

        // 2. Crear servicios
        DriverServices driverService = new DriverServices(driverRepo);
        VehicleServices vehicleService = new VehicleServices(vehicleRepo, driverService);

        // 3. Crear los conductores
        Driver driver1 = new Driver();
        driver1.setId("01");
        driver1.setName("Juan Amor");
        driver1.setCargo("Profesor");
        driver1.setTipo_identifacion(1);
        driver1.setNum_identificacion("114382811");

        Driver driver2 = new Driver();
        driver2.setId("02");
        driver2.setName("Joshua Rivera");
        driver2.setCargo("Monitor");
        driver2.setTipo_identifacion(2);
        driver2.setNum_identificacion("114629291");

        Driver driver3 = new Driver();
        driver3.setId("03");
        driver3.setName("Joseph Velez");
        driver3.setCargo("Estudiante");
        driver3.setTipo_identifacion(1);
        driver3.setNum_identificacion("11202392");

        driverRepo.save(driver1);
        driverRepo.save(driver2);
        driverRepo.save(driver3);

        // 5. Crear 9 vehículos con datos más "reales"
        Vehicle vehicle1 = new Vehicle("V001","ABC123","1600","Gasolina", "MOTORA123B12", "Toyota", 2021);
        Vehicle vehicle2 = new Vehicle("V002","BCD234","2000","Gasolina", "MOTORB123C34", "Mazda", 2020);
        Vehicle vehicle3 = new Vehicle("V003","CDE345","1800","Gasolina", "MOTORC123D56", "Nissan", 2019);
        Vehicle vehicle4 = new Vehicle("V004","DEF456","1200","Gasolina", "MOTORD123E78", "Kia", 2018);
        Vehicle vehicle5 = new Vehicle("V005","EFG567","1000","Gasolina", "MOTORE123F90", "Chevrolet", 2022);
        Vehicle vehicle6 = new Vehicle("V006","FGH678","2500","Gasolina", "MOTORF123G12", "Ford", 2023);
        Vehicle vehicle7 = new Vehicle("V007","GHI789","2000","Gasolina", "MOTORG123H34", "Hyundai", 2017);
        Vehicle vehicle8 = new Vehicle("V008","HIJ890","2200","Gasolina", "MOTORH123I56", "BMW", 2021);
        Vehicle vehicle9 = new Vehicle("V009","IJK901","3000","Gasolina", "MOTORI123J78", "Mercedes", 2023);

        // 6. Asignar los vehículos a conductores
        vehicleService.addVehicleToDriver(vehicle1, driver1.getId());
        vehicleService.addVehicleToDriver(vehicle2, driver1.getId());
        vehicleService.addVehicleToDriver(vehicle3, driver1.getId());

        vehicleService.addVehicleToDriver(vehicle4, driver2.getId());
        vehicleService.addVehicleToDriver(vehicle5, driver2.getId());
        vehicleService.addVehicleToDriver(vehicle6, driver2.getId());

        vehicleService.addVehicleToDriver(vehicle7, driver3.getId());
        vehicleService.addVehicleToDriver(vehicle8, driver3.getId());
        vehicleService.addVehicleToDriver(vehicle9, driver3.getId());

        sce.getServletContext().setAttribute("driverService", driverService);
        sce.getServletContext().setAttribute("vehicleService", vehicleService);

        System.out.println("=== DataInitializer: Datos de ejemplo cargados exitosamente ===");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
