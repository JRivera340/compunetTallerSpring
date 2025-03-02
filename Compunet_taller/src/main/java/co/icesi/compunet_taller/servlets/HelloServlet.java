package co.icesi.compunet_taller.servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Configuramos el tipo de contenido a HTML
        response.setContentType("text/html;charset=UTF-8");

        // Escribimos la respuesta HTML
        try(PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Hello Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Hola, Mundo desde el Servlet!</h1>");
            out.println("<p>Este es nuestro primer Servlet corriendo en Jetty.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

