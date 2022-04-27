/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-18 07:06:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boardmysql;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardmysql.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>content.jsp</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");

//list.jsp가 보내준 데이터 받기
int num=Integer.parseInt(request.getParameter("num"));
String pageNum=request.getParameter("pageNum");
BoardDAO dao=BoardDAO.getDao(); //dao객체 얻기
BoardDTO dto=dao.getBoard(num); //dao메서드 호출,dto를 받는다
int ref=dto.getRef(); 
int re_step=dto.getRe_step();
int re_level=dto.getRe_level();

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>글내용 보기</h2>\r\n");
      out.write("  <table border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>글번호</td>\r\n");
      out.write("      <td>");
      out.print(dto.getNum());
      out.write("</td>\r\n");
      out.write("      \r\n");
      out.write("      <td>조회수</td>\r\n");
      out.write("      <td>");
      out.print(dto.getReadcount());
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>작성자</td>\r\n");
      out.write("      <td>");
      out.print(dto.getWriter());
      out.write("</td>\r\n");
      out.write("      \r\n");
      out.write("      <td>작성일</td>\r\n");
      out.write("      <td>");
      out.print(dto.getRegdate());
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>글제목</td>\r\n");
      out.write("      <td colspan=\"3\">\r\n");
      out.write("        ");
      out.print(dto.getSubject());
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"4\">\r\n");
      out.write("        ");

        String content=dto.getContent();
        content=content.replace("\n", "<br>");
        
      out.write("\r\n");
      out.write("        ");
      out.print(content);
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"4\" align=\"right\">\r\n");
      out.write("        <input type=\"button\" value=\"글수정\" onclick=\"location.href='updateForm.jsp?num=");
      out.print(dto.getNum());
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("        <input type=\"button\" value=\"글삭제\" onclick=\"location.href='deleteForm.jsp?num=");
      out.print(dto.getNum());
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("        <input type=\"button\" value=\"답글쓰기\" onclick=\"location.href='writeForm.jsp?num=");
      out.print(dto.getNum());
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("&ref=");
      out.print(ref);
      out.write("&re_step=");
      out.print(re_step);
      out.write("&re_level=");
      out.print(re_level);
      out.write("'\">\r\n");
      out.write("        <input type=\"button\" value=\"리스트\" onclick=\"location.href='list.jsp?pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
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
