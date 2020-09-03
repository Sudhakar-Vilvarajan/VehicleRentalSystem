package DAO;

import model.AvailableVehicleVO;

import java.sql.*;

public class AvailableVehicleDAO {

    public AvailableVehicleVO runquery(String query) {
        AvailableVehicleVO avo = new AvailableVehicleVO();
        try {
            System.out.println(query);
            ResultSet rs;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleDB", "root", "password");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                avo.CarCompany.add(rs.getString("Company"));
                avo.CarModel.add(rs.getString("Model"));
                avo.Vehiclenumber.add(rs.getString("VehicleNumber"));
                avo.Leasestartdate.add(rs.getDate("LeaseStartDate"));
                avo.Leaseenddate.add(rs.getDate("LeaseEndDate"));
                avo.Leaseamount.add(rs.getInt("LeaseAmount"));
                avo.Rentamount.add(rs.getInt("RentPerDay"));
                avo.Bookingid.add(rs.getInt("BookingId"));
                avo.Vendorname.add(rs.getString("Vendorname"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return avo;
    }
}
