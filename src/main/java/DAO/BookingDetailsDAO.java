package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookingDetailsDAO {

    public boolean updateinsertdata(String query) {
        boolean result=false;
        System.out.println(query);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleDB", "root", "password");
            Statement stmt = con.createStatement();
            stmt.execute(query);
            con.close();
            result = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}

