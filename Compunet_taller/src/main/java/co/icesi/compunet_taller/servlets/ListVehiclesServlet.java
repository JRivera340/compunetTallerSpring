package co.icesi.compunet_taller.servlets;

import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.inject.Inject;
import java.io.IOException;
import java.util.List;

@WebServlet("/listVehicles")
public class ListVehiclesServlet extends HttpServlet {

    @Inject
    private VehicleServices vehicleService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Vehicle> vehicles = vehicleService.getVehicles();
        request.setAttribute("vehicles", vehicles);
        request.getRequestDispatcher("listVehicles.jsp").forward(request, response);
    }
}
