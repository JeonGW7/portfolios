/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-04-14 08:15:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.askBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class askContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/_jsp/sts_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springteamproject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/askBoard/../module/jspheader.jsp", Long.valueOf(1649732051228L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647827397263L));
    _jspx_dependants.put("jar:file:/D:/_jsp/sts_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springteamproject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/askBoard/../module/jspheader.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctxpath");
      // /WEB-INF/views/askBoard/../module/jspheader.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(request.getContextPath());
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Jua&display=swap');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".login-header{\r\n");
      out.write("background-color: white;\r\n");
      out.write("text-align: right;\r\n");
      out.write("padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-header a{\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-header a:hover {\r\n");
      out.write("  border-bottom: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("  th{\r\n");
      out.write("  padding: 3px;\r\n");
      out.write("  }\r\n");
      out.write("  td{\r\n");
      out.write("  padding: 3px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  h2{\r\n");
      out.write("  display: block;\r\n");
      out.write("  font-size: 1.3rem;\r\n");
      out.write("  color: #546173;\r\n");
      out.write("  margin-bottom: 0.4em;\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#tr-subject{\r\n");
      out.write("padding: 30px;\r\n");
      out.write("background-color: #DF9F1F;\r\n");
      out.write("color: white;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("font-size: 17px;\r\n");
      out.write("height: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".td-subject{\r\n");
      out.write("padding: 10px;\r\n");
      out.write("background-color: #DF9F1F;\r\n");
      out.write("color: white;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("font-size: 15px;\r\n");
      out.write("border: 1px solid white;\r\n");
      out.write("width: 250px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td-subject2{\r\n");
      out.write("border-bottom: 2px solid #DF9F1F;\r\n");
      out.write("font-size: 14px;\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("padding: 15px;\r\n");
      out.write("height: 40px;\r\n");
      out.write("width: 15%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td-content{\r\n");
      out.write("height: 300px;\r\n");
      out.write("font-size: 17px;\r\n");
      out.write("padding: 30px;\r\n");
      out.write("align-items: flex-start; \r\n");
      out.write("border: 1px;\r\n");
      out.write("width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td-date{\r\n");
      out.write("border-bottom: 2px solid #DF9F1F;\r\n");
      out.write("font-size:12px;\r\n");
      out.write("color:gray;\r\n");
      out.write("text-align:right;\r\n");
      out.write("padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main{\r\n");
      out.write("border: 2px solid #EBE3DB;\r\n");
      out.write("padding: 10px;\r\n");
      out.write("margin: auto;\r\n");
      out.write("margin-top: 40px;\r\n");
      out.write("width: 70%;\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("text-align: center;\r\n");
      out.write("color: #546173;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#support{\r\n");
      out.write("padding: 10px;\r\n");
      out.write("margin: auto;\r\n");
      out.write("width: 70%;\r\n");
      out.write("align-items: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#support a{\r\n");
      out.write("text-align: center;\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t.btn{\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\t font-size: 15px;\r\n");
      out.write("\t padding: 7px 15px;\r\n");
      out.write("\t color: #DF9F1F;\r\n");
      out.write("\t border:2px solid #DF9F1F;\r\n");
      out.write("\t border-radius: 30px;\r\n");
      out.write("\t text-transform: uppercase;\r\n");
      out.write("\t letter-spacing: 3px;\r\n");
      out.write("\t font-family: 'Jua', sans-serif;\r\n");
      out.write("\t transition: all 0.4s;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.btn:focus{\r\n");
      out.write("\t\toutline: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.btn:hover {\r\n");
      out.write("\t\tbackground-color: #DF9F1F;\r\n");
      out.write("\t\tcolor:white;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>askContent.jsp</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t.ask_content td {\r\n");
      out.write("\tpadding: 5px 0;\r\n");
      out.write("\tborder-bottom: 1px solid #e5e5e5;\r\n");
      out.write("\t}\r\n");
      out.write("\th2 {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable {\r\n");
      out.write("\tpadding-top: 20;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#button_style {\r\n");
      out.write("\tborder: 2px solid orange;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tcolor: orange;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tborder-top-left-radius: 5px;\r\n");
      out.write("\tborder-top-right-radius: 5px;\r\n");
      out.write("\tborder-bottom-right-radius: 5px;\r\n");
      out.write("\tborder-bottom-left-radius: 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/askBoard/askContent.jsp(36,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user_id == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<h2>로그인이 필요한 서비스입니다.</h2>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/askBoard/askContent.jsp(40,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user_id != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\r\n");
        out.write("\t<table>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\">\r\n");
        out.write("\t\t\t\t<input type=\"button\" value=\"삭제\" id=\"button_style\" onClick=\"location='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/askBoard/askDelete.do?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("&pageNum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("'\">&nbsp;\r\n");
        out.write("\t\t\t\t<input type=\"button\" value=\"목록으로\" id=\"button_style\" onClick=\"location='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/askBoard/askList.do?pageNum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("'\">\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        out.write("\t\r\n");
        out.write("\t<table class=\"ask_content\">\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td colspan=\"2\"><font color=\"orange\" size=\"4\"><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("</b></font></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t<tr></tr><tr></tr><tr></tr>\r\n");
        out.write("    \r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td><font color=\"gray\" size=\"2\">작성자</font></td>\r\n");
        out.write("\t\t\t<td><font color=\"gray\" size=\"2\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("</font></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td><font color=\"gray\" size=\"2\">작성일</font></td>\r\n");
        out.write("\t\t\t<td><font color=\"gray\" size=\"2\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_regdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("</font></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("    \r\n");
        out.write("    \t<tr></tr><tr></tr><tr></tr>\r\n");
        out.write("    \r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td colspan=\"2\">\r\n");
        out.write("\t\t\t\t<pre>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("</pre>\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /WEB-INF/views/askBoard/askContent.jsp(46,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user_id == 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"button\" value=\"답변하기\" id=\"button_style\" onClick=\"'");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/askBoard/writeAskForm.do?ask_num=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("&ask_ref=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_ref}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("&ask_restep=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_restep}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("&ask_relevel=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${askBoardDto.ask_relevel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("&pageNum=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("'\">\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
