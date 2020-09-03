package servlet;

import DAO.BookingDetailsDAO;
import model.AvailableVehicleVO;
import service.VendorVehicleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteVehicleServlet")
public class DeleteVehicleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String Model = (String)request.getParameter("selectedcars");
    StringBuilder query = new StringBuilder("Delete from vehicledetails where Model=\"");
    query.append(Model);
    query.append("\"");
    BookingDetailsDAO dao = new BookingDetailsDAO();
    boolean result = dao.updateinsertdata(query.toString());

    VendorVehicleService vvs= new VendorVehicleService();
    String username= (String) request.getServletContext().getAttribute("username");
    AvailableVehicleVO avo=vvs.vehicledetails(username);
    avo.setUsername(username);
    request.setAttribute("avo",avo);
    RequestDispatcher dispatcher =request.getRequestDispatcher("Vendorhome.jsp");
    dispatcher.forward(request,response);
    }
}
