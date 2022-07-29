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
public class GestorOrador implements DAO<Orador> {

    public boolean crear(Persona persona, Orador orador) {
        Connection con = BD.conectar();
        boolean resultado = false;

        String sql_persona = "INSERT INTO personas"
                + "(nombre,"
                + "apellido)"
                + " VALUES(?, ?)";

        String sql_orador = "INSERT INTO oradores(id_persona, tema)"
                + "VALUES(?, ?)";

        try {
            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(sql_persona, Statement.RETURN_GENERATED_KEYS);
            ps1.setString(1, persona.getNombre());
            ps1.setString(2, persona.getApellido());            
            ps1.executeUpdate();
            
            ResultSet rsKeys = ps1.getGeneratedKeys();
            long id_persona = -1L;
            
            if(rsKeys.next()){
                id_persona = rsKeys.getLong(1);
                
            }

            PreparedStatement ps2 = con.prepareStatement(sql_orador);
            ps2.setInt(1, (int)id_persona);
            ps2.setString(2, orador.getTema());
            
            if (ps2.executeUpdate() != 0) {
                resultado = true;
                con.commit();
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
    public boolean modificar(Orador actual, Orador nuevo) {        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean borrar(Orador orador) {
        Connection con = BD.conectar();
        boolean resultado = false;        

        String sql = "DELETE oradores, personas"
                + " FROM oradores JOIN personas "
                + " ON oradores.id_persona = personas.id_persona"
                + " WHERE oradores.id_orador = ?";

        try {            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, orador.getId_orador());
            if(ps.executeUpdate() != 0){
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
    public boolean crear(Orador o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
