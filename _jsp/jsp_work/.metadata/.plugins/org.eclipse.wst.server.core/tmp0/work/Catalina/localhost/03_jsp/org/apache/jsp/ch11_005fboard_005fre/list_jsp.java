/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-16 00:56:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch11_005fboard_005fre;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardre.*;
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
int nowPage=0; //???????????????
int nowBlock=0; //????????????
int totalRecord=0; //?????? ??? ??????
int numPerPage=10; //???????????? ?????????
int totalPage=0;  //??????????????????
int totalBlock=0; //???????????????
int pagePerBlock=10; //????????? ????????????
int beginPerPage=0; //?????? ?????????(????????? ??????)
String keyField=""; //????????? name,subject,content
String keyWord="";  //????????????
Vector <BoardDTO> vec=null;

      out.write('\r');
      out.write('\n');

//??????
if(request.getParameter("keyWord")!=null){
	keyWord=request.getParameter("keyWord");
	keyField=request.getParameter("keyField");
}
//?????? ?????????
if(request.getParameter("reload")!=null){
	if(request.getParameter("reload").equals("true")){
		keyWord="";
		keyField="";
	}
}

      out.write("\r\n");
      out.write("\r\n");

java.util.Date date=new java.util.Date();
boardre.BoardDAO dao=new boardre.BoardDAO(); //????????????
vec=dao.getList(keyField,keyWord); //dao????????? ??????
totalRecord=vec.size(); //??? ??? ??????
if(request.getParameter("page")!=null){
	nowPage=Integer.parseInt(request.getParameter("page"));
}
beginPerPage=nowPage*numPerPage; //?????? ????????? ??????
// 0*10 = 0  ?????????????????? ?????? 0~9
// 1*10 = 10			10~19
// 2*10 = 20			20~29
// 3*10 = 30			30~39
// 4*10 = 40			40~49
totalPage=(int)(Math.ceil((double)totalRecord/numPerPage));
// ex)?????? 37 : ?????????4?????? ???????????? 
if(request.getParameter("nowBlock")!=null){
	nowBlock=Integer.parseInt(request.getParameter("nowBlock")); //?????? ????????? ????????? ?????????
}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>list.jsp</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  h2{text-align: center;}\r\n");
      out.write("  table{margin: auto;}\r\n");
      out.write("  table.wid{width:60%;}\r\n");
      out.write("  </style>\r\n");
      out.write("  <script>\r\n");
      out.write("    function check(){\r\n");
      out.write("    \tif(document.searchForm.keyWord.value==''){\r\n");
      out.write("    \t\talert(\"???????????? ???????????????\");\r\n");
      out.write("    \t\tdocument.searchForm.keyWord.focus();\r\n");
      out.write("    \t\treturn false;\r\n");
      out.write("    \t}\r\n");
      out.write("    \tdocument.searchForm.submit();\r\n");
      out.write("    }//check()-end========================\r\n");
      out.write("    function list(){\r\n");
      out.write("    \tdocument.listForm.action=\"list.jsp\";\r\n");
      out.write("    \tdocument.listForm.submit();\r\n");
      out.write("    }//list()-end=========================\r\n");
      out.write("    //????????? ??????\r\n");
      out.write("    function read(number){\r\n");
      out.write("    \tdocument.readForm.action=\"content.jsp\";\r\n");
      out.write("    \tdocument.readForm.num.value=number;\r\n");
      out.write("    \tdocument.readForm.submit();\r\n");
      out.write("    }//read()-end=========================\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"ivory\">\r\n");
      out.write("  <h2>??????????????????</h2>\r\n");
      out.write("  <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"center\">\r\n");
      out.write("      Total:");
      out.print(totalRecord );
      out.write("Articles&nbsp;(<font color=\"blue\">");
      out.print(nowPage+1 );
      out.write('/');
      out.print(totalPage );
      out.write("</font>)\r\n");
      out.write("      </td>\r\n");
      out.write("      <td align=\"right\">\r\n");
      out.write("        <a href=\"writeForm.jsp\">????????????</a>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <table border=\"1\" class=\"wid\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("      ");

      if(vec.isEmpty()){
    	  out.println("????????? ?????? ????????????");
      }else{//????????? ?????? ?????????
    	  
      out.write("\r\n");
      out.write("    \t  <table border=\"1\" width=\"100%\">\r\n");
      out.write("    \t    <tr bgcolor=\"cyan\" height=\"120%\">\r\n");
      out.write("    \t      <th>?????????</th>\r\n");
      out.write("    \t      <th>?????????</th>\r\n");
      out.write("    \t      <th>?????????</th>\r\n");
      out.write("    \t      <th>??????</th>\r\n");
      out.write("    \t      <th>?????????</th>\r\n");
      out.write("    \t    </tr>\r\n");
      out.write("    \t    ");

    	    for(int i=beginPerPage;i<(beginPerPage+numPerPage);i++){
    	    	if(i==totalRecord){
    	    		break; //for??????
    	    	}
    	    	BoardDTO dto=(BoardDTO)vec.get(i);
    	    	String name=dto.getName();
    	    	String subject=dto.getSubject();
    	    	String regdate=dto.getRegdate();
    	    	int depth=dto.getDepth();
    	    	int num=dto.getNum();
    	    	int count=dto.getCount(); //????????? 
    	    	
      out.write("\r\n");
      out.write("    \t    \t<tr>\r\n");
      out.write("    \t    \t  ");
      out.write("\r\n");
      out.write("    \t    \t  <td align=\"center\">");
      out.print(totalRecord-i );
      out.write("</td>\r\n");
      out.write("    \t    \t  ");
      out.write("\r\n");
      out.write("    \t    \t  <td>\r\n");
      out.write("    \t    \t  ");

    	    	  if(depth>0){ //???????????? 
    	    		 for(int re=0;re<depth;re++){
    	    			 out.println("&nbsp;&nbsp;");//????????????
    	    		 }
    	    	  }
    	    	  
      out.write("\r\n");
      out.write("    \t    \t  <a href=\"javaScript:read('");
      out.print(num);
      out.write("')\">");
      out.print(subject );
      out.write("</a>\r\n");
      out.write("    \t    \t  </td>\r\n");
      out.write("    \t    \t  <td>");
      out.print(name );
      out.write("</td>\r\n");
      out.write("    \t    \t  <td>");
      out.print(regdate );
      out.write("</td>\r\n");
      out.write("    \t    \t  <td>");
      out.print(count );
      out.write("</td>\r\n");
      out.write("    \t    \t</tr>\r\n");
      out.write("    \t    \t");

    	    }//for-end
    	    
      out.write("\r\n");
      out.write("    \t  </table>\r\n");
      out.write("    \t  ");
 
      }//else-end-?????? ?????????
      //????????????
      //???????????????
      //??????
      
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\">\r\n");
      out.write("         <a href=\"writeForm.jsp\">[?????????]</a>\r\n");
      out.write("         <a href=\"javaScript:list()\">[?????????????????????]</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       ");
      out.write("\r\n");
      out.write("       <td align=\"left\">Go to Page\r\n");
      out.write("       ");

       if(totalRecord != 0){ //?????? ????????????
    	   if(nowBlock>0){ //????????????
    		   int page1=((nowBlock-1)*pagePerBlock+9);
    		   
      out.write("\r\n");
      out.write("    \t\t   <a href=\"list.jsp?nowBlock=");
      out.print(nowBlock-1);
      out.write("&page=");
      out.print(page1);
      out.write("&keyField=");
      out.print(keyField);
      out.write("&keyWord=");
      out.print(keyWord);
      out.write("\">[????????????]</a>\r\n");
      out.write("    \t\t   ");
 
    	   }//????????????-end
    	   //????????? ??????
    	   for(int i=0;i<pagePerBlock;i++){
    		   
      out.write("\r\n");
      out.write("    \t\t   <a href=\"list.jsp?nowBlock=");
      out.print(nowBlock);
      out.write("&page=");
      out.print((nowBlock*pagePerBlock)+i);
      out.write('"');
      out.write('>');
      out.write('[');
      out.print((nowBlock*pagePerBlock)+i+1);
      out.write("]</a>\r\n");
      out.write("    \t\t   ");
 
    		   if(((nowBlock*pagePerBlock)+i+1)==totalPage){break;} //for??????
    	   }//????????? ??????-end
    	   //????????????
    	   if(totalBlock>nowBlock){
    		   
      out.write("\r\n");
      out.write("    \t\t   <a href=\"list.jsp?nowBlock=");
      out.print(nowBlock+1);
      out.write("&page=");
      out.print((nowBlock+1)*pagePerBlock);
      out.write("&keyField=");
      out.print(keyField);
      out.write("&keyWord=");
      out.print(keyWord);
      out.write("\">\r\n");
      out.write("    \t\t   [????????????]\r\n");
      out.write("    \t\t   </a>\r\n");
      out.write("    \t\t   ");
 
    	   }//????????????-end
       }//?????? ????????????-end
       
      out.write("\r\n");
      out.write("       </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <form name=\"searchForm\" method=\"post\" action=\"list.jsp\">\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td align=\"center\" valign=\"bottom\">\r\n");
      out.write("          <select name=\"keyField\">\r\n");
      out.write("            <option value=\"subject\">??????</option>\r\n");
      out.write("            <option value=\"name\">??????</option>\r\n");
      out.write("            <option value=\"content\">?????????</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <input type=\"text\" name=\"keyWord\" size=\"16\">\r\n");
      out.write("          <input type=\"hidden\" name=\"page\" value=\"0\">\r\n");
      out.write("          <input type=\"button\" value=\"??????\" onclick=\"check()\">\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </form>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <form name=\"listForm\" method=\"post\">\r\n");
      out.write("    <input type=\"hidden\" name=\"reload\" value=\"true\">\r\n");
      out.write("    <input type=\"hidden\" name=\"page\" value=\"0\">\r\n");
      out.write("    <input type=\"hidden\" name=\"nowBlock\" value=\"0\">\r\n");
      out.write("  </form>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <form name=\"readForm\" method=\"post\">\r\n");
      out.write("    <input type=\"hidden\" name=\"num\" value=\"\">");
      out.write("\r\n");
      out.write("    <input type=\"hidden\" name=\"page\" value=\"");
      out.print(nowPage);
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" name=\"keyField\" value=\"");
      out.print(keyField );
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" name=\"keyWord\" value=\"");
      out.print(keyWord );
      out.write("\">\r\n");
      out.write("  </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
