package co.icesi.compunet_taller.servlets;

import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.services.DriverServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.inject.Inject;
import java.io.IOException;
import java.util.List;

@WebServlet("/listDrivers")
public class ListDriversServlet extends HttpServlet {

    @Inject
    private DriverServices driverService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Driver> drivers = driverService.findAllDrivers();
        request.setAttribute("drivers", drivers);
        request.getRequestDispatcher("listDrivers.jsp").forward(request, response);
    }
}
