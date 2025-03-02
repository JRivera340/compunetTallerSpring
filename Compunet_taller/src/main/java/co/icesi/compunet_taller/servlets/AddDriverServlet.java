package co.icesi.compunet_taller.servlets;


import co.icesi.compunet_taller.model.Driver;
import co.icesi.compunet_taller.services.DriverServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addDriver")
public class AddDriverServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String cargo = request.getParameter("cargo");
        String tipoIdentificacion = request.getParameter("tipoIdentificacion");
        String numIdentificacion = request.getParameter("numIdentificacion");

        Driver driver = new Driver();
        driver.setId(id);
        driver.setName(name);
        driver.setCargo(cargo);
        driver.setTipo_identifacion(Integer.parseInt(tipoIdentificacion));
        driver.setNum_identificacion(numIdentificacion);

        DriverServices driverService = (DriverServices) getServletContext().getAttribute("driverService");
        driverService.createDriver(driver);

        request.setAttribute("message", "Conductor agregado exitosamente.");
        request.getRequestDispatcher("addDriverResult.jsp").forward(request, response);
    }
}
