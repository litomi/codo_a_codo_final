package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lisandro
 */
public class GestorPersona implements DAO<Persona> {
    
    private int id_creado_persona = -1;

    public int getId_creado_persona() {
        return id_creado_persona;
    }

    @Override
    public boolean crear(Persona persona) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql = "INSERT INTO personas"
                + "(nombre,"
                + "apellido, "
                + "correo) "
                + "VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getCorreo());

            if (ps.executeUpdate() != 0) {
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
                id_creado_persona = (int)rs.getLong(1);
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
    public boolean modificar(Persona actual, Persona nuevo) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql = "UPDATE personas SET"
                + " nombre = ?,"
                + " apellido = ?,"
                + " direccion = ?,"
                + " correo = ?"
                + " WHERE id_persona = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nuevo.getNombre());
            ps.setString(2, nuevo.getApellido());
            ps.setString(4, nuevo.getCorreo());
            ps.setInt(8, actual.getId_persona());

            if (0 < ps.executeUpdate()) {
                resultado = true;
            }

        } catch (SQLException e) {
            Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, e);
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
    public boolean borrar(Persona persona) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql = "DELETE FROM personas WHERE id_persona = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, persona.getId_persona());
            resultado = ps.execute();

        } catch (SQLException e) {
            Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, e);
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

    public boolean borrar(int id) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql = "DELETE FROM personas WHERE id_persona = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            resultado = ps.execute();

        } catch (SQLException e) {
            Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, e);
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

}
