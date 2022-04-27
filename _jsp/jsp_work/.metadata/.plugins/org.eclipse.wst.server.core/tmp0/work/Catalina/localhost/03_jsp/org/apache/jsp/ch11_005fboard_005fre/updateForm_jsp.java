/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-14 04:16:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch11_005fboard_005fre;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardre.*;

public final class updateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("UTF-8");
//content.jsp가 보내준 값 받기
int nowPage=Integer.parseInt(request.getParameter("page"));
int num=Integer.parseInt(request.getParameter("num"));
BoardDAO dao=new BoardDAO(); //객체생성
BoardDTO dto=dao.getBoard(num); //dao메소드 호출,dto를 받는다
String name=dto.getName();
String subject=dto.getSubject();
String content=dto.getContent();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>updateForm.jsp</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  h2{text-align:center;}\r\n");
      out.write("  table{margin:auto; width: 70%;}\r\n");
      out.write("  </style>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("    function check(){\r\n");
      out.write("    \tif(document.updateForm.pw.value==''){\r\n");
      out.write("    \t\talert(\"암호는 필수 입력 해야 합니다\");\r\n");
      out.write("    \t\tdocument.updateForm.pw.focus();\r\n");
      out.write("    \t\treturn false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \tdocument.updateForm.submit();//전송\r\n");
      out.write("    }\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>글수정 폼</h2>\r\n");
      out.write("  <form name=\"updateForm\" method=\"post\" action=\"updatePro.jsp\">\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>이름</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" size=\"20\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>글제목</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"subject\" value=\"");
      out.print(subject);
      out.write("\" size=\"50\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>글내용</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <textarea name=\"content\" rows=\"10\" cols=\"50\">");
      out.print(content );
      out.write("</textarea>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>암호</td>\r\n");
      out.write("        <td><input type=\"password\" name=\"pw\" size=\"20\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("          <input type=\"button\" value=\"글수정\" onclick=\"check()\"> \r\n");
      out.write("          <input type=\"reset\" value=\"다시수정\"> \r\n");
      out.write("          <input type=\"button\" value=\"뒤로\" onclick=\"history.back()\"> \r\n");
      out.write("          <input type=\"hidden\" name=\"num\" value=\"");
      out.print(num );
      out.write("\"> \r\n");
      out.write("          <input type=\"hidden\" name=\"page\" value=\"");
      out.print(nowPage );
      out.write("\"> \r\n");
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