<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VehicleRentalSystem</title>
    <link href="Booknow.css" rel="stylesheet">
    <script>

    </script>
</head>

<body>
<div class="header">
<H1> Vehicle Rental System</H1>
</div>
<div class="bodyPanel">
<%@ page import="model.AvailableVehicleVO"%>
<%AvailableVehicleVO avo;
avo=(AvailableVehicleVO)request.getAttribute("avo");%>
<H3>Available Vehicles</H3>
Welcome <%=avo.getUsername()%>!!!
<br>
  <form action="" method="post">
  <%pageContext.setAttribute("username", avo.getUsername(), PageContext.APPLICATION_SCOPE);%>
  <table border="1" style="width:90% ; margin-left:5%;">

  <tr>
    <th> Select </th>
    <th>Car CarCompany</th>
    <th>Car Model</th>
    <th>Car Number</th>
    <th>Available Until</th>
    <th>Rent Per Day</th>
  </tr>

   <% for( int i=0;i<avo.CarCompany.size();i++)
    {%>
  <tr>
  <%if(avo.Bookingid.get(i)==0)
  {%>
    <td><input type="radio" name="selectedcars" value=<%=avo.CarModel.get(i)%>></td>
    <%}
    else {%>
    <td><input type="radio" name="selectedcars" value=<%=avo.CarModel.get(i)%> disabled></td>
    <%}%>
    <td><%=avo.CarCompany.get(i)%></td>
    <td><%=avo.CarModel.get(i)%></td>
    <td><%=avo.Vehiclenumber.get(i)%></td>
    <td><%=avo.Leaseenddate.get(i)%></td>
    <td><%=avo.Rentamount.get(i)%></td>
  </tr>
  <%}%>
</table>
<input type="submit" value="Add New">
<input type="submit" value="Delete" onclick="form.action='DeleteVehicleServlet';">
</form>
<%pageContext.setAttribute("username", avo.getUsername(), PageContext.APPLICATION_SCOPE);%>
</div>
</body>
</html>