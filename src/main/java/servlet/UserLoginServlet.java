package servlet;

import model.AvailableVehicleVO;
import service.AvailableVehicleService;
import service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

@WebServlet("/userlogin")
public class UserLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");
        String destpage ="Index.jsp";
        AvailableVehicleVO avo= new AvailableVehicleVO();
        LoginService ls = new LoginService();
        if(ls.VerifyLogin(Username,Password,"USER"))
        {
            AvailableVehicleService avs= new AvailableVehicleService();
            avo=avs.AvailableVehicle();
            avo.setUsername(Username);
            request.setAttribute("avo",avo);
            destpage = "AvailableVehicle.jsp";
        }
        else
        {
            String message ="Invalid Username/password";
            request.setAttribute("message",message);
        }
        RequestDispatcher dispatcher =request.getRequestDispatcher(destpage);
        dispatcher.forward(request,response);
    }
}
