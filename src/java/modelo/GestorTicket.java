package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lisandro
 */
public class GestorTicket implements DAO<Ticket> {

    @Override
    public boolean crear(Ticket ticket) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql = "INSERT INTO tickets(id_persona, id_categoria, cantidad, precio_unitario)"
                + " VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ticket.getId_persona());
            ps.setInt(2, ticket.getId_categoria());
            ps.setInt(3, ticket.getCantidad());
            ps.setFloat(4, ticket.getPrecio_unitario());

            if (ps.executeUpdate() != 0) {
                resultado = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return resultado;
    }

    @Override
    public boolean modificar(Ticket t, Ticket t1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean borrar(Ticket ticket) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql = "UPDATE tickets SET estado = ? WHERE id_ticket = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, ticket.getId_ticket());

            if (ps.executeUpdate() != 0) {
                resultado = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return resultado;
    }

    public List<VistaTicketModelo> listarDetalle() {
        Connection con = BD.conectar();
        
        List<VistaTicketModelo> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM vista_tickets";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                VistaTicketModelo vista = new VistaTicketModelo(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getFloat(5),
                        rs.getDouble(6)
                );
                lista.add(vista);                
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorCategoria.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GestorCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }

}
