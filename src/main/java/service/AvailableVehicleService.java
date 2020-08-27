package service;

import model.AvailableVehicleVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AvailableVehicleService {

    public AvailableVehicleVO AvailableVehicle() throws ParseException {
        AvailableVehicleVO avo = new AvailableVehicleVO();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<String> CarCompany = Arrays.asList("Toyota", "Toyota", "Honda", "Nissan", "BMW", "Benz");
        List<String> CarModel = Arrays.asList("Altis","Vios","Jazz","X7","AMG GT");
        List<String> Carnumber= Arrays.asList("TN64 E1234","TN64 S1478","TN01 J4567","TN01 X9876","TN58 X0001","TN64 S1000");
        List<Date> lsdate = Arrays.asList(dateFormat.parse("01/01/2020"),dateFormat.parse("08/01/2020"),
                dateFormat.parse("01/07/2020"),dateFormat.parse("05/07/2020"),
                dateFormat.parse("06/06/2020"),dateFormat.parse("06/09/2020"));
        List<Date> ledate = Arrays.asList(dateFormat.parse("12/31/2020"),dateFormat.parse("01/01/2021"),
                dateFormat.parse("12/31/2020"),dateFormat.parse("06/07/2020"),
                dateFormat.parse("06/06/2021"),dateFormat.parse("08/09/2020"));
        avo.setCarCompany(CarCompany);
        avo.setCarModel(CarModel);
        avo.setVehiclenumber(Carnumber);
        avo.setLeasestartdate(lsdate);
        avo.setLeaseenddate(ledate);
        return avo;
    }
}
