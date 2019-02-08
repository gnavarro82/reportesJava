package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linde
 */
public class Conexion {

    public static final String url = "jdbc:mysql://localhost/mexico";
    public static final String user = "root";
    public static final String password = "navarro";
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
//            JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }
}
