/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-03-07 02:40:36 UTC
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

public final class orderPro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');
      shopdb.CartMgr cartMgr = null;
      synchronized (session) {
        cartMgr = (shopdb.CartMgr) _jspx_page_context.getAttribute("cartMgr", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (cartMgr == null){
          cartMgr = new shopdb.CartMgr();
          _jspx_page_context.setAttribute("cartMgr", cartMgr, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      shopdb.OrderDAO orderDAO = null;
      orderDAO = (shopdb.OrderDAO) _jspx_page_context.getAttribute("orderDAO", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (orderDAO == null){
        orderDAO = new shopdb.OrderDAO();
        _jspx_page_context.setAttribute("orderDAO", orderDAO, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

ProductDAO productDAO=ProductDAO.getDao(); //dao객체 얻는다
Hashtable hcart=cartMgr.getCartList(); //장바구니 내용을 모두 받는다
Enumeration hcartKeys=hcart.keys(); //모든 키를 받는다

if(hcart.size()!=0){ //장바구니에 내용이 있으면
	while(hcartKeys.hasMoreElements()){ //내용이 있는 동안 반복수행
		OrderDTO orderDTO=(OrderDTO)hcart.get(hcartKeys.nextElement());
		orderDAO.insertOrder(orderDTO); //insert
		productDAO.reduceProduct(orderDTO); //남은 물량 계산,orderDTO에 있는 quantity계산
		cartMgr.deleteCart(orderDTO); //장바구니 비우기
	}//while-end
	
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t  alert(\"주문 처리를 하였습니다\");\r\n");
      out.write("\t  location.href=\"orderList.jsp\"; //주문목록\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

}else{ //장바구니 내용이 없으면
	
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t  alert(\"장바구니가 비어있습니다\");\r\n");
      out.write("\t  location.href=\"productList.jsp\"; //상품목록\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

}//else-end

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
