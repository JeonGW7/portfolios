import java.io.*; //PrintWriter,IOException
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletTest01 extends HttpServlet{
	//doGet()
	//doPost()
	//doGet()오버라이딩
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html;charset=UTF-8"); //클라이언트에 응답할 때 한글처리
		PrintWriter out=response.getWriter(); //out객체 생성
		//웹으로 응답하기
		out.println("<html>");
		out.println("<body>");
		
		out.println("<big><b>Hello</b></big><br>");
		out.println("<big><b>안녕하세요</b></big><br>");
		out.println("<big><b>Servlet 공부하러 왔어요</b></big><br>");
		
		out.println("</body>");
		out.println("</html>");
		out.close(); //필수
		//컴파일=저장
	}//doGet-end
}//class-end
