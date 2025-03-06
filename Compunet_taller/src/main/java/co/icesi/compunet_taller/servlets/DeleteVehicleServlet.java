package co.icesi.compunet_taller.servlets;

import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import java.io.IOException;

@WebServlet("/deleteVehicle")
public class DeleteVehicleServlet extends HttpServlet {

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
        try {
            vehicleService.deleteVehicleByPlaca(placa);
            request.setAttribute("message", "Vehículo con placa " + placa + " eliminado exitosamente.");
        } catch (IllegalArgumentException e) {
            request.setAttribute("message", e.getMessage());
        }
        request.getRequestDispatcher("deleteVehicleResult.jsp").forward(request, response);
    }
}
