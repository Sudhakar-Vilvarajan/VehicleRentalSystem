package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AvailableVehicleVO {

    public List<String> CarCompany = new ArrayList<>();
    public List<String> CarModel   = new ArrayList<>();
    public List<String> Vehiclenumber = new ArrayList<>();
    public List<Date> Leasestartdate = new ArrayList<>();
    public List<Date> Leaseenddate = new ArrayList<>();
    public List<Integer> Leaseamount = new ArrayList<>();
    public List<Integer> Rentamount = new ArrayList<>();
    public String Username;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public List<Integer> getLeaseamount() {
        return Leaseamount;
    }

    public void setLeaseamount(List<Integer> leaseamount) {
        Leaseamount = leaseamount;
    }

    public List<Integer> getRentamount() {
        return Rentamount;
    }

    public void setRentamount(List<Integer> rentamount) {
        Rentamount = rentamount;
    }

    public List<String> getCarModel() {
        return CarModel;
    }

    public void setCarModel(List<String> carModel) {
        CarModel = carModel;
    }

    public List<String> getVehiclenumber() {
        return Vehiclenumber;
    }

    public void setVehiclenumber(List<String> vehiclenumber) {
        Vehiclenumber = vehiclenumber;
    }

    public List<Date> getLeasestartdate() {
        return Leasestartdate;
    }

    public void setLeasestartdate(List<Date> leasestartdate) {
        Leasestartdate = leasestartdate;
    }

    public List<Date> getLeaseenddate() {
        return Leaseenddate;
    }

    public void setLeaseenddate(List<Date> leaseenddate) {
        Leaseenddate = leaseenddate;
    }

    public List<String> getCarCompany() {
        return CarCompany;
    }

    public void setCarCompany(List<String> carCompany) {
        CarCompany = carCompany;
    }
}
