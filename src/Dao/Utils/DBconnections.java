package Dao.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnections {

    private static Connection conn;
    private static final String URL =  "jdbc:postgresql://localhost:5432/postgres";
    private static final String connUsername = "postgres";
    private static final String connPassword = "password";

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            try {
                System.out.println("You have connected to the database successfully!");
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            conn = DriverManager.getConnection(URL,connUsername,connPassword);
        }
        return conn;
    } // end of getConnection()

    public static CustomerDaoImpl startCustomerDaoImpl() {
        return new CustomerDaoImpl();
    }



} // end of DBconnections
