<%-- 
    Document   : show
    Created on : Jun 11, 2019, 9:45:39 AM
    Author     : APCL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body>
        <div>
            <form action="kaziforbooking.htm">
                <input type="text" name="district"></input>
                <input type="text" name="unionn"></input>
                <input type="submit" value="Search Kazi"></input>
            </form>
        </div>
          
    <center>
        
    
            <table border="2" cellspacing="0" cellpadding="5">
                <tr>
                <td>Kazi ID</td>
                <td>District</td>
                <td>District ID</td>
                <td>PS</td>
                <td>Union</td>
                <td>License No</td>
                <td>Kazi Name</td>
                <td>NID</td>
                <td>Contact</td>
                <td>Email</td>
                <td>Approval</td>
                <td>Status</td>
                
            </tr>
            <c:forEach var="b" items="${kaalist}">
                
                <tr>
                    <td>${b.kaziid}</td>
                    <td>${b.district}</td>
                    <td>${b.districtid}</td>
                    <td>${b.ps}</td>
                    <td>${b.unionn}</td>
                    <td>${b.nklicence}</td>
                    <td>${b.kname}</td>                 
                    <td>${b.nid}</td>
                    <td>${b.contact}</td>
                    <td>${b.email}</td>
                    <td>${b.approval}</td>
                    <td>${b.status}</td>
                </tr>
                
            </c:forEach>
                        
                    
            </table>
        
    </center>
</body>
</html>
