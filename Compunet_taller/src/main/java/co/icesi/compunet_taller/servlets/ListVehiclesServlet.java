package co.icesi.compunet_taller.servlets;


import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import jakarta.inject.Inject;

@WebServlet("/listVehicles")
public class ListVehiclesServlet extends HttpServlet {

    @Inject
    private VehicleServices vehicleServices;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        VehicleServices vehicleService = (VehicleServices) getServletContext().getAttribute("vehicleService");
        List<Vehicle> vehicles = vehicleService.getVehicles();
        request.setAttribute("vehicles", vehicles);
        request.getRequestDispatcher("listVehicles.jsp").forward(request, response);
    }
}
