package servlet;

import model.AvailableVehicleVO;
import service.AvailableVehicleService;
import service.VendorVehicleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/vendorredirectservlet")
public class VendorRedirectServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username =(String)request.getServletContext().getAttribute("username");
        VendorVehicleService vvs= new VendorVehicleService();
        AvailableVehicleVO avo=vvs.vehicledetails(Username);
        avo.setUsername(Username);
        request.setAttribute("avo",avo);
        RequestDispatcher dispatcher =request.getRequestDispatcher("Vendorhome.jsp");
        dispatcher.forward(request,response);

    }
}
