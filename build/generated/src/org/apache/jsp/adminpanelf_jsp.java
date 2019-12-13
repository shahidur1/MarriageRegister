package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanelf_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Muslim Marriage Register & Kazi </title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800|Sacramento\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"MRegister/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"MRegister/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"MRegister/css/owl.carousel.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"MRegister/fonts/ionicons/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"MRegister/fonts/fontawesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"MRegister/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <header role=\"banner\">\n");
      out.write("      <div class=\"top-bar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-instagram\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"fa fa-linkedin\"></span></a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <a class=\"navbar-brand\" href=\"indexx.html\"><img src=\"MRegister/img/Logo.png\" alt=\"\"/></a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample05\" aria-controls=\"navbarsExample05\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarsExample05\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto pl-lg-5 pl-0\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                  \n");
      out.write("                <a class=\"nav-link active\" href=\"home.jsp\">Home</a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"news.html\">Yearly Record</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"about.html\">Monthly Record</a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"contact.html\">System Support</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adlogin.jsp\">Log Out</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <!-- END header -->\n");
      out.write("    <! -- Operation Section -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("             <form action=\"kShow.htm\">\n");
      out.write("            <input type=\"submit\" class=\"btn btn-toolbar\" value=\"Awaiting Kazi List\"></input>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("              <form action=\"kaShow.htm\">\n");
      out.write("            <input type=\"submit\" class=\"btn btn-toolbar\" value=\"Approved Kazi List\"></input>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("              <form action=\"kShow.htm\">\n");
      out.write("            <input type=\"submit\" class=\"btn btn-toolbar\" value=\"Complains\"></input>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("        <hr/>\n");
      out.write("        <h2 class=\"heading h2\"><u>Applied Kazi List Who are not approved Yet</u></h2>\n");
      out.write("        <table class=\"table-striped table-hover\" border=\"2\" cellspacing=\"0\" cellpadding=\"5\">\n");
      out.write("            <tr class=\"table-head table-row\">\n");
      out.write("                <td>Kazi ID</td>\n");
      out.write("                <td>District</td>\n");
      out.write("                <td>District ID</td>\n");
      out.write("                <td>PS</td>\n");
      out.write("                <td>Union</td>\n");
      out.write("                <td>Office</td>\n");
      out.write("                <td>License No</td>\n");
      out.write("                <td>Kazi Name</td>\n");
      out.write("                <td>Father Name</td>\n");
      out.write("                <td>Mother Name</td>\n");
      out.write("                <td>NID</td>\n");
      out.write("                <td>Contact</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>Qualification</td>\n");
      out.write("                <td>Approval</td>\n");
      out.write("                <td>Action</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("            </table>\n");
      out.write("        <hr/>\n");
      out.write("    </center>\n");
      out.write("  <center>\n");
      out.write("        <hr/>\n");
      out.write("        <h2 class=\"heading h2\"><u>Approved Kazi List</u></h2>\n");
      out.write("    \n");
      out.write("        <table border=\"2\" cellspacing=\"0\" cellpadding=\"5\" class=\"table-info table-hover\">\n");
      out.write("                <tr>\n");
      out.write("                <td>Kazi ID</td>\n");
      out.write("                <td>District</td>\n");
      out.write("                <td>District ID</td>\n");
      out.write("                <td>PS</td>\n");
      out.write("                <td>Union</td>\n");
      out.write("                <td>License No</td>\n");
      out.write("                <td>Kazi Name</td>\n");
      out.write("                <td>NID</td>\n");
      out.write("                <td>Contact</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>Approval</td>\n");
      out.write("                <td>Status</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("            </table>\n");
      out.write("        <hr/>\n");
      out.write("    </center>\n");
      out.write("  \n");
      out.write("    <!-- END slider -->\n");
      out.write("    \n");
      out.write("    <section class=\"section bg-light\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center mb-5 element-animate\">\n");
      out.write("          <div class=\"col-md-8 text-center\">\n");
      out.write("              <h2 class=\"text-uppercase heading mb-4\">Waiting Muslim &AMP; Muslimah</h2>\n");
      out.write("            <p class=\"mb-5 lead\"> We have a good number of muslimah bio data you can choose and negotiate with their family and get an Partner from our Marriage Media Portal.</p>\n");
      out.write("            <p class=\"mb-0\"><a href=\"#\" class=\"btn btn-primary\">Find More Waiting Partner <span class=\"icon-arrow\"></span></a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row element-animate\">\n");
      out.write("          <div class=\"major-caousel js-carousel-1 owl-carousel\">\n");
      out.write("            <div>\n");
      out.write("              <div class=\"media d-block media-custom text-left\">\n");
      out.write("                <a href=\"adoption-single.html\"><img src=\"MRegister/img/1 man.jpg\" alt=\"\" class=\"img-fluid\"/></a>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"mt-0 text-black\"><a href=\"#\" class=\"text-black\">Erfanul Haque, <span class=\"age\">29 yrs. old</span></a></h3>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"media d-block media-custom text-left\">\n");
      out.write("                <a href=\"adoption-single.html\"><img src=\"MRegister/img/2 man.jpg\" alt=\"\" class=\"img-fluid\"/></a>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"mt-0 text-black\"><a href=\"#\" class=\"text-black\">Mujahidul Islam, <span class=\"age\">30 yrs. old</span></a></h3>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"media d-block media-custom text-left\">\n");
      out.write("                <a href=\"adoption-single.html\"><img src=\"MRegister/img/3 man.jpg\" alt=\"\" class=\"img-fluid\"/></a>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"mt-0 text-black\"><a href=\"#\" class=\"text-black\">Abdur Rahman, <span class=\"age\">29 yrs. old</span></a></h3>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"media d-block media-custom text-left\">\n");
      out.write("                <a href=\"adoption-single.html\"><img src=\"MRegister/img/1 woman.jpg\" alt=\"\" class=\"img-fluid\"/></a>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"mt-0 text-black\"><a href=\"#\" class=\"text-black\">Jaynab Raina, <span class=\"age\">24 yrs. old</span></a></h3>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"media d-block media-custom text-left\">\n");
      out.write("                  \n");
      out.write("                <a href=\"adoption-single.html\"><img src=\"MRegister/img/2 woman.jpg\" alt=\"\" class=\"img-fluid\"/></a>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"mt-0 text-black\"><a href=\"#\" class=\"text-black\">Sadia Afreen, <span class=\"age\">25 yrs. old</span></a></h3>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"media d-block media-custom text-left\">\n");
      out.write("                <a href=\"adoption-single.html\"><img src=\"MRegister/img/3 woman.jpg\" alt=\"\" class=\"img-fluid\"/></a>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"mt-0 text-black\"><a href=\"#\" class=\"text-black\">Samiya Rahman, <span class=\"age\">28 yrs. old</span></a></h3>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- END slider -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- END section -->\n");
      out.write("\n");
      out.write("    <section class=\"section border-t\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center mb-5 element-animate\">\n");
      out.write("          <div class=\"col-md-8 text-center\">\n");
      out.write("            <h2 class=\"text-uppercase heading mb-4\">Featured Stories</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row no-gutters\">\n");
      out.write("          <div class=\"col-md-4 element-animate\">\n");
      out.write("            <a href=\"works-single.html\" class=\"link-thumbnail\">\n");
      out.write("              <h3><span class=\"date\">January 31, 2018</span> \"Being loved has taught me how to love\"</h3>\n");
      out.write("              <span class=\"ion-plus icon\"></span>\n");
      out.write("              <img src=\"MRegister/img/couple 1.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"/>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 element-animate\">\n");
      out.write("            <a href=\"works-single.html\" class=\"link-thumbnail\">\n");
      out.write("              <h3><span class=\"date\">March 28, 2017</span>  Becoming a perfect partner out of imperfect </h3>\n");
      out.write("              <span class=\"ion-plus icon\"></span>\n");
      out.write("              <img src=\"MRegister/img/couple 2.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"/>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 element-animate\">\n");
      out.write("            <a href=\"works-single.html\" class=\"link-thumbnail\">\n");
      out.write("              <h3><span class=\"date\">December 27, 2016</span> Home sweet happy couple</h3>\n");
      out.write("              <span class=\"ion-plus icon\"></span>\n");
      out.write("              <img src=\"MRegister/img/couple 3.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"/>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- END section -->\n");
      out.write("\n");
      out.write("    <section class=\"section-subscribe bg-light\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center align-items-center\">\n");
      out.write("          <div class=\"col-md-12 my-3\">\n");
      out.write("            <h2 class=\"text-uppercase heading\">Get News &amp; Updates</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <form method=\"post\" action=\"\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mb-3\">\n");
      out.write("                  <input type=\"text\" class=\"form-control btn-block\" placeholder=\"Your Name\">    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-3\">\n");
      out.write("                  <input type=\"email\" class=\"form-control btn-block\" placeholder=\"Your Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-3\">\n");
      out.write("                  <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Subscribe\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <footer class=\"site-footer\" role=\"contentinfo\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md-3 mb-5\">\n");
      out.write("            <h3>About</h3>\n");
      out.write("            <p> Muslim Marriage Register Or Kazi Office is very important of Every Muslim. Due to the Correct information checking Child Marriage & Multiple Marriage ignoring present partner's concent. It is an attempt to automate this process. </p>\n");
      out.write("            <p><a href=\"#\">Learn More</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 mb-5\">\n");
      out.write("            <h3>Contact &amp; Address</h3>\n");
      out.write("            <ul class=\"list-unstyled footer-link\">\n");
      out.write("              <li class=\"d-flex\"><span class=\"mr-3\">A:</span><span class=\"text-white\">1/1 Sukhbaspur, Rampal, Munshiganj, Bangladesh</span></li>\n");
      out.write("              <li class=\"d-flex\"><span class=\"mr-3\">T:</span><span class=\"text-white\">+88 0192 5787 233</span></li>\n");
      out.write("              <li class=\"d-flex\"><span class=\"mr-3\">E:</span><span class=\"text-white\">info@kazioffice.com</span></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 mb-5\">\n");
      out.write("            <h3>Quick Links</h3>\n");
      out.write("            <ul class=\"list-unstyled footer-link\">\n");
      out.write("              <li><a href=\"#\">About</a></li>\n");
      out.write("              <li><a href=\"#\">Booking Registration </a></li>\n");
      out.write("              <li><a href=\"#\">Recent Marriage</a></li>\n");
      out.write("              <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("              <li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("              <li><a href=\"#\">Disclaimers</a></li>\n");
      out.write("              <li><a href=\"#\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3\">\n");
      out.write("            <h3>Social</h3>\n");
      out.write("            <ul class=\"list-unstyled footer-link d-flex footer-social\">\n");
      out.write("              <li><a href=\"#\" class=\"p-2\"><span class=\"fa fa-twitter\"></span></a></li>\n");
      out.write("              <li><a href=\"#\" class=\"p-2\"><span class=\"fa fa-facebook\"></span></a></li>\n");
      out.write("              <li><a href=\"#\" class=\"p-2\"><span class=\"fa fa-linkedin\"></span></a></li>\n");
      out.write("              <li><a href=\"#\" class=\"p-2\"><span class=\"fa fa-instagram\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-12 text-md-center text-left\">\n");
      out.write("            \n");
      out.write("            <p>Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This system is design & coded by <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by ASTIK </p>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- END footer -->\n");
      out.write("\n");
      out.write("    <!-- loader -->\n");
      out.write("    <div id=\"loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#f4b214\"/></svg></div>\n");
      out.write("    <script src=\"MRegister/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"MRegister/js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"MRegister/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"MRegister/js/owl.carousel.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"MRegister/js/jquery.waypoints.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"MRegister/js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("k");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                \n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kaziid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.districtid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.ps}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.unionn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.fulladdress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.nklicence}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.mname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.nid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.qualification}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.approval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><a href=\"rdApproval.htm?kaziid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kaziid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&district=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                           &districtid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.districtid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&ps=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.ps}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&unionn=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.unionn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                           &nklicence=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.nklicence}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&kname=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                           &nid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.nid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&contact=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Decision</a></td>\n");
          out.write("                </tr>\n");
          out.write("                \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("a");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kalist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                \n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.kaziid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.districtid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.ps}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.unionn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.nklicence}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.kname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                 \n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.nid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.approval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                </tr>\n");
          out.write("                \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
