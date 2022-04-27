/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-03-04 03:38:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shopdb.*;
import java.util.*;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


List list; //전역변수는 자동초기화

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/shop/bottom.jsp", Long.valueOf(1646358840563L));
    _jspx_dependants.put("/shop/top.jsp", Long.valueOf(1646358289390L));
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
      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("UTF-8");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>productList.jsp</title>\r\n");
      out.write("  <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#996600\" topmargin=\"20\">\r\n");
      out.write("  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

String memId=(String)session.getAttribute("memId");
String log="";
String mem="";
if(memId==null){
	log="<a href='loginForm.jsp'>로그인</a>";
	mem="<a href='inputForm.jsp'>회원가입</a>";
}else{ //로그인 상태이면
	log="<a href='logOut.jsp'>로그아웃</a>";
	mem="<a href='updateMember.jsp'>내정보수정</a>";
}

      out.write("\r\n");
      out.write("<table width=\"80%\" align=\"center\" bgcolor=\"#ffff99\">\r\n");
      out.write("  <tr bgcolor=\"#ffcc00\">\r\n");
      out.write("    <td align=\"center\"><b>");
      out.print(log);
      out.write("</b></td>\r\n");
      out.write("    <td align=\"center\"><b>");
      out.print(mem);
      out.write("</b></td>\r\n");
      out.write("    <td align=\"center\"><b><a href=\"productList.jsp\">상품목록</a></b></td>\r\n");
      out.write("    <td align=\"center\"><b><a href=\"cartList.jsp\">장바구니</a></b></td>\r\n");
      out.write("    <td align=\"center\"><b><a href=\"orderList.jsp\">구매목록</a></b></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("  ");

  ProductDAO dao=ProductDAO.getDao(); //dao객체 얻기
  list=dao.getGoodList(); //dao메서드 호출하여 모든 상품정보를 가져온다
  if(list.isEmpty()){ //상품이 없으면
	  out.println("등록된 상품이 없습니다");
  }else{ //상품이 있으면
	 
      out.write("\r\n");
      out.write("\t <table border=\"1\" width=\"80%\" cellpadding=\"3\" align=\"center\">\r\n");
      out.write("\t   <tr>\r\n");
      out.write("\t     ");

	     for(int i=0;i<list.size();i++){
	    	 if(i%3==0){
	    		 out.println("</tr><tr>");
	    	 }
	    	 ProductDTO dto=(ProductDTO)list.get(i);
	    	 
      out.write("\r\n");
      out.write("\t    \t <td>\r\n");
      out.write("\t    \t   <table border=\"1\">\r\n");
      out.write("\t    \t     <tr align=\"center\" bgcolor=\"#d0d0d0\" height=\"120%\">\r\n");
      out.write("\t    \t       <td colspan=\"2\">\r\n");
      out.write("\t    \t         ");
      out.print(dto.getName() );
      out.write("\r\n");
      out.write("\t    \t       </td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t     <tr>\r\n");
      out.write("\t    \t       <td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t    \t        ");

	    	        if(dto.getStock()>0){ //상품수량이 있으면
	    	        	
      out.write("\r\n");
      out.write("\t    \t        \t<a href=\"javaScript:productDetail('");
      out.print(dto.getCode());
      out.write("')\">\r\n");
      out.write("\t    \t        \t  <img src=\"");
      out.print(request.getContextPath());
      out.write("/imgs/");
      out.print(dto.getImage());
      out.write("\" width=\"150\" height=\"150\">\r\n");
      out.write("\t    \t        \t</a>\r\n");
      out.write("\t    \t        \t");

	    	        }else{ //상품수량 없으면
	    	        	
      out.write("\r\n");
      out.write("\t    \t        \t<script>\r\n");
      out.write("\t    \t        \t  alert(\"");
      out.print(dto.getName());
      out.write("품절\");\r\n");
      out.write("\t    \t        \t</script>\r\n");
      out.write("\t    \t        \t");

	    	        }//else-end
	    	        
      out.write("\r\n");
      out.write("\t    \t       </td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t     <tr>\r\n");
      out.write("\t    \t       <td>상품코드</td>\r\n");
      out.write("\t    \t       <td>");
      out.print(dto.getCode());
      out.write("</td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t     <tr>\r\n");
      out.write("\t    \t       <td>가격</td>\r\n");
      out.write("\t    \t       <td>");
      out.print(dto.getPrice());
      out.write("</td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t     <tr>\r\n");
      out.write("\t    \t       <td>출시날짜</td>\r\n");
      out.write("\t    \t       <td>");
      out.print(dto.getRegdate());
      out.write("</td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t     <tr>\r\n");
      out.write("\t    \t       <td>제조회사</td>\r\n");
      out.write("\t    \t       <td>");
      out.print(dto.getComp());
      out.write("</td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t     <tr>\r\n");
      out.write("\t    \t       <td>stock,물량</td>\r\n");
      out.write("\t    \t       <td>\r\n");
      out.write("\t    \t         ");

	    	         if(dto.getStock()>0){ //물량이 있으면 
	    	        	 out.println(dto.getStock());
	    	         }else{ //물량이 없으면
	    	        	 out.println("품절");
	    	         }//else-end
	    	         
      out.write("\r\n");
      out.write("\t    \t       </td>\r\n");
      out.write("\t    \t     </tr>\r\n");
      out.write("\t    \t   </table>\r\n");
      out.write("\t    \t </td>\r\n");
      out.write("\t    \t ");

	     }//for-end
	     
      out.write("\r\n");
      out.write("\t   </tr>\r\n");
      out.write("\t </table>\r\n");
      out.write("\t ");
 
  }//else-end
  
      out.write("\r\n");
      out.write("  <form name=\"detail\" method=\"post\" action=\"productDetail.jsp\">\r\n");
      out.write("    <input type=\"hidden\" name=\"code\">\r\n");
      out.write("  </form>\r\n");
      out.write("  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<table width=\"80%\" align=\"center\" bgcolor=\"#FFF99\">\r\n");
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
