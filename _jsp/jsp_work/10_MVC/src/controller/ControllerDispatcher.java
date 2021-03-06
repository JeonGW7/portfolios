package controller;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;//HashMap
import command.CommandAction;

//컨트롤러=서블릿이다 
public class ControllerDispatcher extends HttpServlet{
	
	private Map map=new HashMap();//변수
	
	//init() : 초기화 작업
	public void init(ServletConfig config) throws ServletException{
		String path=config.getServletContext().getRealPath("/");
		//System.out.println("realpath:"+path);
		
		String pros=path+config.getInitParameter("proFile");
		Properties pr=new Properties();//객체생성
		
		FileInputStream f=null;
		try{
			f=new FileInputStream(pros);//CommancPro.properties 읽기
			pr.load(f);
		}catch(Exception ex){
			System.out.println("파일 읽기 예외 :"+ex);
		}finally{
			try{
				if(f!=null){f.close();}
			}catch(Exception ex2){}
		}//finally-------------------------------------------
		
		Iterator keyItor=pr.keySet().iterator();//properties파일 내용을 처리하기위해 받음
		
		while(keyItor.hasNext()){//자료가 있는 동안 반복
 			
			String key=(String)keyItor.next();//       /board/list.do
 			String className=pr.getProperty(key);//    action.board.ListAction
			
 			try{
				Class commandClass=Class.forName(className);//해당문자열을 클래스로 만든다
				Object commandObject=commandClass.newInstance();//클래스를 객체생성
				map.put(key, commandObject);///
				
			}catch(Exception ex3){
				System.out.println("property 파일내용을 클래스 객체로 만드는 중 예외 발생 "+ex3);
			}//catch
			
		}//while end---
	}//init() end----------
		
	//웹에서 요청시 get,post 
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException,ServletException{
		 
		reqPro(request,response);//메서드 호출
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws IOException,ServletException{
		 
		reqPro(request,response);//메서드 호출
		
	}
	
	//사용자 정의 메서드
	private void reqPro(HttpServletRequest request,HttpServletResponse response) 
			throws IOException,ServletException{
		
		String view="";//jsp넣을 변수 
		CommandAction commandAction=null;//Action클래스 넣을 변수
		
		try{
			String uri=request.getRequestURI();//  /프로젝트명/board/list.do
		 	//프로젝트명=context이름 
			if(uri.indexOf(request.getContextPath())==0){// 프로젝트명
				uri=uri.substring(request.getContextPath().length());
				//   /board.list.do
			}//if
			//상위 클래스 변수로 하위 객체 처리
			commandAction=(CommandAction)map.get(uri);//  /board/list.do 키에 해당하는 객체를 얻는다
			view=commandAction.requestPro(request, response);//메서드 호출 ,view 얻는다
			// view="/board/list.jsp"; 객체.메서드()
		}catch(Throwable ex){
			throw new ServletException(ex);
		}//catch
		
		RequestDispatcher rd=request.getRequestDispatcher(view);
		rd.forward(request, response);//jsp로 포워딩
	}//reqPro() end
}//class end---
