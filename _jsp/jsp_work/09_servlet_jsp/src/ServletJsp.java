import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class ServletJsp extends HttpServlet{
	//doGet()
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8"); //응답할때 한글처리
		PrintWriter out=response.getWriter(); //out객체 생성
		String user="아이유";
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("id", "iu");
		map.put("pw", "123");
		map.put("addr", "서울 구로구");
		request.setAttribute("user", user);
		request.setAttribute("map", map);
		//서블릿에서 JSP로 포워딩
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/jsp/aa.jsp");
		rd.forward(request,response); //JSP로 포워딩
		//Web.xml에 서블릿 등록
		//WebContent/jsp 폴더 만든다
	}//doGet-end
}//class-end
