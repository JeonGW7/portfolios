/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-11 03:37:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch10_005fbean_005fdb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypa.*;
import java.util.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
BoardDAO dao=new BoardDAO(); //객체생성
List<BoardDTO> list=dao.getList(); //dao메서드 호출

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>Insert title here</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  h2{text-align:center;}\r\n");
      out.write("  table{margin:auto; width: 60%}\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>게시판 리스트</h2>\r\n");
      out.write("  <table>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"right\">\r\n");
      out.write("      <a href=\"writeForm.jsp\">글쓰기</a>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <table border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th>번호</th>\r\n");
      out.write("      <th>글제목</th>\r\n");
      out.write("      <th>작성자</th>\r\n");
      out.write("      <th>작성일</th>\r\n");
      out.write("      <th>조회수</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

    for(int i=0;i<list.size();i++){
    	BoardDTO dto=(BoardDTO)list.get(i);
    	
      out.write("\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t  <td>");
      out.print(dto.getNum() );
      out.write("</td>\r\n");
      out.write("    \t  ");
      out.write("\r\n");
      out.write("    \t  <td>\r\n");
      out.write("    \t  <a href=\"content.jsp?num=");
      out.print(dto.getNum());
      out.write('"');
      out.write('>');
      out.print(dto.getSubject() );
      out.write("</a>\r\n");
      out.write("  \t\t  </td>\r\n");
      out.write("    \t  <td>");
      out.print(dto.getWriter() );
      out.write("</td>\r\n");
      out.write("    \t  <td>");
      out.print(dto.getWdate() );
      out.write("</td>\r\n");
      out.write("    \t  <td>");
      out.print(dto.getReadcount() );
      out.write("</td>\r\n");
      out.write("    \t  <td>\r\n");
      out.write("    \t    <a href=\"deletePro.jsp?num=");
      out.print(dto.getNum());
      out.write("\">삭제</a>\r\n");
      out.write("    \t  </td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t");
 
    }//for-end
    
      out.write("\r\n");
      out.write("  </table>\r\n");
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