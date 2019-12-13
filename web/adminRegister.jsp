<%-- 
    Document   : adminRegistration
    Created on : Jun 13, 2019, 12:11:01 PM
    Author     : APCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
           <form action="aSave.htm">
            <table>
                <tr>
                    <td>Name</td>
                    <td>:</td>
                    <td><input type="text" name="name"></input></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="text" name="email"></input></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="text" name="password"></input></td>
                </tr>
                <tr>
                    <td>District ID</td>
                    <td>:</td>
                    <td><input type="text" name="districtid"></input></td>
                </tr>
                <tr>
                    <td>District</td>
                    <td>:</td>
                    <td><input type="text" name="district"></input></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Save"></input></td>
                </tr>
            </table>
        </form>
        </body>
    </html>
</f:view>
