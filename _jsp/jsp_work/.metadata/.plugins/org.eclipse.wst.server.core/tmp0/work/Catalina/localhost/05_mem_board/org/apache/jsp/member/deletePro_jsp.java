/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-17 08:33:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.*;

public final class deletePro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String id=(String)session.getAttribute("id"); //로그인을 하면 session으로 부터 id얻어옴
String pw=request.getParameter("pw");
MemberDAO dao=MemberDAO.getDao(); //dao객체 얻기
int x=dao.deleteMember(id, pw); //dao메서드 호출
if(x==1){
	session.invalidate(); //세션무효화 
	
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t  <form method=\"post\" action=\"main.jsp\">\r\n");
      out.write("\t    <h3>회원 탈퇴 완료</h3>\r\n");
      out.write("\t    <input type=\"submit\" value=\"홈으로\">\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t    5초후에 홈으로 이동합니다\r\n");
      out.write("\t    <meta http-equiv=\"Refresh\" content=\"5;url='main.jsp'\">\r\n");
      out.write("\t  </form>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t");

}else if(x==-1){
	
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\talert(\"암호가 틀립니다\");\r\n");
      out.write("\thistory.back();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

}

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
