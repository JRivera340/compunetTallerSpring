package co.icesi.compunet_taller.servlets;



import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/searchVehicle")
public class SearchVehicleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String placa = request.getParameter("placa");
        VehicleServices vehicleService = (VehicleServices) getServletContext().getAttribute("vehicleService");
        Vehicle vehicle = vehicleService.getVehicle(placa);
        request.setAttribute("vehicle", vehicle);
        request.getRequestDispatcher("searchVehicleResult.jsp").forward(request, response);
    }
}

