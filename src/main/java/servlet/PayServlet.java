package servlet;

import model.AvailableVehicleVO;
import service.AvailableVehicleService;
import service.BookVehicleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/payservlet")
public class PayServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int Totalamount = (int)request.getServletContext().getAttribute("total");
    String Username = (String)request.getServletContext().getAttribute("username");
    List<String> vehnumber = (List)request.getServletContext().getAttribute("vehnumber");
    BookVehicleService bvs = new BookVehicleService();
    if(bvs.pay(Totalamount,Username,vehnumber))
    {
        request.setAttribute("username",Username);
        RequestDispatcher dispatcher =request.getRequestDispatcher("Success.jsp");
        dispatcher.forward(request,response);
    }
    else
    {
        RequestDispatcher dispatcher =request.getRequestDispatcher("failed.jsp");
        dispatcher.forward(request,response);
    }
    }
}
