package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lisandro
 */
public class BD {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USUARIO = "Lisandro";
    private static final String BASE = "proyecto_codo_a_codo";
    private static final String HOST = "127.0.0.1";
    private static final String PUERTO = "3308";
    private static final String CLAVE = "100280";
    private static Connection con = null;
    
    public static Connection conectar(){
       
        try {
            Class.forName(DRIVER);
            String url = String.format("jdbc:mysql://%s:%s/%s", HOST, PUERTO, BASE);
            con = DriverManager.getConnection(url, USUARIO, CLAVE);          
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return con;
    }
}