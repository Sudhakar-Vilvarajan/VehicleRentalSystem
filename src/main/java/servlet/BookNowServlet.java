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
import java.util.Arrays;
import java.util.List;

@WebServlet("/booknowservlet")
public class BookNowServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String[] selectedcars = request.getParameterValues("selectedcars");
    List<String> CarModels =Arrays.asList(selectedcars);
    System.out.println(CarModels);
    AvailableVehicleService avs= new AvailableVehicleService();
    AvailableVehicleVO avo=avs.AvailableVehicle();
    AvailableVehicleVO selectedavo = new AvailableVehicleVO();
    for(int i=0;i<avo.CarCompany.size();i++)
    {
    for(int j=0;j<CarModels.size();j++)
    {
        System.out.println(avo.CarModel.get(i)+"=============="+CarModels.get(j));
        if(avo.CarModel.get(i).equals(CarModels.get(j)))
        {
            selectedavo.CarCompany.add(avo.CarCompany.get(i));
            selectedavo.CarModel.add(avo.CarModel.get(i));
            selectedavo.Vehiclenumber.add(avo.Vehiclenumber.get(i));
            selectedavo.Leaseenddate.add(avo.Leaseenddate.get(i));
            selectedavo.Rentamount.add(avo.Rentamount.get(i));
            System.out.println(selectedavo.getCarCompany());
        }
        }
    selectedavo.setUsername((String)request.getServletContext().getAttribute("username"));
    request.setAttribute("savo",selectedavo);
        RequestDispatcher dispatcher =request.getRequestDispatcher("BookVehicle.jsp");
        dispatcher.forward(request,response);
    }
    }
}