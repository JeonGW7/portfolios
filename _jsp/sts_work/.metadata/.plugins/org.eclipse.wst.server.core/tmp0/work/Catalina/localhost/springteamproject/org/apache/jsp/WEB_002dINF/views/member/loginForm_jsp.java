/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-04-12 03:51:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.text.Document;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/_jsp/sts_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springteamproject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/member/../module/jspheader.jsp", Long.valueOf(1649732051228L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647827397263L));
    _jspx_dependants.put("jar:file:/D:/_jsp/sts_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springteamproject/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/member/../module/jspheader.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctxpath");
      // /WEB-INF/views/member/../module/jspheader.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
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
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>loginForm.jsp</title>\r\n");
      out.write("  <style>\r\n");
      out.write("  * {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("  list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap {\r\n");
      out.write("  font-family: \"Noto Sans KR\", sans-serif;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100vh;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  background: #FFEDCB;\r\n");
      out.write("  margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login {\r\n");
      out.write("  width: 30%;\r\n");
      out.write("  height: 600px;\r\n");
      out.write("  background: white;\r\n");
      out.write("  border-radius: 20px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  flex-direction: column;\r\n");
      out.write("  box-shadow: 5px 5px 5px rgba(0, 0, 0, 0.4), -5px -5px 5px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_sns {\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_sns li {\r\n");
      out.write("  padding: 0px 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_sns a {\r\n");
      out.write("  width: 50px;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  border-radius: 50px;\r\n");
      out.write("  background: white;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  box-shadow: 3px 3px 3px rgba(0, 0, 0, 0.4), -3px -3px 5px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_id {\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("  width: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_id input {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  border-radius: 30px;\r\n");
      out.write("  margin-top: 10px;\r\n");
      out.write("  padding: 0px 20px;\r\n");
      out.write("  border: 1px solid lightgray;\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_pw {\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("  width: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_pw input {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  border-radius: 30px;\r\n");
      out.write("  margin-top: 10px;\r\n");
      out.write("  padding: 0px 20px;\r\n");
      out.write("  border: 1px solid lightgray;\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_etc {\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  width: 80%;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit {\r\n");
      out.write("  margin-top: 50px;\r\n");
      out.write("  width: 80%;\r\n");
      out.write("}\r\n");
      out.write(".submit input {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border-radius: 40px;\r\n");
      out.write("  background: linear-gradient(to left, rgb(255, 77, 46), rgb(255, 155, 47));\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-size: 1.2em;\r\n");
      out.write("  letter-spacing: 2px;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  function check(){\r\n");
      out.write("     ff=eval(\"document.myForm\");\r\n");
      out.write("     if(ff.id.value==\"\"){\r\n");
      out.write("        alert(\"ID를 입력하세요\");\r\n");
      out.write("        ff.id.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     if(ff.pw.value==''){\r\n");
      out.write("        alert(\"암호를 입력하세요\");\r\n");
      out.write("        ff.pw.focus();\r\n");
      out.write("        return false;\r\n");
      out.write("     }\r\n");
      out.write("     return true;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"myForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/loginPro.do\" onSubmit=\"return check()\">\r\n");
      out.write("   <div class=\"wrap\">\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("            <h2>로그인</h2>\r\n");
      out.write("\t\t\t<h5><font color=\"#DF9F1F\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</font></h5>\r\n");
      out.write("            <div class=\"login_sns\">\r\n");
      out.write("              <li><a href=\"\"><i class=\"fab fa-instagram\"></i></a></li>\r\n");
      out.write("              <li><a href=\"\"><i class=\"fab fa-facebook-f\"></i></a></li>\r\n");
      out.write("              <li><a href=\"\"><i class=\"fab fa-twitter\"></i></a></li>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"login_id\">\r\n");
      out.write("                <h4>ID</h4>\r\n");
      out.write("                <input type=\"text\" name=\"id\" id=\"id\" placeholder=\"ID\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"login_pw\">\r\n");
      out.write("                <h4>Password</h4>\r\n");
      out.write("                <input type=\"password\" name=\"pw\" id=\"pw\" placeholder=\"Password\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"login_etc\">\r\n");
      out.write("                <div class=\"checkbox\">\r\n");
      out.write("                <input type=\"checkbox\" name=\"\" id=\"\"> ID저장\r\n");
      out.write("             \r\n");
      out.write("             </div>\r\n");
      out.write("                <div class=\"forgot_pw\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/insertForm.do\">회원가입</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"submit\">\r\n");
      out.write("                <input type=\"submit\" value=\"submit\">\r\n");
      out.write("            </div>      \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>  \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
