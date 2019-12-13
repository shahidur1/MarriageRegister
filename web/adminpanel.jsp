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
        <div style="align-items: left">
            <form action="kShow.htm">
            <input type="submit" value="Kazi List"></input>
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
                <td>Office</td>
                <td>License No</td>
                <td>Kazi Name</td>
                <td>Father Name</td>
                <td>Mother Name</td>
                <td>NID</td>
                <td>Contact</td>
                <td>Email</td>
                <td>Qualification</td>
                <td>Approval</td>
                <td>Action</td>
            </tr>
            <c:forEach var="k" items="${list}">
                
                <tr>
                    <td>${k.kaziid}</td>
                    <td>${k.district}</td>
                    <td>${k.districtid}</td>
                    <td>${k.ps}</td>
                    <td>${k.unionn}</td>
                    <td>${k.fulladdress}</td>
                    <td>${k.nklicence}</td>
                    <td>${k.kname}</td>
                    <td>${k.fname}</td>
                    <td>${k.mname}</td>
                    <td>${k.nid}</td>
                    <td>${k.contact}</td>
                    <td>${k.email}</td>
                    <td>${k.qualification}</td>
                    <td>${k.approval}</td>
                    <td><a href="rdApproval.htm?kaziid=${k.kaziid}&district=${k.district}
                           &districtid=${k.districtid}&ps=${k.ps}&unionn=${k.unionn}
                           &nklicence=${k.nklicence}&kname=${k.kname}
                           &nid=${k.nid}&contact=${k.contact}&email=${k.email}">Decision</a></td>
                </tr>
                
            </c:forEach>
                        
                    
            </table>
     
    </center>
</body>
</html>
