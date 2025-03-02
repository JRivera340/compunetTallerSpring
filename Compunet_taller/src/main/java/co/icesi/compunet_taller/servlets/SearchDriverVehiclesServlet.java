package co.icesi.compunet_taller.servlets;


import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.services.DriverServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/searchDriverVehicles")
public class SearchDriverVehiclesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String numIdentificacion = request.getParameter("numIdentificacion");
        DriverServices driverService = (DriverServices) getServletContext().getAttribute("driverService");
        Driver driver = driverService.findDriver(numIdentificacion);
        request.setAttribute("driver", driver);
        request.getRequestDispatcher("searchDriverVehiclesResult.jsp").forward(request, response);
    }
}
