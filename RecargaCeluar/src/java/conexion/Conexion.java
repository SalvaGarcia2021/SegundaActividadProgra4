package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    static String bd = "RecargasBD";
    static String user = "root";
    static String pass = "2341root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    Connection conn = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("ESTAMOS CONECTADOS :D");
            }
        } catch (Exception e) {
            System.out.println("NO NOS PUDIMOS CONECTAR D: " + e);

        }
    }

    public Connection Conectar() {
        return conn;
    }

    public void Desconectar() throws Exception {
        conn.close();
    }
}
