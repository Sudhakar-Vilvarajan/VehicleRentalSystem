<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VehicleRentalSystem</title>
    <link href="Loginstyle.css" rel="stylesheet">

    <script>

    </script>
</head>


<body>
<div class="header">
<H1> Vehicle Rental System</H1>
</div>
<div class="bodyPanel">
    <div class="user">
        <form action="userlogin" method="post">
        <br><br>
        <h2>Login - User</h2>
        <br><div class="error">${message}</div><br>
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
        <br><br>
        <div class="bottom-container">
            <a href="#" style="color:white" class="btn">Sign up</a>
        </div>
        </form>
    </div>

    <div class="vendor">
        <form action="vendorlogin" method="post">
        <br><br>
        <h2>Login - Vendor</h2>
        <br><div class="error">${message1}</div><br>
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
        <br><br>
        <div class="bottom-container">
            <a href="#" style="color:white" class="btn">Sign up</a>
        </div>
        </form>
    </div>
    <div class="admin">
        <form action="adminlogin" method="post">
        <br><br>
        <h2>Login - Admin</h2>
        <br><div class="error">${message2}</div><br>
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
        <br><br>
        <div class="bottom-container">
            <a href="#" style="color:white" class="btn">Sign up</a>
        </div>
        </form>
    </div>

</div>
</body>
</html>