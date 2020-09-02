package DAO;

import java.sql.*;

public class LoginDAO {
public boolean runquery(String query) {
    boolean result = false;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/VehicleDB", "root", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        result =Loginrs(rs);
        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }
return result;
}
public boolean Loginrs(ResultSet rs) throws SQLException {
    while(rs.next())
    {
        return true;
    }
return false;
}
}
