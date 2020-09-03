package DAO;

import java.sql.*;

public class BookIdDAO {

    public int getmaxbookid(String query) {
        int result=0;
        System.out.println(query);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleDB", "root", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                result = rs.getInt("BookingId");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
