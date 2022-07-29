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
public class GestorCategoria {
    public List<Categoria> listar() {
        
        Connection con = BD.conectar();
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT * FROM categorias";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria(
                        rs.getInt(1), //id_categoria
                        rs.getString(2), //nombre
                        rs.getString(3), // descuento
                        rs.getString(4) //descripción
                );
                categorias.add(categoria);
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

        return categorias;
    }
    
}
