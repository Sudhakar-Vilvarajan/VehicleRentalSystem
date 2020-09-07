package service;

import DAO.BookingDetailsDAO;
import model.AvailableVehicleVO;

import java.text.SimpleDateFormat;

public class AddNewVehicleService {

    public boolean addnew(AvailableVehicleVO avo)
    {
        boolean result=false;
        StringBuilder query = new StringBuilder();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        query .append("INSERT INTO `vehicledb`.`vehicledetails` (`Company`, `Model`, " +
                "`VehicleNumber`, `LeaseStartDate`, `LeaseEndDate`, `LeaseAmount`, `RentPerDay`, `BookingId`," +
                " `Vendorname`) VALUES ('");
        query.append(avo.CarCompany.get(0)+"'");
        query.append(", '"+avo.CarModel.get(0)+"'");
        query.append(", '"+avo.Vehiclenumber.get(0)+"'");
        query.append(", '"+sm.format(avo.Leasestartdate.get(0))+"'");
        query.append(", '"+sm.format(avo.Leaseenddate.get(0))+"'");
        query.append(", '"+avo.Leaseamount.get(0)+"'");
        query.append(", '"+avo.Rentamount.get(0)+"'");
        query.append(", '0'");
        query.append(", '"+avo.Username+"'");
        query.append(")");

        BookingDetailsDAO dao = new BookingDetailsDAO();
        result =dao.updateinsertdata(query.toString());
        return result;
    }
}
