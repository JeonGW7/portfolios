

import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	public int cnt=0; //전역변수, 이 사이트에 접속자들을 count하기 위해
	//초기화 작업,DB초기화
	public void init(ServletConfig conf) throws ServletException {
		//초기화 작업,DB초기화
		System.out.println("init() called...시작");
	}
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//클라이언트 요청시 마다 클라이언트 요청을 받는다
		System.out.println("service called..... 서비스");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter(); //out객체 생성
		out.println("<html>");
		out.println("<body>");
		cnt++; //방문횟수
		out.println("<h2>service() 방문횟수:"+cnt+"</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}//service()-end
	public void destroy(){
		//클래스가 메모리에서 unLoad 되기 직전에 호출
		System.out.println("destroy() called..끝");
	}
	/*
	 * 서블릿 라이프 사이클
	 * init() -> service() -> destroy()
	 *            doGet()
	 *            doPost()
	 *            
	 * init() : 처음 실행할 때 1번호출
	 * service() : 클라이언트 접속을 병행적으로 받는다, 즉 스레드 기능이 있다 
	 * destroy() : 클래스가 메모리에서 unLoad될때 호출된다
	 * */
}//class-end
