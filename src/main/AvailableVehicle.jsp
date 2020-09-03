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
Welcome <%=avo.getUsername()%>
  <form action="booknowservlet" method="post">
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
    <td><input type="checkbox" name="selectedcars" value=<%=avo.CarModel.get(i)%> ></td>
    <td><%=avo.CarCompany.get(i)%></td>
    <td><%=avo.CarModel.get(i)%></td>
    <td><%=avo.Vehiclenumber.get(i)%></td>
    <td><%=avo.Leaseenddate.get(i)%></td>
    <td><%=avo.Rentamount.get(i)%></td>
  </tr>
  <%}%>
</table>
<input type="submit" value="Book Now">
</form>
</div>
</body>
</html>