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
           <form action="kSave.htm">
            <table>
                
                <tr>
                    <td>District</td>
                    <td>:</td>
                    <td><input type="text" name="district"></input></td>
                </tr>
                <tr>
                    <td>District ID</td>
                    <td>:</td>
                    <td><input type="text" name="districtid"></input></td>
                </tr>
                <tr>
                    <td>Police Station</td>
                    <td>:</td>
                    <td><input type="text" name="ps"></input></td>
                </tr>
                <tr>
                    <td>Union</td>
                    <td>:</td>
                    <td><input type="text" name="unionn"></input></td>
                </tr>
                <tr>
                    <td>Kazi Office Full Address</td>
                    <td>:</td>
                    <td><textarea cols="15" rows="5" name="fulladdress"></textarea></td>
                </tr>
                <tr>
                    <td>Kazi License Number</td>
                    <td>:</td>
                    <td><input type="text" name="nklicence"></input></td>
                </tr>
                <tr>
                    <td>Kazi Name</td>
                    <td>:</td>
                    <td><input type="text" name="kname"></input></td>
                </tr>
                <tr>
                    <td>Kazi's Father Name</td>
                    <td>:</td>
                    <td><input type="text" name="fname"></input></td>
                </tr>
                <tr>
                    <td>Kazi's Mother Name</td>
                    <td>:</td>
                    <td><input type="text" name="mname"></input></td>
                </tr>
                <tr>
                    <td>Kazi's NID</td>
                    <td>:</td>
                    <td><input type="text" name="nid"></input></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td>:</td>
                    <td><input type="text" name="contact"></input></td>
                </tr>
                <tr>
                    <td>Email Address</td>
                    <td>:</td>
                    <td><input type="text" name="email"></input></td>
                </tr>
                <tr>
                    <td>Educational Qualification</td>
                    <td>:</td>
                    <td><input type="text" name="qualification"></input></td>
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
