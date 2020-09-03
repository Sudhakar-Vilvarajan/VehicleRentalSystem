package service;

import DAO.BookIdDAO;
import DAO.BookingDetailsDAO;

import java.util.List;

public class BookVehicleService {

    public boolean pay(int amount, String username, List<String> vehnumber)
    {
        BookIdDAO bdao= new BookIdDAO();
        int bookid = bdao.getmaxbookid("select max(BookingId) as BookingId from bookingdetails");
        System.out.println("bookId is "+bookid);
        BookingDetailsDAO dao = new BookingDetailsDAO();
        boolean res =dao.updateinsertdata("INSERT INTO `bookingdetails` (`BookingId`, `User`, `Rent Amount Paid`) VALUES ('"+
                (bookid+1) +"','"+username+"','"+amount+"')");
        if(res)
        {
            StringBuilder query=new StringBuilder();
            query.append("Update vehicledetails set BookingId=\"");
            query.append(bookid+1);
            query.append("\" where VehicleNumber in (\"");
            for(int i=0;i<vehnumber.size();i++){
                if(i==0){                }
                else
                {query.append(",\"");
                }
                query.append(vehnumber.get(i));
                query.append("\"");
            }
            query.append(")");
            dao.updateinsertdata(query.toString());
            return true;
        }
        return false;
    }
}
