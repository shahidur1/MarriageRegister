<%-- 
    Document   : home
    Created on : Jun 30, 2019, 2:28:25 PM
    Author     : APCL
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Muslim Marriage Register & Kazi </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800|Sacramento" rel="stylesheet">

    <link href="MRegister/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="MRegister/css/animate.css" rel="stylesheet" type="text/css"/>
    <link href="MRegister/css/owl.carousel.min.css" rel="stylesheet" type="text/css"/>
    <link href="MRegister/fonts/ionicons/css/ionicons.min.css" rel="stylesheet" type="text/css"/>
    <link href="MRegister/fonts/fontawesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="MRegister/css/style.css" rel="stylesheet" type="text/css"/>
    
  </head>
  <body>
    
    <header role="banner">
      <div class="top-bar">
        <div class="container">
          <div class="row">
            <div class="col-6">
              <a href="#"><span class="fa fa-twitter"></span></a>
              <a href="#"><span class="fa fa-facebook"></span></a>
              <a href="#"><span class="fa fa-instagram"></span></a>
              <a href="#"><span class="fa fa-linkedin"></span></a>
            </div>
            
          </div>
        </div>
      </div>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            
            <a class="navbar-brand" href="indexx.html"><img src="MRegister/img/Logo.png" alt=""/></a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05" aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarsExample05">
            <ul class="navbar-nav ml-auto pl-lg-5 pl-0">
              <li class="nav-item">
                  
                <a class="nav-link active" href="home.jsp">Home</a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link" href="news.html">Appointment Status</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="about.html">Complain</a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link" href="contact.html">System Support</a>
              </li>
            </ul>
            
          </div>
        </div>
      </nav>
    </header>
    <!-- END header -->
    <! -- Operation Section -->
    
      
  <!-- Start appointment Area -->
  <section class="appointment-area">			
				<div class="container">
					<div class="row justify-content-between align-items-center pb-120 appointment-wrap">
						<div class="col-lg-5 col-md-6 appointment-left">
							<h1>
								Servicing Hours
							</h1>
							<p>
								24 Hours Monitoring Cell will correspond with your appointment information. But Our Representative will be attend in the following schedules.
							</p>
							<ul class="time-list">
								<li class="d-flex justify-content-between">
									<span>Monday-Friday</span>
									<span>08.00 am - 10.00 pm</span>
								</li>
								<li class="d-flex justify-content-between">
									<span>Saturday</span>
									<span>08.00 am - 08.00 pm</span>
								</li>
								<li class="d-flex justify-content-between">
									<span>Sunday</span>
									<span>10.00 am - 08.00 pm</span>
								</li>																
							</ul>
						</div>
						<div class="col-lg-6 col-md-6 appointment-right pt-60 pb-60">
							<form class="form-wrap" action="apptSave.htm">
								<h3 class="pb-20 text-center mb-30">Book an Appointment</h3>		
								<input type="text" class="form-control" name="bgname" placeholder="Bridegroom Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Bridegroom Name'" >
								<input type="text" class="form-control" name="bgnid" placeholder="Bridegroom NID or Birth C.No" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Bridegroom NID or Birth C.No'" >
								<input id="datepicker1" name="bgdop" class="dates form-control"  placeholder="Bridegroom's Date of Birth" type="text">
                                                                <input type="text" class="form-control" name="bname" placeholder="Bride Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Bride Name'" >
                                                                <input type="text" class="form-control" name="bnid" placeholder="Bride NID or Birth C.No" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Bride NID or Birth C.No'" >
								<input id="datepicker2" name="bdop" class="dates form-control"  placeholder="Bride's Date of Birth" type="text">
								<input type="text" class="form-control" name="phone" placeholder="Phone " onfocus="this.placeholder = ''" onblur="this.placeholder = 'Phone'" >
								<input type="text" class="form-control" name="address" placeholder="Marriage Registration Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Marriage Registration Address'" >
								<input type="text" class="form-control" name="mohor" placeholder="Marriage Den Mohor" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Marriage Den Mohor'" >
                                                                <div class="form-select" id="marriage-type" name="mtype">
									<select>
										<option data-display="">Marriage Type</option>
										<option value="1">First Time</option>
										<option value="2">Second Time</option>
										<option value="3">Third Time</option>
										<option value="4">Fourth Time</option>
									</select>
								</div>	
								<input id="datepicker3" name="apdate" class="dates form-control"  placeholder="appointment Date" type="text">  
								<textarea name="messege" class="" rows="5" placeholder="Messege" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Messege'"></textarea> 
								<input type="text" class="form-control" name="kaziid" value="${kaziappro.kaziid}" placeholder="Kazi Unique Number" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Kazi Unique Number'" >
								<input type="text" class="form-control" name="kname" value="${kaziappro.kname}" placeholder="Kazi Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Kazi Name'" >
                                                                <input type="text" class="form-control" name="districtid" value="${kaziappro.districtid}" placeholder="District ID" onfocus="this.placeholder = ''" onblur="this.placeholder = 'District ID'" >
                                                                <input type="submit" class="primary-btn text-uppercase" value="Confirm Booking"></input>
							</form>
						</div>
					</div>
				</div>	
			</section>
			<!-- End appointment Area -->
  
    <!-- END slider -->
    
    <section class="section bg-light">
      <div class="container">
        <div class="row justify-content-center mb-5 element-animate">
          <div class="col-md-8 text-center">
              <h2 class="text-uppercase heading mb-4">Waiting Muslim &AMP; Muslimah</h2>
            <p class="mb-5 lead"> We have a good number of muslimah bio data you can choose and negotiate with their family and get an Partner from our Marriage Media Portal.</p>
            <p class="mb-0"><a href="#" class="btn btn-primary">Find More Waiting Partner <span class="icon-arrow"></span></a></p>
          </div>
        </div>
        <div class="row element-animate">
          <div class="major-caousel js-carousel-1 owl-carousel">
            <div>
              <div class="media d-block media-custom text-left">
                <a href="adoption-single.html"><img src="MRegister/img/1 man.jpg" alt="" class="img-fluid"/></a>
                <div class="media-body">
                  <h3 class="mt-0 text-black"><a href="#" class="text-black">Erfanul Haque, <span class="age">29 yrs. old</span></a></h3>
                </div>
              </div>
            </div>
            <div>
              <div class="media d-block media-custom text-left">
                <a href="adoption-single.html"><img src="MRegister/img/2 man.jpg" alt="" class="img-fluid"/></a>
                <div class="media-body">
                  <h3 class="mt-0 text-black"><a href="#" class="text-black">Mujahidul Islam, <span class="age">30 yrs. old</span></a></h3>
                </div>
              </div>
            </div>
            <div>
              <div class="media d-block media-custom text-left">
                <a href="adoption-single.html"><img src="MRegister/img/3 man.jpg" alt="" class="img-fluid"/></a>
                <div class="media-body">
                  <h3 class="mt-0 text-black"><a href="#" class="text-black">Abdur Rahman, <span class="age">29 yrs. old</span></a></h3>
                </div>
              </div>
            </div>
            <div>
              <div class="media d-block media-custom text-left">
                <a href="adoption-single.html"><img src="MRegister/img/1 woman.jpg" alt="" class="img-fluid"/></a>
                <div class="media-body">
                  <h3 class="mt-0 text-black"><a href="#" class="text-black">Jaynab Raina, <span class="age">24 yrs. old</span></a></h3>
                </div>
              </div>
            </div>
            <div>
              <div class="media d-block media-custom text-left">
                  
                <a href="adoption-single.html"><img src="MRegister/img/2 woman.jpg" alt="" class="img-fluid"/></a>
                <div class="media-body">
                  <h3 class="mt-0 text-black"><a href="#" class="text-black">Sadia Afreen, <span class="age">25 yrs. old</span></a></h3>
                </div>
              </div>
            </div>
            <div>
              <div class="media d-block media-custom text-left">
                <a href="adoption-single.html"><img src="MRegister/img/3 woman.jpg" alt="" class="img-fluid"/></a>
                <div class="media-body">
                  <h3 class="mt-0 text-black"><a href="#" class="text-black">Samiya Rahman, <span class="age">28 yrs. old</span></a></h3>
                </div>
              </div>
            </div>
          </div>
          <!-- END slider -->
        </div>
      </div>
    </section>
    <!-- END section -->

    <section class="section border-t">
      <div class="container">
        <div class="row justify-content-center mb-5 element-animate">
          <div class="col-md-8 text-center">
            <h2 class="text-uppercase heading mb-4">Featured Stories</h2>
          </div>
        </div>

        <div class="row no-gutters">
          <div class="col-md-4 element-animate">
            <a href="works-single.html" class="link-thumbnail">
              <h3><span class="date">January 31, 2018</span> "Being loved has taught me how to love"</h3>
              <span class="ion-plus icon"></span>
              <img src="MRegister/img/couple 1.jpg" alt="Image placeholder" class="img-fluid"/>
            </a>
          </div>
          <div class="col-md-4 element-animate">
            <a href="works-single.html" class="link-thumbnail">
              <h3><span class="date">March 28, 2017</span>  Becoming a perfect partner out of imperfect </h3>
              <span class="ion-plus icon"></span>
              <img src="MRegister/img/couple 2.jpg" alt="Image placeholder" class="img-fluid"/>
            </a>
          </div>
          <div class="col-md-4 element-animate">
            <a href="works-single.html" class="link-thumbnail">
              <h3><span class="date">December 27, 2016</span> Home sweet happy couple</h3>
              <span class="ion-plus icon"></span>
              <img src="MRegister/img/couple 3.jpg" alt="Image placeholder" class="img-fluid"/>
            </a>
          </div>
        </div>
      </div>
    </section>
    <!-- END section -->

    <section class="section-subscribe bg-light">
      <div class="container">
        <div class="row justify-content-center align-items-center">
          <div class="col-md-12 my-3">
            <h2 class="text-uppercase heading">Get News &amp; Updates</h2>
          </div>
          <div class="col-md-12">
            <form method="post" action="">
              <div class="row">
                <div class="col-md-4 mb-3">
                  <input type="text" class="form-control btn-block" placeholder="Your Name">    
                </div>
                <div class="col-md-4 mb-3">
                  <input type="email" class="form-control btn-block" placeholder="Your Email">
                </div>
                <div class="col-md-4 mb-3">
                  <input type="submit" class="btn btn-primary btn-block" value="Subscribe">
                </div>
              </div>
              
               
            </form>
          </div>
        </div>
      </div>
    </section>
  

    <footer class="site-footer" role="contentinfo">
      <div class="container">
        <div class="row mb-5">
          <div class="col-md-3 mb-5">
            <h3>About</h3>
            <p> Muslim Marriage Register Or Kazi Office is very important of Every Muslim. Due to the Correct information checking Child Marriage & Multiple Marriage ignoring present partner's concent. It is an attempt to automate this process. </p>
            <p><a href="#">Learn More</a></p>
          </div>
          <div class="col-md-3 mb-5">
            <h3>Contact &amp; Address</h3>
            <ul class="list-unstyled footer-link">
              <li class="d-flex"><span class="mr-3">A:</span><span class="text-white">1/1 Sukhbaspur, Rampal, Munshiganj, Bangladesh</span></li>
              <li class="d-flex"><span class="mr-3">T:</span><span class="text-white">+88 0192 5787 233</span></li>
              <li class="d-flex"><span class="mr-3">E:</span><span class="text-white">info@kazioffice.com</span></li>
            </ul>
          </div>
          <div class="col-md-3 mb-5">
            <h3>Quick Links</h3>
            <ul class="list-unstyled footer-link">
              <li><a href="#">About</a></li>
              <li><a href="#">Booking Registration </a></li>
              <li><a href="#">Recent Marriage</a></li>
              <li><a href="#">Privacy Policy</a></li>
              <li><a href="#">Terms of Use</a></li>
              <li><a href="#">Disclaimers</a></li>
              <li><a href="#">Contact</a></li>
            </ul>
          </div>
          <div class="col-md-3">
            <h3>Social</h3>
            <ul class="list-unstyled footer-link d-flex footer-social">
              <li><a href="#" class="p-2"><span class="fa fa-twitter"></span></a></li>
              <li><a href="#" class="p-2"><span class="fa fa-facebook"></span></a></li>
              <li><a href="#" class="p-2"><span class="fa fa-linkedin"></span></a></li>
              <li><a href="#" class="p-2"><span class="fa fa-instagram"></span></a></li>
            </ul>
          </div>
        </div>
        <div class="row">
          <div class="col-12 text-md-center text-left">
            
            <p>Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This system is design & coded by <i class="fa fa-heart-o" aria-hidden="true"></i> by ASTIK </p>
            
          </div>
        </div>
      </div>
    </footer>
    <!-- END footer -->

    <!-- loader -->
    <div id="loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#f4b214"/></svg></div>
    <script src="MRegister/js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="MRegister/js/popper.min.js" type="text/javascript"></script>
    <script src="MRegister/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="MRegister/js/owl.carousel.min.js" type="text/javascript"></script>
    <script src="MRegister/js/jquery.waypoints.min.js" type="text/javascript"></script>
    <script src="MRegister/js/main.js" type="text/javascript"></script>
    
  </body>
</html>