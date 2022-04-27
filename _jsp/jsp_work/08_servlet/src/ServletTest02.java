import java.io.*; //PrintWriter,IOException

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Date;
import java.text.SimpleDateFormat; //날짜 형식
public class ServletTest02 extends HttpServlet{
	//goGet()오버라이딩
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8"); //웹으로 응답할 때 한글처리
		PrintWriter out=response.getWriter(); //out객체 생성
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		out.println("<html>");
		out.println("<body bgcolor='yellow'>");
		out.println("<font color=blue size=5>");
		out.println("<center><br><br><br>");
		out.println("<img src='/08_servlet/imgs/back.jpg'>");
		out.println("<br>");
		out.println("<marquee>");//자막글씨처럼 보이게
		out.println("오늘은 평범한 화요일 입니다. 서블릿을 하고 있습니다");
		out.println("</marquee>");
		out.println("<br><br><br><hr size=10 color=red><br>");
		out.println(sdf.format(date));
		out.println("</font>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}//doGet()-end
}//class-end
