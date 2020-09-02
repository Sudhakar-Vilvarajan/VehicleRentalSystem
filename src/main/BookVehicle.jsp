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
avo=(AvailableVehicleVO)request.getAttribute("savo");%>
<H3>Available Vehicles</H3>
  <form action="" method="post">
  <table border="1" style="width:90% ; margin-left:5%;">

  <tr>
    <th> S.No </th>
    <th>Car CarCompany</th>
    <th>Car Model</th>
    <th>Car Number</th>
    <th>Available Until</th>
    <th>Rent Per Day</th>
  </tr>

   <% int total=0;
    for( int i=0;i<avo.CarCompany.size();i++)
    {%>
  <tr>
    <td><%=i+1%></td>
    <td><%=avo.CarCompany.get(i)%></td>
    <td><%=avo.CarModel.get(i)%></td>
    <td><%=avo.Vehiclenumber.get(i)%></td>
    <td><%=avo.Leaseenddate.get(i)%></td>
    <td><%=avo.Rentamount.get(i)%></td>
    <% total =total+avo.Rentamount.get(i);%>
  </tr>
  <%}%>
</table>
<input type="text" value=total>
<input type="submit" value="Pay Amount">
</form>
</div>
</body>
</html>