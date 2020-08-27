package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlDAO {
public ResultSet runquery(String query) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/VehicleDB", "root", "password");
//here sonoo is database name, root is username and password
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        con.close();
        return rs;
    } catch (Exception e) {
        System.out.println(e);
    }
return null;
}
}
