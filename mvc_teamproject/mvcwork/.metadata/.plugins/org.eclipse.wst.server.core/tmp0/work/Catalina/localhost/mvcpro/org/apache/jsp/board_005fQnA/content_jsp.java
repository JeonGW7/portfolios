/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-03-02 04:21:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board_005fQnA;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/board_QnA/header.jsp", Long.valueOf(1646194635101L));
    _jspx_dependants.put("jar:file:/D:/_mvc_project/mvcwork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mvcpro/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1090214156000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1646009444797L));
    _jspx_dependants.put("jar:file:/D:/_mvc_project/mvcwork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mvcpro/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1090214156000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /board_QnA/header.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctxpath");
      // /board_QnA/header.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(request.getContextPath() );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>Insert title here</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"aa.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"wid\">\r\n");
      out.write("  <h2>질문내용</h2>\r\n");
      out.write("  <table style=\"border:solid 1px #FFF\">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td>글번호:&nbsp;</td>\r\n");
      out.write("       <td>\r\n");
      out.write("       <pre>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr></tr>\r\n");
      out.write("     <tr>      \r\n");
      out.write("       <td>작성자: </td>\r\n");
      out.write("       <td>\r\n");
      out.write("       <pre>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre>\r\n");
      out.write("       </td>\r\n");
      out.write("      </tr> \r\n");
      out.write("     <tr>\r\n");
      out.write("       <td>작성일: </td>\r\n");
      out.write("       <td>\r\n");
      out.write("       <pre>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.regdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre>\r\n");
      out.write("     \t</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \r\n");
      out.write("     <tr>\r\n");
      out.write("       <td>글제목: </td>\r\n");
      out.write("       <td colspan=\"3\">\r\n");
      out.write("        <pre>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre>\r\n");
      out.write("       </td>    \r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td>글내용: </td>\r\n");
      out.write("       <td colspan=\"3\">\r\n");
      out.write("          <pre>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <div>\r\n");
      out.write("  <br>\r\n");
      out.write("  </div>\r\n");
      out.write("  <table style=\"border:solid 1px #FFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("       <td colspan=\"4\" align=\"center\">\r\n");
      out.write("         <input type=\"button\" value=\"수정하기\" onClick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board_QnA/updateForm.do?num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&pageNum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("         <input type=\"button\" value=\"삭제하기\" onClick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board_QnA/deleteForm.do?num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&pageNum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("         <input type=\"button\" value=\"답변하기\" onClick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board_QnA/writeForm.do?num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&pageNum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&ref=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ref}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&re_step=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${re_step}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&re_level=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${re_level}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("         \r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
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