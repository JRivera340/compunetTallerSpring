package co.icesi.compunet_taller.servlets;


import co.icesi.compunet_taller.model.Vehicle;
import co.icesi.compunet_taller.services.VehicleServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addVehicle")
public class AddVehicleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String placa = request.getParameter("placa");
        String cilindraje = request.getParameter("cilindraje");
        String tipoCombustible = request.getParameter("tipoCombustible");
        String numeroMotor = request.getParameter("numeroMotor");
        String marca = request.getParameter("marca");
        int modelo = Integer.parseInt(request.getParameter("modelo"));
        String conductorId = request.getParameter("conductorId");

        Vehicle vehicle = new Vehicle(id, placa, cilindraje, tipoCombustible, numeroMotor, marca, modelo);
        VehicleServices vehicleService = (VehicleServices) getServletContext().getAttribute("vehicleService");
        try {
            vehicleService.addVehicleToDriver(vehicle, conductorId);
            request.setAttribute("message", "Vehículo agregado exitosamente al conductor con identificación " + conductorId);
        } catch (IllegalArgumentException e) {
            request.setAttribute("message", e.getMessage());
        }
        request.getRequestDispatcher("addVehicleResult.jsp").forward(request, response);
    }
}
