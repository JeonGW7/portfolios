import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest03 extends HttpServlet{
	//doGet()
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		//클라이언트가 보내준 데이터 받기
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String addr=request.getParameter("addr");
		//DB작업
		//웹으로 응답
		out.println("<html>");
		out.println("<body>");
		out.println("당신의 이름은 "+name+"<br>");
		out.println("당신의 이메일은 "+email+"<br>");
		out.println("당신의 주소는 "+addr+"<br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		//컴파일=저장
		//web.xml에 서블릿 등록
	}//doGet()-end
}//class-end
