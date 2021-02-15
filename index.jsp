

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body style="background-image: url('img/hut.jpg'); background-size:cover;">
    <center><h2>Java Registration application   </h2></center>
    <form name="form" action="RegisterServlet" method="post" >
        <table align="center">
            <tr>
                <td>First Name</td>
                <td><input type="text" name="firstname"  pattern="[a-zA-Z' ']{1,20}" title="plese enter alphabetical value" required ></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lastName"   pattern="[a-zA-Z' ']{1,20}" title="plese enter alphabetical value" required /></td>
            </tr>
            
            <tr>
                <td>Date of birth</td>
                <td><input type="date" name="dob1"   title="plese enter alphabetical value" required /></td>
            </tr>
            <tr>
                <td>age</td>
                <td><input type="number" name="age"  min="24" max="70" title="plese enter age between 24 to 70" required /></td>
            </tr>
            
            <tr>
                <td>Address1</td>
                <td><input type="text" name="address1" required/></td>
            </tr>
            <tr>
                <td>Address2</td>
                <td><input type="text" name="address2" required /></td>
            </tr>
            <tr>
                <td>City</td>
                <td><input type="text" name="city" required /></td>
            </tr>
            <tr>
                <td>state</td>
                <td><input type="text" name="state" required/></td>
            </tr>
            <tr>
                <td>country</td>
                <td><input type="text" name="country" required /></td>
            </tr>
             <tr>
                <td>postal code</td>
                <td><input type="text" name="postalcode" pattern="[0-9]{6}" required /></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Register"></input><input
                        type="reset" value="Reset"></input></td>
            </tr>
        </table>
    </form>
</body>
</html>