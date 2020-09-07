<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>VehicleRentalSystem</title>
    <link href="AddNewVehicle.css" rel="stylesheet">

 <script>
 function removeRequired(form){
    alert(working);
     $.each(form, function(key, value) {
         if ( value.hasAttribute("required")){
             value.removeAttribute("required");
         }
     });
 }
 </script>

<script type="text/javascript">
   function validateenddate(val) {
     var x = document.getElementById("startdate").value;
     var y = val;
     if(x != null)
     {
     if(x>y)
     {
     alert("End date is less than the start date");
     document.getElementById("enddate").value='';

     }
   }
   }
</script>
<script type="text/javascript">
function validatestartdate(val)
{
var today = new Date();
var dd = today.getDate();
var mm = today.getMonth() + 1;
var yyyy = today.getFullYear();
if (dd < 10) {
            dd = '0' + dd;
        }
        if (mm < 10) {
            mm = '0' + mm;
        }
var today = yyyy + '-' + mm + '-' +dd;
if(today>val)
{
alert("Start date cannot be old dates");
document.getElementById("startdate").value='';
}

}
</script>

</head>

<body>
<div class="header">
<H1> Vehicle Rental System</H1>
</div>
<div class="bodyPanel">
<form action="vendoredirectservlet" method="post" id="formId">
<div class="label">Car Company</div><div class="input"><input type="text" name="carcompany" required></div>
<div class="label">Car Model</div><div class="input"><input type="text" name="carmodel" required></div>
<div class="label">Car Number</div><div class="input"><input type="text" name="carnmber" required></div>
<div class="label">Lease Start Date</div><div class="input"><input type="date" name="startdate" Id="startdate" onchange="validatestartdate(this.value)" required></div>
<div class="label">Lease End Date</div><div class="input"><input type="date" name="enddate" Id="enddate"  onchange="validateenddate(this.value)" required ></div>
<div class="label">Lease Amount</div><div class="input"><input type="numbers" name="leaseamount" required></div>
<div class="label">Rent Per Day</div><div class="input"><input type="numbers" name="rentperday" required></div>
<input type="submit" value="Add" onclick="form.action='AddNewVendorServlet';" style="width:20%">
<input type="submit" value="Back" id="back" name="back" style="width:20%" onClick="removeRequired(this.form)">
</form>

<%
String username = (String) request.getServletContext().getAttribute("username");
pageContext.setAttribute("username", username, PageContext.APPLICATION_SCOPE);
%>
</div>
</body>
</html>