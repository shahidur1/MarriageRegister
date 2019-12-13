<%-- 
    Document   : kazipanel
    Created on : Jul 1, 2019, 11:04:46 AM
    Author     : APCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]>      <html class="no-js"> <!--[endif]-->
<html>
    <head>
	<meta charset="utf-8">
	<title>Muslim Marriage Register Activity Panel</title>
	<meta name="description" content="">
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- <link rel="shortcut icon" href="img/favicon.png"> -->
	
	<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet'>
	
	<!-- Syntax Highlighter -->
                
	<link rel="stylesheet" type="text/css" href="MRegister/kazipanel/syntax-highlighter/styles/shCore.css" media="all">
	<link rel="stylesheet" type="text/css" href="MRegister/kazipanel/syntax-highlighter/styles/shThemeDefault.css" media="all">
	
	<!-- Font Awesome CSS-->
	<link rel="stylesheet" href="MRegister/kazipanel/css/font-awesome.min.css">
	<!-- Normalize/Reset CSS-->
	<link rel="stylesheet" href="MRegister/kazipanel/css/normalize.min.css">
	<!-- Main CSS-->
	<link rel="stylesheet" href="MRegister/kazipanel/css/main.css">
	
</head>

<body id="welcome">
	
	<aside class="left-sidebar">
		<div class="logo">
			<a href="#welcome">
                            <img src="../img/Logo.png" alt="Logo"/> 
			</a>
		</div>
		<nav class="left-nav">
			<ul id="nav">
				<li class="current"><a href="#welcome">Welcome</a></li>
				<li><a href="kazioperation.jsp">Appointment</a></li>
				<li><a href="#mrform">Registration Form</a></li>
				<li><a href="#nkma">Nikahnama</a></li>
				<li><a href="#mcc">Marriage Certificate</a></li>
				<li><a href="#df">Divorce Form</a></li>
				<li><a href="#dl">Divorce Letter</a></li>
				<li><a href="#dc">Divorce Certificate</a></li>
				<li><a href="#trans">Translation</a></li>
				<li><a href="#cm">Candidate for Marriage</a></li>
				<li><a href="home.jsp">Log Out</a></li>
			</ul>
		</nav>
	</aside>
	
	<div id="main-wrapper">
		<div class="main-content">
			<section id="welcome">
				<div class="content-header">
					<h1>Muslim Marriage Register Web Application</h1>
				</div>
				<div class="welcome">
					
					<h2 class="twenty">Welcome To MMR Web Application</h2>
					<p>Firstly, a huge thanks for purchasing this app, your support is truly appreciated!</p>
					<p>This app covers the operations of your all paper works in Muslim Marriage Registration system <code><a href="mailto:support@astik.com">support@astik.com</a></code> Thank you so much!</p>
				</div>
				
			</section>
			
			<section id="appointment">
				<div class="content-header">
					<h1>MMR Web Application</h1>
				</div>
				<h2 class="title">List of Appointment</h2>
				
				<div class="section-content">
					<div class="col-lg-12">
                    <!-- Appointment List Start -->
                    <div>
                        <hr style="border:5;"/>
                    <form action="appssShow.htm">
                    <input type="submit" class="btn btn-toolbar" value="Appointment Requests"></input>
                    </form>
                    
                    </div>
                    <div>
                        <h2 class="heading h2"><u>Available Appointment Requests List</u></h2>
        <table class="table-striped table-hover" border="2" cellspacing="0" cellpadding="5">
            <tr class="table-head table-row">
                <td>Ap ID</td>
                <td>Bride Groom</td>
                <td>BG NID</td>
                <td>BG Birth</td>
                <td>Bride </td>
                <td>B NID</td>
                <td>B Birth</td>
                <td>Phone</td>
                <td>Address</td>
                <td>Mohor</td>
                <td>Type</td>
                <td>Appointment Date</td>
                <td>Kazi Name</td>
                <td>Kazi ID</td>
                <td>District ID</td>
                <td>Approval</td>
            </tr>
            <c:forEach var="a" items="${list}">
                <tr>
                    <td>${a.appointmentid}</td>
                    <td>${a.bgname}</td>
                    <td>${a.bgnid}</td>
                    <td>${a.bgdop}</td>
                    <td>${a.bname}</td>
                    <td>${a.bnid}</td>
                    <td>${a.bdop}</td>
                    <td>${a.phone}</td>
                    <td>${a.address}</td>
                    <td>${a.mohor}</td>
                    <td>${a.mtype}</td>
                    <td>${a.apdate}</td>
                    <td>${a.kaziid}</td>
                    <td>${a.kname}</td>
                    <td>${a.districtid}</td>
                    
                    <td><a href="rdApproval.htm?kaziid=${k.kaziid}&district=${k.district}
                           &districtid=${k.districtid}&ps=${k.ps}&unionn=${k.unionn}
                           &nklicence=${k.nklicence}&kname=${k.kname}
                           &nid=${k.nid}&contact=${k.contact}&email=${k.email}">Decision</a></td>
                </tr>
                
            </c:forEach>
                        
                    
            </table>
                    
                            
                    <hr/>
                    </div>
                    
                    
                    <!-- Appointment List End -->
                                </div>
				</div>
				
			</section>
			<section id="mrform">
				<h2 class="title">Muslim Marriage Registration Form</h2>
				<p class="fifteen"> Fill up all form with valid verified informatio based on appointment information.</p>
				            <table cellspacing="0" align="center" cellpadding="5" width="1000">
<tr>
<td width="170" >Bangladesh from No-1601</td>
<td colspan="3" ></td>
<td width="163" ><div align="right">Attested Copy<br />
  Bridegroom/ Bride</div></td>
</tr>
<tr>
<td width="170" ></td>
<td colspan="3" ><div align="center">Reg.No 28</div></td>
<td width="163" ></td>
</tr>
<tr>
<td width="170" ></td>
<td colspan="3" ><div align="center">Date:</div></td>
<td width="163" ></td>
</tr>
<tr>
<td width="170" ></td>
<td colspan="3" ><div align="center"><strong>NIKAHNAMA</strong></div></td>
<td width="163" ></td>
</tr>
<tr>
<td width="170" ><p align="center"></td>
<td colspan="3" ><p align="center"><em>Form of Nikahnama as prescribed under section 9 of the MuslimMarriage and Divorce (Registration) Act, 1974(L-II of 1974)</em></p></td>
<td width="163" ><p align="center"></td>
</tr>
</table>
<form>
<table border="1" cellspacing="0" align="center" cellpadding="5" width="1000">
<hr />
<tr>
<td><p>1. Name of theTown, union, Tahshil,Thana and District in which the Marriage Place: </p></td>
<td width="10" >:</td>
<td width="640" colspan="3" ><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>2. Name of thebridegroom and his father's with their respective residence:</p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>3. Age \Date ofthe bridegroom <u>: </u></p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="text" name="" /></td>
</tr>
<tr>
<td><p>4. The name ofbride and her father with their respective residence:</p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>5. Whether thebride is a maiden, a window or divorce : </p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="text" name="" /></td>
</tr>
<tr>
<td><p>6. Age \Date ofthe bride :<u> </u> </p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="text" name="" /></td>
</tr>
<tr>
<td><p>7. Name of the Yakil . If any, appointed by the bride, his fathers name and his residence: </p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>8. The name ofthe Witness to the bride's Yakil with theirfather's name, their residence and their relationship with the bride: </p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>9. Name of the Yakil, If any,appointed by the bridegroom, his father's residence : </p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="text" name="" /></td>
</tr>
<tr>
<td><p>10. The name ofthe witness to the appointed by the bridegroom's Yakil,with their father's name andtheir residence : </p></td>
<td width="10" >:</td>
<td colspan="3" ><input type="text" name="" /></td>
</tr>
<tr>
<td><p>11. Name of thewitness to the marriage, their father's and their residence : </p></td>
 <td width="10" >:</td>
<td colspan="3" ><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>12. Date on which the marriage was contracted: (MarriageDate) </p></td>
 <td width="10" >:</td>
<td colspan="3" ><input type="text" name="" /></td>
</tr>
<tr>
<td><p>13. Amount ofdower : </p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>14. How much ofthe dower is Mu'ajjal (prompt) and how much Mu'ajjal (differed) </p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>15. Whether any portion of the dower was paid at the time of marriage. If so, how much  </p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>16. Whether any property was given of the whole or any portion of the dower, with specification of the same and itsvaluation agreed to between the parties: <br />
</p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>17. Specialcondition, if any: </p></td>
<td width="10" >:</td>
<td><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>18.Whether the husband delegate the power of divorce to the wife. Ifso, under what condition: </p></td>
<td width="10" >:</td>
<td><input type="textarea" name="" /></td>
</tr>
<tr>
<td><p>19. Whether thehusband's right of divorce is any way curtailed: </p></td>
 <td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>20. Whether any document was drawn up at the time ofmarriage relation to dower, Maintenanceetc. if Yes. Contents there of in brief </p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>21. Whether the bridegroom has any existing wife and ifso, whether he has secured the permissionof the Arbitration Council under the Muslim Family Laws Ordinance 1961 to contract another marriage bridegroom, Advocateand presented men said that is the marriage of bridegroom:&nbsp; </p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>22. Number anddate of the communication conveying to the bridegroom the permission of theArbitration</p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>23. Names andaddress of the person by whom marriage was Solemnized and his father: </p></td>
 <td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>24. Date of registration of marriage:</p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
<td><p>25. Registration fee Paid: </p></td>
<td width="10" >:</td>
<td><input type="text" name="" /></td>
</tr>
<tr>
	<td><input type="reset" value="Reset" /></td>
	<td></td>
	<td><input name="submit" type="submit" value="Submit" /></td>
</tr>
</table>
</form>
			</section>
						
			<section id="nkma">
				<h2 class="title">Nikahnama</h2>
				<table cellspacing="0" align="center" cellpadding="5" width="1000">
<tr>
<td width="170" >Bangladesh from No-1601</td>
<td colspan="3" ></td>
<td width="163" ><div align="right">Attested Copy<br />
  Bridegroom/ Bride</div></td>
</tr>
<tr>
<td width="170" ></td>
<td colspan="3" ><div align="center">Reg.No 28</div></td>
<td width="163" ></td>
</tr>
<tr>
<td width="170" ></td>
<td colspan="3" ><div align="center">Date:</div></td>
<td width="163" ></td>
</tr>
<tr>
<td width="170" ></td>
<td colspan="3" ><div align="center"><strong>NIKAHNAMA</strong></div></td>
<td width="163" ></td>
</tr>
<tr>
<td width="170" ><p align="center"></td>
<td colspan="3" ><p align="center"><em>Form of Nikahnama as prescribed under section 9 of the MuslimMarriage and Divorce (Registration) Act, 1974(L-II of 1974)</em></p></td>
<td width="163" ><p align="center"></td>
</tr>
</table>
<table border="1" cellspacing="0" align="center" cellpadding="5" width="1000">
<hr />
<tr>
<td><p>1. Name of theTown, union, Tahshil,Thana and District in which the Marriage Place: </p></td>
<td width="10" >:</td>
<td width="640" colspan="3" ><p>Office of the Muslim Marriage Register &amp; Kazi,3 &amp; 4 No Ward, Munshiganj  Municipality, Munshiganj. </p></td>
</tr>
<tr>
<td><p>2. Name of thebridegroom and his father's with their respective residence:</p></td>
<td width="10" >:</td>
<td colspan="3" ><p>MOHAMMAD ALAMIN, S/O- MOHAMMAD SURUJ MIAH &amp; JAHANARA BEGUM OF VILLAGE- SHUKHBASPUR, POSTOFFICE- SHUKHBASPUR, POLICE STATION- MUNSHIGANJ SADAR, DISTRICT- MUNSHIGANJ. </p></td>
</tr>
<tr>
<td><p>3. Age \Date ofthe bridegroom <u>: </u></p></td>
<td width="10" >:</td>
<td colspan="3" ><p>01 MAY 1980 </p></td>
</tr>
<tr>
<td><p>4. The name ofbride and her father with their respective residence:</p></td>
<td width="10" >:</td>
<td colspan="3" ><p>AFROZA AKTER, D/O-MD. ABUL HOSSAIN SHEIKH &amp; MARIAM BEGUM OF VILLAGE &mdash; NORTH MULCHAR, POST OFFICE-DIGHIRPAR, POLICE STATION &mdash; TONGIBARI, DISTRICT &mdash;MUNSHIGANJ. </p></td>
</tr>
<tr>
<td><p>5. Whether thebride is a maiden, a window or divorce : </p></td>
<td width="10" >:</td>
<td colspan="3" ><p>MAIDEN </p></td>
</tr>
<tr>
<td><p>6. Age \Date ofthe bride :<u> </u> </p></td>
<td width="10" >:</td>
<td colspan="3" ><p>18 Years </p></td>
</tr>
<tr>
<td><p>7. Name of the Yakil . If any, appointed by the bride, his fathers name and his residence: </p></td>
<td width="10" >:</td>
<td colspan="3" ><p>ABDUR RASHID LITON, S/O- HAZI ABUL KALAM OF VILLAGE&shy;SHUKHBASPUR, POST OFFICE-SHUKHBASPUR, POLICE STATION&shy;MUNSHIGANJ SADAR, DISTRICT- MUNSHIGANJ. </p></td>
</tr>
<tr>
<td><p>8. The name ofthe Witness to the bride's Yakil with theirfather's name, their residence and their relationship with the bride: </p></td>
<td width="10" >:</td>
<td colspan="3" ><p>a. KAZI MD. MOKTER HOSSAIN, S/O- KAZI ABDUR RASHID OFVILL&shy;KAMARKHARA, P. 0.- KAMARKHARA, POLICE STATION &mdash;TONGIBARI, DISTRICT &mdash;MUNSHIGANJ. <br />
b. MD. ABDUL HAI MASTER, S/0 LATE GOLBOX SHEIKH OF VILLAGE &mdash;NORTH MULCHAR, POST OFFICE- DIGHIRPAR, POLICE STATION &mdash; TONGIBARI, DISTRICT &mdash;MUNSHIGANJ. </p></td>
</tr>
<tr>
<td><p>9. Name of the Yakil, If any,appointed by the bridegroom, his father's residence : </p></td>
<td width="10" >:</td>
<td colspan="3" ><p>NO </p></td>
</tr>
<tr>
<td><p>10. The name ofthe witness to the appointed by the bridegroom's Yakil,with their father's name andtheir residence : </p></td>
<td width="10" >:</td>
<td colspan="3" ><p>a. THAT<br />
b.THAT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p></td>
</tr>
<tr>
<td><p>11. Name of thewitness to the marriage, their father's and their residence : </p></td>
 <td width="10" >:</td>
<td colspan="3" ><p>MD. ATAUR RAHMAN, S/0 LATE JALAL UDDIN OF VILLAGE&shy;SHUKHBASPUR, POST OFFICE-SHUKHBASPUR, POLICE STATION&shy;MUNSHIGANJ SADAR, DISTRICT- MUNSHIGANJ.<br />
MD. SHAHJAHAN MIAH, S/O- LATE ABDUL GONI MIAH OF VILLAGE&shy;SHUKHBASPUR, POST OFFICE-SHUKHBASPUR, POLICE STATION&shy;MUNSHIGANJ SADAR, DISTRICT- MUNSHIGANJ. </p></td>
</tr>
<tr>
<td><p>12. Date on which the marriage was contracted: (MarriageDate) </p></td>
 <td width="10" >:</td>
<td colspan="3" ><p>13.06.2008</p></td>
</tr>
<tr>
<td><p>13. Amount ofdower : </p></td>
<td width="10" >:</td>
<td><p>2,00,000/- (TWOLACKS) TAKA ONLY.</p></td>

</tr>
<tr>
<td><p>14. How much ofthe dower is Mu'ajjal (prompt) and how much Mu'ajjal (differed) </p></td>
<td width="10" >:</td>
<td><p>Half Half</p></td>

</tr>
<tr>
<td><p>15. Whether any portionof the dower was paid at the time of marriage. If so, how much <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </p></td>
<td width="10" >:</td>
<td><p>X</p></td>

</tr>
<tr>
<td><p>16. Whether any property was given of the whole or any portion of the dower, with specification of the same and itsvaluation agreed to between the parties: <br />
</p></td>
<td width="10" >:</td>
<td><p>NO </p></td>

</tr>
<tr>
<td><p>17. Specialcondition, if any: </p></td>
<td width="10" >:</td>
<td><p>1. I WILL BEHAVE WITH MY WIFE AS A GENTALMAN ACCORDING ISLAMIC SHARIAH, <br />
2. I WILL GIVE MONTH EXPENSES&nbsp; LOGICALLYAS PER NEED OF TIME. <br />
3. I WILL NOT MARRY ANY OTHER WOMEN WITHOUT HER PRIOR PERMISSION. </p></td>

</tr>
<tr>
<td><p>18.Whether the husband delegate the power of divorce to the wife. Ifso, under what condition: </p></td>
<td width="10" >:</td>
<td><p>yes. if I become absconding or if I become impotent orbecome mad or become imprisonedor do not pay her about Three month expense, If do not pay her dower demand, she may divorce at her will. </p></td>

</tr>
<tr>
<td><p>19. Whether thehusband's right of divorce is any way curtailed: </p></td>
 <td width="10" >:</td>
<td><p>NO</p></td>

</tr>
<tr>
<td><p>20. Whether any document was drawn up at the time ofmarriage relation to dower, Maintenanceetc. if Yes. Contents there of in brief </p></td>
<td width="10" >:</td>
<td><p>No</p></td>

</tr>
<tr>
<td><p>21. Whether the bridegroom has any existing wife and ifso, whether he has secured the permissionof the Arbitration Council under the Muslim Family Laws Ordinance 1961 to contract another marriage bridegroom, Advocateand presented men said that is the marriage of bridegroom:&nbsp; </p></td>
<td width="10" >:</td>
<td><p>FIRSTMARRAIGE </p></td>

</tr>
<tr>
<td><p>22. Number anddate of the communication conveying to the bridegroom the permission of theArbitration</p></td>
<td width="10" >:</td>
<td>No</td>

</tr>
<tr>
<td><p>23. Names andaddress of the person by whom marriage was Solemnized and his father: </p></td>
 <td width="10" >:</td>
<td><p>HAFEZ MD. ABDUL AWAL KHAN, MARRIAGE REGISTER. </p></td>
</tr>
<tr>
<td><p>24. Date of registration of marriage:</p></td>
<td width="10" >:</td>
<td><p>14.06. 2008... </p></td>

</tr>
<tr>
<td><p>25. Registration fee Paid: </p></td>
<td width="10" >:</td>
<td><p>2000</p></td>

</tr>
</table>
				
				</section>
				
				<section id="mcc">
					<h2 class="title"> Marriage Certificate </h2>
					<div class="script-source">
                                            
                                        <p align="center"><strong>Government  of the People's Republic of Bangladesh <br />
  </strong>office  of the Muslim Marriage Register &amp; Kazi,<strong> </strong><br />
  3 &amp; 4 no ward, Munshiganj Municipality, Munshiganj.</p>
<p align="center">&nbsp;</p>
<p align="center"><strong><u>MARRIAGE CERTIFICATE</u></strong></p>
<p align="justify">This is to certify  that MOHAMMAD ALAMIN, S/O- MOHAMMAD  SURUJ MIAH &amp; JAHANARA BEGUM of Village SHUKHBASPUR, Post Office- SHUKHBASPUR, Police Station- MUNSHIGANJ SADAR,  District- MUNSHIGANJ, Date of Birth -  01 may 1980 married to AFROZA AKTER, D/O- MD. ABUL HOSSAIN SHEIKH &amp; MARIAM BEGUM of Village - NORTH MULCHAR, Post  Office- DIGHIRPAR, Police Station- &shy;TONGIBARI,  District -MUNSHIGANJ, Date of Birth - 19 jun 1992.  The marriage was solemnized on the  13-07-2010 at the office of the Muslim Marriage Register &amp; Kazi, 3 &amp; 4 no ward, MUNSHIGANJ MUNICIPALITY, MUNSHIGANJ and registered in my  office on the 13/07/2015 at the office of the Muslim Marriage Register  &amp; Kazi, 3 &amp; 4 no ward, MUNSHIGANJ  MUNICIPALITY, MUNSHIGANJ, being the Registration no- 60/2015, Serial no -a/24,  Volume no - 2/2015, page no. - 45 in the year of 2015 in respect of MUNSHIGANJ, Bangladesh. I wish them every success in life.</p>
<p>&nbsp;</p>
<p align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <u>.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (Ahmad Kareem)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; .</u><br />
  &nbsp;Muslim Marriage Register &amp; Kazi,<strong> </strong><br />
  3 &amp; 4 no ward, Munshiganj Municipality, Munshiganj. </p>
<b style="color: red">***Model Certificate All the Certificate will be generated by ID</b>
				</div>
				</section>
				<section id="dl">
					<h2 class="title"> Divorce Letter </h2>
					<div class="script-source">
					<b>Under Construction</b>
                                        <img src="MRegister/kazipanel/UnderConstruct.jpg" alt=""/>
				</div>
			</section>
			<section id="dc">
				<h2 class="title"> Divorce Certificate </h2>
				<!-- 21:9 aspect ratio -->
				<div class="script-source">
					<b>Under Construction</b>
                                        <img src="MRegister/kazipanel/UnderConstruct.jpg" alt=""/>
                                        
				</div>
			</section>
			<section id="trans">
				<h2 class="title">Nikahnama Translation</h2>
				<div class="script-source">
                                    <b>Under Construction</b>
                                    <img src="MRegister/kazipanel/UnderConstruct.jpg" alt=""/>
				</div>
			</section>
			<section id="cm">
				<h2 class="title">Candidate List for Marriage</h2>
				<div class="script-source">
                                    <b>Under Construction</b>
                                <img src="MRegister/kazipanel/UnderConstruct.jpg" alt=""/>

				</div>
			</section>
		</div>
	</div>
	
	
	<!-- Essential JavaScript Libraries
	==============================================-->
        <script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
        <script src="js/jquery.nav.js" type="text/javascript"></script>
        <script src="syntax-highlighter/scripts/shCore.js" type="text/javascript"></script>
        <script src="syntax-highlighter/scripts/shBrushXml.js" type="text/javascript"></script>
        <script src="syntax-highlighter/scripts/shBrushCss.js" type="text/javascript"></script>
        <script src="syntax-highlighter/scripts/shBrushJScript.js" type="text/javascript"></script>
        <script src="syntax-highlighter/scripts/shBrushPhp.js" type="text/javascript"></script>
        <script src="syntax-highlighter/scripts/shBrushJava.js" type="text/javascript"></script>
        <script type="text/javascript">
	SyntaxHighlighter.all()
	</script>
        <script src="js/custom.js" type="text/javascript"></script>
	
</body>
</html>
