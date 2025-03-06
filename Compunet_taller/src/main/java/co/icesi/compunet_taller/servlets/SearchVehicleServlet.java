package co.icesi.compunet_taller.servlets;

import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import java.io.IOException;

@WebServlet("/searchVehicle")
public class SearchVehicleServlet extends HttpServlet {

    @Autowired
    private VehicleServices vehicleService;

    @Override
    public void init() throws ServletException {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String placa = request.getParameter("placa");
        Vehicle vehicle = vehicleService.getVehicle(placa);
        request.setAttribute("vehicle", vehicle);
        request.getRequestDispatcher("searchVehicleResult.jsp").forward(request, response);
    }
}
