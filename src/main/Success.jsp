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
<form action="redirectservlet" method="post">
<H2 style="color:red"> VEHICLE BOOKED SUCCESSFULLY</H2>
<div class="image">
<img src="resources/car.png" style="height: 350px; width: 600px;">
</div>
<input type="submit" value="Back">
<%
String username =(String)request.getAttribute("username");
pageContext.setAttribute("username", username, PageContext.APPLICATION_SCOPE);
%>
</div>
</body>
</html>