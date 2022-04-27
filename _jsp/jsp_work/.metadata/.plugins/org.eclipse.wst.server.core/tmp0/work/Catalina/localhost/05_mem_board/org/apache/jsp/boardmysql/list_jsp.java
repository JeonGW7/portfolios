/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2022-02-18 07:17:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boardmysql;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import boardmysql.*;
import java.util.*;
import java.text.SimpleDateFormat;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


int pageSize=10;
SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //연월일 시분초

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
      out.write("    \r\n");

request.setCharacterEncoding("UTF-8");

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String pageNum=request.getParameter("pageNum"); //현재 페이지 받기
if(pageNum==null){
	pageNum="1";
}
int currentPage=Integer.parseInt(pageNum);
int startRow=(currentPage-1)*pageSize+1; //페이지의 시작 글번호 
//				(1-1)*10+1 = 1 
//				(2-1)*10+1 = 11 
//				(3-1)*10+1 = 21 
int endRow=currentPage*pageSize; //페이지의 끝 글번호 
//   1*10 = 10 
//   2*10 = 20 
//   3*10 = 30
int count=0; //글 갯수 넣을 변수
int number=0; //글번호
List<BoardDTO> list=null; //back-end에서 보내준 데이터 받기
BoardDAO dao=BoardDAO.getDao(); //dao객체얻기
count=dao.getCount(); //글갯수얻기
if(count>0){ //글이 존재하면
	list=dao.getList(startRow, pageSize); //dao메서드 호출 list를 받는다
}
number=count-(currentPage-1)*pageSize; //보여줄 글번호 

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <title>list.jsp</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>글목록(전체글:");
      out.print(count);
      out.write(")</h2>\r\n");
      out.write("  <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\">\r\n");
      out.write("        <a href=\"writeForm.jsp\">새글쓰기</a>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  ");

  if(count==0){
	  out.println("<h2>게시판에 저장된 글이 없습니다</h2>");
  }else{ //글이 존재하면
	  
      out.write("\r\n");
      out.write("\t  <table border=\"1\">\r\n");
      out.write("\t    <tr bgcolor=\"ivory\">\r\n");
      out.write("\t      <td>번호</td>\r\n");
      out.write("\t      <td>글제목</td>\r\n");
      out.write("\t      <td>작성자</td>\r\n");
      out.write("\t      <td>작성일</td>\r\n");
      out.write("\t      <td>조회수</td>\r\n");
      out.write("\t      <td>IP</td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t    ");

	    for(int i=0;i<list.size();i++){
	    	BoardDTO dto=(BoardDTO)list.get(i);
	    	
      out.write("\r\n");
      out.write("\t    \t<tr>\r\n");
      out.write("\t    \t  <td>");
      out.print(number--);
      out.write("</td>\r\n");
      out.write("\t    \t  <td>\r\n");
      out.write("\t    \t  ");

	    	  int wid=0; //변수
	    	  if(dto.getRe_level()>0){
	    		  //답글이면 들여쓰기
	    		  wid=5*(dto.getRe_level());
	    		  
      out.write("\r\n");
      out.write("\t    \t\t  <img src=\"../imgs/level.gif\" width=\"");
      out.print(wid);
      out.write("\" height=\"16\">\r\n");
      out.write("\t    \t\t  <img src=\"../imgs/re.gif\">\r\n");
      out.write("\t    \t\t  ");

	    	  }else{ //원글일때
	    		  
      out.write("\r\n");
      out.write("\t    \t\t  <img src=\"../imgs/level.gif\" width=\"");
      out.print(wid);
      out.write("\" height=\"16\">\r\n");
      out.write("\t    \t\t  ");

	    	  }//else-end
	    	  
      out.write("\r\n");
      out.write("\t    \t  ");
      out.write("\r\n");
      out.write("\t    \t  <a href=\"content.jsp?num=");
      out.print(dto.getNum());
      out.write("&pageNum=");
      out.print(currentPage);
      out.write("\">\r\n");
      out.write("\t    \t  ");
      out.print(dto.getSubject() );
      out.write("\r\n");
      out.write("\t    \t  </a>\r\n");
      out.write("\t    \t  ");
      out.write("\r\n");
      out.write("\t    \t  ");

	    	  if(dto.getReadcount()>=10){
	    		  
      out.write("\r\n");
      out.write("\t    \t\t  <img src=\"../imgs/hot.gif\">\r\n");
      out.write("\t    \t\t  ");

	    	  }
	    	  
      out.write("\r\n");
      out.write("\t    \t  </td>\r\n");
      out.write("\t    \t  <td width=\"80\">");
      out.print(dto.getWriter());
      out.write("</td>\r\n");
      out.write("\t    \t  <td>");
      out.print(dto.getRegdate() );
      out.write("</td>\r\n");
      out.write("\t    \t  <td width=\"45\">");
      out.print(dto.getReadcount() );
      out.write("</td>\r\n");
      out.write("\t    \t  <td>");
      out.print(dto.getIp() );
      out.write("</td>\r\n");
      out.write("\t    \t</tr>\r\n");
      out.write("\t    \t");

	    }//for-end
	    
      out.write("\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t  ");

  }//else-end
  
      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  ");

  if(count>0){
	  
      out.write("\r\n");
      out.write("\t  <table border=\"1\">\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td align=\"center\">\r\n");
      out.write("\t       ");

	       //전체 페이지 수 구하기
	       int pageCount=count/pageSize+(count%pageSize==0?0:1);
	       //int pageCount=(int)(Math.ceil());
	       int pageBlock=10; //블럭당 페이지수
	       int startPage=(int)(currentPage/pageBlock)*10+1; //시작페이지
	       //					   (1/10)*10+1 = 1 
	       //					   (5/10)*10+1 = 1 
	       //					   (9/10)*10+1 = 1 
	       //					   (10/10)*10+1 = 11
	       //					   (19/10)*10+1 = 11
	       //					   (20/10)*10+1 = 21
	       //					   (29/10)*10+1 = 21
	       int endPage=startPage+pageBlock-1;
	       //			     1+10-1=10
	       //			     11+10-1=20
	       //			     21+10-1=30
	       if(endPage>pageCount){ //에러방지
	    	   endPage=pageCount;
	       }
	       //이전블럭
	       if(startPage>10){
	    	   
      out.write("\r\n");
      out.write("\t    \t   <a href=\"list.jsp?pageNum=");
      out.print(startPage-10);
      out.write("\">[이전블럭]</a>\r\n");
      out.write("\t    \t   ");

	       }//if-end
	       //페이지처리
	       for(int i=startPage;i<=endPage;i++){
	    	   
      out.write("\r\n");
      out.write("\t    \t   <a href=\"list.jsp?pageNum=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.write('[');
      out.print(i);
      out.write("]</a>\r\n");
      out.write("\t    \t   ");

	       }//for-end
	       //다음 블럭
	       if(endPage<pageCount){
	    	   
      out.write("\r\n");
      out.write("\t    \t   <a href=\"list.jsp?pageNum=");
      out.print(startPage+10);
      out.write("\">[다음블럭]</a>\r\n");
      out.write("\t    \t   ");

	       }//if-end
	       
      out.write("\r\n");
      out.write("\t      </td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t  ");

  }//if-end //글이존재하면
  
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
