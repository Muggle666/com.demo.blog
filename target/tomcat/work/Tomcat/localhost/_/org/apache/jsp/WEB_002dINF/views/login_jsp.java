/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-08 02:10:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');

    String contextPath = request.getContextPath();

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>请登录</title>\n");
      out.write("    <script src=\"");
      out.print(contextPath);
      out.write("/static/js/jquery-3.1.1.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(contextPath);
      out.write("/static/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("    <link href=\"");
      out.print(contextPath);
      out.write("/static/bootstrap/css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"");
      out.print(contextPath);
      out.write("/static/bootstrap/css/bootstrap-theme.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link href=\"");
      out.print(contextPath);
      out.write("/static/css/signin.css\" rel=\"stylesheet\"/>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <form id=\"loginForm\" class=\"form-signin\" action=\"/views/dologin\" method=\"post\">\n");
      out.write("        <h2 class=\"form-signin-heading\">登陆界面</h2>\n");
      out.write("        <div>\n");
      out.write("           ");
if(request.getAttribute("error")!=null){
      out.write("\n");
      out.write("            ");
      out.print(request.getAttribute("error"));
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <label for=\"inputEmail\" >请输入用户名</label>\n");
      out.write("        <input type=\"text\" id=\"inputEmail\" name=\"username\" class=\"form-control\" placeholder=\"用户名\" pattern=\"^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$\" required autofocus invalid >\n");
      out.write("        <label for=\"inputPassword\" >密码</label>\n");
      out.write("        <input type=\"password\" id=\"inputPassword\"  name=\"password\" class=\"form-control\" placeholder=\"密码\" pattern=\"^[a-zA-Z0-9]{6,12}$\" required invalid>\n");
      out.write("        <div class=\"checkbox\">\n");
      out.write("            <label>\n");
      out.write("                <input type=\"checkbox\" value=\"remember-me\"> 记住我\n");
      out.write("            </label>\n");
      out.write("            <label><a href=\"");
      out.print(contextPath);
      out.write("/views/register\">免费注册</a></label>\n");
      out.write("            <label><a href=\"http://localhost:8081/\">返回主页</a></label>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">登录</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
