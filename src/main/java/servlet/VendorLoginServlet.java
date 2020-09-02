package servlet;

import model.AvailableVehicleVO;
import service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;


@WebServlet("/vendorlogin")
public class VendorLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");
        String destpage ="Index.jsp";
        LoginService ls = new LoginService();
        if(ls.VerifyLogin(Username,Password,"VENDOR"))
        {
            destpage = ".jsp";
        }
        else
        {
            String message ="Invalid Username/password";
            request.setAttribute("message1",message);
        }
        RequestDispatcher dispatcher =request.getRequestDispatcher(destpage);
        dispatcher.forward(request,response);
    }
}