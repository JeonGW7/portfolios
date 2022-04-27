import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletTest04") //web.xml에 등록안하고 사용함
public class ServletTest04 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter(); //out객체 생성
		
		//클라이언트가 보내준 데이터 받기
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		//처리
		if(id.equals("admin") && pw.equals("12345")){
			out.println("<html>");
			out.println("<body>");
			out.println("<font size=5 color=blue>");
			out.println(id+"님 환영합니다");
			out.println("</font>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}else{
			out.println("<html>");
			out.println("<body>");
			out.println("<Meta http-equiv=refresh content=\'2;url=/08_servlet/html/test04.html\'>");
			out.println("<font size=5 color=red>");
			out.println("id 또는 암호가 틀립니다");
			out.println("</font>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}//doPost-end

}//class-end
