<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VehicleRentalSystem</title>
    <link href="Adminhome.css" rel="stylesheet">
    <script>

    </script>
</head>

<body>
<div class="header">
<H1> Vehicle Rental System</H1>
</div>
<div class="bodyPanel">
<form action="AllVehicleServlet" method="post">
<input type="submit" value = "All Vehicles" >
</form>
<form action="BookedVehiclesServlet" method="post">
<input type="submit" value = "Booked Vehicles" >
</form>
<form action="" method="post">
<input type="submit" value = "Vendor Details">
</form>
<div class="bottom-container">
<a href="Index.jsp" style="color:white" class="btn">Log out</a>
</div>
</div>
</body>
</html>