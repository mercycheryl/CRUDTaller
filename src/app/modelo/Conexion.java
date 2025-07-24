package app.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection conectar() {
        // URL con puerto 3308 y parámetros para evitar problemas de SSL y clave pública
        String url = "jdbc:mariadb://localhost:3308/taller?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "1234";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a MariaDB");
        } catch (SQLException e) {
            System.out.println("Error al conectar a MariaDB: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conectar();
    }
}
