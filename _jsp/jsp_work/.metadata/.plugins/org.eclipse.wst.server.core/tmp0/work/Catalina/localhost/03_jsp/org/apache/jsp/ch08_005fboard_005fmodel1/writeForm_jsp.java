/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-09 02:58:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch08_005fboard_005fmodel1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>writeForm.jsp</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  h2{\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  }\r\n");
      out.write("  table{\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  border: 1px solid black;\r\n");
      out.write("  width: 507;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  function check(){\r\n");
      out.write("\t  if(document.myForm.writer.value==''){\r\n");
      out.write("\t\t  alert(\"이름을 입력하세요\");\r\n");
      out.write("\t\t  document.myForm.writer.focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if(document.myForm.subject.value==''){\r\n");
      out.write("\t\t  alert(\"글제목을 입력 하세요\");\r\n");
      out.write("\t\t  document.myForm.subject.focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if(document.myForm.content.value==''){\r\n");
      out.write("\t\t  alert(\"글내용을 입력 하세요\");\r\n");
      out.write("\t\t  document.myForm.content.focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if(document.myForm.pw.value==''){\r\n");
      out.write("\t\t  alert(\"암호를 입력 하세요\");\r\n");
      out.write("\t\t  document.myForm.pw.focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  document.myForm.submit(); //서버로 전송\r\n");
      out.write("  }//check()-end\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>게시판 글쓰기</h2>\r\n");
      out.write("  <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\">\r\n");
      out.write("        <a href=\"list.jsp?page=1\">리스트</a>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <form name=\"myForm\" method=\"post\" action=\"writePro.jsp\">\r\n");
      out.write("    <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>이름</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"writer\" id=\"writer\" size=\"30\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>글제목</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"subject\" id=\"subject\" size=\"30\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>글내용</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <textarea name=\"content\" id=\"content\" rows=\"10\" cols=\"50\"></textarea>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>암호</td>\r\n");
      out.write("        <td><input type=\"password\" name=\"pw\" id=\"pw\" size=\"30\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("          <!--<input type=\"submit\" value=\"글쓰기\">-->\r\n");
      out.write("          <!-- <input type=\"reset\" value=\"취소\"> -->\r\n");
      out.write("          <input type=\"button\" value=\"글쓰기\" onclick=\"javaScript:check()\">\r\n");
      out.write("          <input type=\"button\" value=\"취소\" onclick=\"history.back()\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </form>\r\n");
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
