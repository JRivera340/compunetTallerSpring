package co.icesi.compunet_taller.servlets;



import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.services.DriverServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listDrivers")
public class ListDriversServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DriverServices driverService = (DriverServices) getServletContext().getAttribute("driverService");
        List<Driver> drivers = driverService.findAllDrivers();
        request.setAttribute("drivers", drivers);
        request.getRequestDispatcher("listDrivers.jsp").forward(request, response);
    }
}
