package servlet;

import model.AvailableVehicleVO;
import service.AddNewVehicleService;
import service.VendorVehicleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@WebServlet("/AddNewVendorServlet")
    public class AddNewVehicleServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            AvailableVehicleVO avo = new AvailableVehicleVO();
            String username=(String) request.getServletContext().getAttribute("username");
            System.out.println(username);
            avo.setUsername(username);
            avo.CarCompany.add(request.getParameter("carcompany"));
            avo.CarModel.add(request.getParameter("carmodel"));
            avo.Vehiclenumber.add(request.getParameter("carnmber"));
            String LeaseStartDate = request.getParameter("startdate");
            String LeaseEndDate = request.getParameter("enddate");
            try {
                avo.Leasestartdate.add(new SimpleDateFormat("yyyy-MM-dd").parse(LeaseStartDate));
                avo.Leaseenddate.add(new SimpleDateFormat("yyyy-MM-dd").parse(LeaseEndDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            avo.Leaseamount.add(Integer.parseInt(request.getParameter("leaseamount")));
            avo.Rentamount.add(Integer.parseInt(request.getParameter("rentperday")));

            AddNewVehicleService avs = new AddNewVehicleService();
            System.out.println(avo.getCarModel());
            boolean result = avs.addnew(avo);
            if(result) {
                VendorVehicleService vvs = new VendorVehicleService();
                avo = vvs.vehicledetails(username);
                avo.setUsername(username);
                request.setAttribute("avo", avo);
                String message ="Vehicle added Successfully!!!";
                request.setAttribute("status",message);
            }
            else
            {
                String message ="Failed - Vehicle Not Added!!!";
                request.setAttribute("status",message);
            }
            RequestDispatcher dispatcher =request.getRequestDispatcher("Vendorhome.jsp");
            dispatcher.forward(request,response);
        }
    }
