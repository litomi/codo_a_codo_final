package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GestorPersona;
import modelo.GestorTicket;
import modelo.Persona;
import modelo.Ticket;

/**
 *
 * @author Lisandro
 */
@WebServlet(name = "TicketControlador", urlPatterns = {"/TicketControlador"})
public class TicketControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.sendRedirect("/Codo_a_codo_final/?page=form#formulario-tickets");
        

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        //int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int cantidad = !request.getParameter("cantidad").isBlank() ? Integer.parseInt(request.getParameter("cantidad")) : -1;
        int categoria = !request.getParameter("categoria").isBlank() ? Integer.parseInt(request.getParameter("categoria")) : -1;

        if (!nombre.isBlank()
                && !apellido.isBlank()
                && !correo.isBlank()
                && cantidad > 0
                && categoria != -1) {
            Persona persona = new Persona(nombre, apellido, correo);
            GestorPersona gestorPersona = new GestorPersona();
            gestorPersona.crear(persona);

            Ticket ticket = new Ticket(
                    gestorPersona.getId_creado_persona(),
                    categoria,
                    cantidad,
                    200
            );

            new GestorTicket().crear(ticket);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
