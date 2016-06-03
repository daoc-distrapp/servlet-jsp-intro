
package codigo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dordonez@ute.edu.ec
 */
@WebServlet(name = "Controlador", urlPatterns = "/Login")
public class ControllerServlet extends HttpServlet {
    @EJB
    ModelEJB modelo;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        out.println("Debe utilizar el formulario login.html");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recupera información enviada por el cliente
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        
        //envía al modelo para procesamiento
        String[] permisos = modelo.autentica(usuario, clave);
        
        //verifica si está OK
        if(permisos == null) {
            response.sendRedirect("error.html");
            return;
        }
        
        //redirecciona a la vista
        request.setAttribute("permisos", permisos);
        request.getRequestDispatcher("/vista.jsp").forward(request,response);
    }

}
