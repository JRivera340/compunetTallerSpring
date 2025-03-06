package co.icesi.compunet_taller.servlets;

import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

@WebServlet("/listVehicles")
public class ListVehiclesServlet extends HttpServlet {

    @Autowired
    private VehicleServices vehicleServices;  // Campo inyectado por CDI

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Vehicle> vehicles = vehicleServices.getVehicles();  // Usamos la variable inyectada
        request.setAttribute("vehicles", vehicles);
        request.getRequestDispatcher("listVehicles.jsp").forward(request, response);
    }
}
