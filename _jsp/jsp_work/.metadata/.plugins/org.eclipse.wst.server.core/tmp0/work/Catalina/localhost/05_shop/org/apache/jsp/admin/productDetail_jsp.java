/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-03-08 00:46:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import shopdb.*;

public final class productDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/top.jsp", Long.valueOf(1646633305030L));
    _jspx_dependants.put("/admin/bottom.jsp", Long.valueOf(1646633312330L));
  }

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
      out.write("  <title>productDetail.jsp</title>\r\n");
      out.write("  <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"20\">\r\n");
      out.write("  ");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String adminId=(String)session.getAttribute("adminId");
String log="";
String mem="";
if(adminId==null){
	log="<a href='adminLoginForm.jsp'>로그인</a>";
	mem="<a href='inputForm.jsp'>회원가입</a>";
}else{//로그인 상태이면
	log="<a href='adminLogOut.jsp'>로그아웃</a>";
	mem="<a href='updateMember.jsp'>내정보수정</a>";
}

      out.write("\r\n");
      out.write("<table width=\"90%\" align=\"center\" bgcolor=\"#ffff99\">\r\n");
      out.write("  <tr bgcolor=\"#ffcc00\">\r\n");
      out.write("    <td align=\"center\"><b>");
      out.print(log );
      out.write("</b></td>\r\n");
      out.write("    <td align=\"center\"><b>");
      out.print(mem );
      out.write("</b></td>\r\n");
      out.write("    <td align=\"center\"><b><a href=\"productList.jsp\">상품목록</a></b></td>\r\n");
      out.write("    <td align=\"center\"><b><a href=\"cartList.jsp\">장바구니</a></b></td>\r\n");
      out.write("    <td align=\"center\"><b><a href=\"orderList.jsp\">구매목록</a></b></td>\r\n");
      out.write("     \r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  ");

  ProductDAO productDAO=ProductDAO.getDao(); //dao객체얻기
  String code=request.getParameter("code");
  int pro_no=Integer.parseInt(request.getParameter("pro_no"));
  ProductDTO productDTO=productDAO.getProduct(pro_no); //dao메서드 호출
  
      out.write("\r\n");
      out.write("  <table width=\"80%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"center\" bgcolor=\"#ffffcc\">\r\n");
      out.write("        <table width=\"80%\" align=\"center\" bgcolor=\"#ffff99\">\r\n");
      out.write("          \r\n");
      out.write("          <tr bgcolor=\"#996600\">\r\n");
      out.write("            <td colspan=\"3\" align=\"center\">\r\n");
      out.write("              ");
      out.print(productDTO.getName());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"20%\">\r\n");
      out.write("              <img src=\"../imgs/");
      out.print(productDTO.getImage());
      out.write("\" height=\"150\" width=\"150\">\r\n");
      out.write("            </td>\r\n");
      out.write("            \r\n");
      out.write("             <td width=\"30%\" valign=\"top\">\r\n");
      out.write("               <table border=\"1\" width=\"100%\" height=\"100%\">\r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <td><b>상품이름:</b>");
      out.print(productDTO.getName());
      out.write("</td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 \r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <td><b>가격:</b>");
      out.print(productDTO.getPrice());
      out.write("</td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 \r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <td><b>입고날짜:</b>");
      out.print(productDTO.getRegdate());
      out.write("</td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("                 \r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <td><b>남은물량:</b>\r\n");
      out.write("                   ");

                   if(productDTO.getStock()>0){
                	   out.println(productDTO.getStock());
                   }else{
                	   out.println("품절");
                   }
                   
      out.write("\r\n");
      out.write("                   </td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("               </table>\r\n");
      out.write("             </td>\r\n");
      out.write("             <td width=\"50%\" valign=\"top\"><b>상세설명</b>\r\n");
      out.write("             <br>\r\n");
      out.write("             ");
      out.print(productDTO.getDetail());
      out.write("\r\n");
      out.write("             </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"3\" align=\"center\">\r\n");
      out.write("              <a href=\"javaScript:productUpdate('");
      out.print(productDTO.getPro_no());
      out.write("')\">수정하기</a>&nbsp;&nbsp;\r\n");
      out.write("              <a href=\"javaScript:productDelete('");
      out.print(productDTO.getPro_no());
      out.write("')\">삭제하기</a>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<table width=\"90%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("  <tr bgcolor=\"#ffcc00\">\r\n");
      out.write("    <td align=\"center\" width=\"90%\">\r\n");
      out.write("      <b>Simple Shopping Mall에 오신것을 환영 합니다</b>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"center\">\r\n");
      out.write("      <a href=\"../admin/Index.jsp\">관리자</a>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("  <form name=\"updateForm\" method=\"post\" action=\"updateForm.jsp\">\r\n");
      out.write("    <input type=\"hidden\" name=\"pro_no\">\r\n");
      out.write("  </form>\r\n");
      out.write("  <form name=\"delForm\" method=\"post\" action=\"productInsertPro.jsp?flag=delete\">\r\n");
      out.write("    <input type=\"hidden\" name=\"pro_no\">\r\n");
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