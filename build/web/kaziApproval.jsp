<%-- 
    Document   : update
    Created on : May 22, 2019, 11:09:32 AM
    Author     : APCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kazi Application Approval</title>
    </head>
    <body>
       <body>
        <form action="kapprovalSave.htm">
            <table>
                
                <tr>
                    <td>Kazi ID</td>
                    <td>:</td>
                    <td><input type="text" name="kaziid" value="${kazi.kaziid}"></input></td>
                </tr>
                <tr>
                    <td>District</td>
                    <td>:</td>
                    <td><input type="text" name="district" value="${kazi.district}"></input></td>
                </tr>
                <tr>
                    <td>District ID</td>
                    <td>:</td>
                    <td><input type="text" name="districtid" value="${kazi.districtid}"></input></td>
                </tr>
                <tr>
                    <td>Police Station</td>
                    <td>:</td>
                    <td><input type="text" name="ps" value="${kazi.ps}"></input></td>
                </tr>
                <tr>
                    <td>Union</td>
                    <td>:</td>
                    <td><input type="text" name="unionn" value="${kazi.unionn}"></input></td>
                </tr>
                <tr>
                    <td>Kazi License Number</td>
                    <td>:</td>
                    <td><input type="text" name="nklicence" value="${kazi.nklicence}"></input></td>
                </tr>
                <tr>
                    <td>Kazi Name</td>
                    <td>:</td>
                    <td><input type="text" name="kname" value="${kazi.kname}"></input></td>
                </tr>
                <tr>
                    <td>Kazi's NID</td>
                    <td>:</td>
                    <td><input type="text" name="nid" value="${kazi.nid}"></input></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td>:</td>
                    <td><input type="text" name="contact" value="${kazi.contact}"></input></td>
                </tr>
                <tr>
                    <td>Email Address</td>
                    <td>:</td>
                    <td><input type="text" name="email" value="${kazi.email}"></input></td>
                </tr>
                <tr>
                    <td>Approval</td>
                    <td>:</td>
                    <td>
                        <select name="approval">
                            <option value="-1">Select Decision</option>
                            <option value="Approved">Approved</option>
                            <option value="Rejected">Rejected</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Message for Kazi</td>
                    <td>:</td>
                    <td><input type="text" name="status"></input></td>
                </tr>
                <tr>
                    <td>Set Password for Kazi</td>
                    <td>:</td>
                    <td><input type="text" name="password" value="24434"></input></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Update"></input></td>
                </tr>
            </table>
            
        </form>
        
    </body>
    </body>
</html>
