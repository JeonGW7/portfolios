/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-17 07:38:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.*;

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
String id=(String)session.getAttribute("id"); //** id를 세션으로 부터 가져와서
MemberDAO dao=MemberDAO.getDao(); //dao객체 얻기
MemberDTO dto=dao.getMember(id); //dao메서드 호출

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>updateForm.jsp</title>\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("   function openDaumPostcode(){\r\n");
      out.write("       \r\n");
      out.write("      new daum.Postcode({\r\n");
      out.write("         oncomplete:function(data){\r\n");
      out.write("            document.getElementById('zipcode').value=data.zonecode;\r\n");
      out.write("            document.getElementById('addr').value=data.address;\r\n");
      out.write("          }\r\n");
      out.write("         \r\n");
      out.write("      }).open();\r\n");
      out.write("   }//openDaumPostcode()---\r\n");
      out.write("  </script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  function check(){\r\n");
      out.write("\t  if($('#pw').val()==''){\r\n");
      out.write("\t\t  alert(\"암호를 입력 하세요\");\r\n");
      out.write("\t\t  $('#pw').focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if($('#pw2').val()==''){\r\n");
      out.write("\t\t  alert(\"암호확인을 입력 하세요\");\r\n");
      out.write("\t\t  $('#pw2').focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if($('#pw').val()!=$('#pw2').val()){\r\n");
      out.write("\t\t  alert(\"암호와 암호확인이 일치하지 않습니다\");\r\n");
      out.write("\t\t  $('#pw2').val('');\r\n");
      out.write("\t\t  $('#pw').val('').focus();\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  $('#email').val($('#email1').val()+$('#email2').val());\r\n");
      out.write("\t  $('#tel').val($('#tel1').val()+$('#tel2').val()+$('#tel3').val());\r\n");
      out.write("\t  return true;\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  h2{text-align:center;}\r\n");
      out.write("  table{\r\n");
      out.write("  margin:auto;\r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>내 정보 수정</h2>\r\n");
      out.write("  <form name=\"updateForm\" method=\"post\" action=\"updatePro.jsp\" onSubmit=\"return check()\">\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>ID</td>\r\n");
      out.write("        <td>");
      out.print(dto.getId());
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>암호</td>\r\n");
      out.write("        <td><input type=\"password\" name=\"pw\" id=\"pw\" size=\"20\">*필수입력</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>암호확인</td>\r\n");
      out.write("        <td><input type=\"password\" name=\"pw2\" id=\"pw2\" size=\"20\">*필수입력</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>이름</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"name\" id=\"name\" value=\"");
      out.print(dto.getName());
      out.write("\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      String email=dto.getEmail();
      int index=email.indexOf('@');
      String email1=email.substring(0,index);
      String email2=email.substring(index);
      String email3=email.substring(index+1); //@안보여주기위해서
      
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>이메일</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <input type=\"text\" name=\"email1\" id=\"email1\" value=\"");
      out.print(email1);
      out.write("\">\r\n");
      out.write("          @\r\n");
      out.write("          <select name=\"email2\" id=\"email2\">\r\n");
      out.write("            <option value=\"");
      out.print(email2);
      out.write('"');
      out.write('>');
      out.print(email3);
      out.write("</option>\r\n");
      out.write("            <option value=\"@naver.com\">naver.com</option>\r\n");
      out.write("            <option value=\"@daum.net\">daum.net</option>\r\n");
      out.write("            <option value=\"@nate.com\">nate.com</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <input type=\"hidden\" name=\"email\" id=\"email\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      String tel=dto.getTel();
      String tel1=tel.substring(0,3);//01012345678
      String tel2=tel.substring(3,7);//01012345678
      String tel3=tel.substring(7);//01012345678
      
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>전화</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <select name=\"tel1\" id=\"tel1\">\r\n");
      out.write("            <option value=\"010\">010</option>\r\n");
      out.write("            <option value=\"018\">018</option>\r\n");
      out.write("            <option value=\"017\">017</option>\r\n");
      out.write("          </select>-\r\n");
      out.write("          <input type=\"text\" name=\"tel2\" id=\"tel2\" size=\"4\" value=\"");
      out.print(tel2);
      out.write("\">-\r\n");
      out.write("          <input type=\"text\" name=\"tel3\" id=\"tel3\" size=\"4\" value=\"");
      out.print(tel3);
      out.write("\">\r\n");
      out.write("          <input type=\"hidden\" name=\"tel\" id=\"tel\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>우편번호</td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <input type=\"text\" name=\"zipcode\" id=\"zipcode\" size=\"7\" value=\"");
      out.print(dto.getZipcode());
      out.write("\">\r\n");
      out.write("          <input type=\"button\" value=\"주소찾기\" onclick=\"openDaumPostcode()\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>주소</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"addr\" id=\"addr\" size=\"50\" value=\"");
      out.print(dto.getAddr());
      out.write("\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>상세주소</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"addr2\" id=\"addr2\" size=\"20\" value=\"");
      out.print(dto.getAddr2() );
      out.write("\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("          <input type=\"submit\" value=\"내정보수정\">\r\n");
      out.write("          <input type=\"button\" value=\"취소\" onclick=\"location='main.jsp'\">\r\n");
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
