/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-10 03:54:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inputForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>inputForm.jsp</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  h2{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    table{\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    border: 1px solid black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  function check(){\r\n");
      out.write("\t  if($('#id').val()==''){\r\n");
      out.write("\t\t  alert(\"ID를 입력하세요\");\r\n");
      out.write("\t\t  $('#id').focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if($('#pw').val()==''){\r\n");
      out.write("\t\t  alert(\"암호를 입력하세요\");\r\n");
      out.write("\t\t  $('#pw').focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if($('#name').val()==''){\r\n");
      out.write("\t\t  alert(\"이름을 입력하세요\");\r\n");
      out.write("\t\t  $('#name').focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  document.myForm.submit(); //서버로 전송\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>회원가입</h2>\r\n");
      out.write("<form name=\"myForm\" method=\"post\" action=\"inputPro.jsp\">\r\n");
      out.write("  <table border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>ID</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"id\" id=\"id\" size=\"20\" placeholder=\"ID입력\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>암호</td>\r\n");
      out.write("      <td><input type=\"password\" name=\"pw\" id=\"pw\" size=\"20\" placeholder=\"암호입력\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>이름</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"name\" id=\"name\" size=\"20\" placeholder=\"이름입력\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\" align=\"center\">\r\n");
      out.write("        <input type=\"button\" value=\"회원가입\" onclick=\"javaScript:check()\">\r\n");
      out.write("        <input type=\"reset\" value=\"취소\">\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
