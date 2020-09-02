package service;

import DAO.AvailableVehicleDAO;
import DAO.LoginDAO;
import model.AvailableVehicleVO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AvailableVehicleService {

    public AvailableVehicleVO AvailableVehicle(){
        AvailableVehicleVO avo = new AvailableVehicleVO();
        AvailableVehicleDAO dao = new AvailableVehicleDAO();
        StringBuilder Query = new StringBuilder("select * from vehicledetails");
        avo= dao.runquery(Query.toString());
        return avo;
    }
}
