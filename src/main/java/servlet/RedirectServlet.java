package servlet;

import model.AvailableVehicleVO;
import service.AvailableVehicleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirectservlet")
public class RedirectServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AvailableVehicleService avs= new AvailableVehicleService();
        AvailableVehicleVO avo=avs.AvailableVehicle();
        avo.setUsername((String)request.getServletContext().getAttribute("username"));
        request.setAttribute("avo",avo);
        RequestDispatcher dispatcher =request.getRequestDispatcher("AvailableVehicle.jsp");
        dispatcher.forward(request,response);

    }
}
