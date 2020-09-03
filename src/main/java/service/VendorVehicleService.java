package service;

import DAO.AvailableVehicleDAO;
import model.AvailableVehicleVO;

public class VendorVehicleService {
    public AvailableVehicleVO vehicledetails(String username){
        AvailableVehicleVO avo = new AvailableVehicleVO();
        AvailableVehicleDAO dao = new AvailableVehicleDAO();
        StringBuilder Query = new StringBuilder("select * from vehicledetails where Vendorname=\"");
        Query.append(username);
        Query.append("\"");
        avo= dao.runquery(Query.toString());
        return avo;
    }
}