package mailupload;
import java.io.*;
import javax.servlet.http.*;
import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;
public class MailUpload {
	//사용자 정의 메서드
	public String upload(HttpServletRequest request){
		String reply="";
		try{
			String savepath="c:\\_upload\\";
			int size=1024*1024*5;
			MultipartRequest mm=new MultipartRequest(request,savepath,size,"utf-8",new DefaultFileRenamePolicy());
			//파일 업로드 끝
			String from=mm.getParameter("from"); //html에서 보내준 데이터 받는다
			String to=mm.getParameter("to");
			String subject=mm.getParameter("subject");
			String content=mm.getParameter("content");
			//한글 깨지는것 해결
			subject=new String(subject.getBytes("utf-8"),"8859_1");
			content=new String(content.getBytes("utf-8"),"8859_1");
			//
			MailMessage mail=new MailMessage("smtp.nate.com");
			mail.from(from);
			mail.to(to);
			mail.setSubject(subject);
			PrintStream out=mail.getPrintStream();
			out.println(content);
			mail.sendAndClose(); //출력 스트림의 내용을 보내고 종료
			reply="메일보내기,파일업로드 성공";
		}catch(Exception ex){
			reply="메일보내기,파일업로드 실패:"+ex;
		}
		return reply;
	}//upload-end
}//class-end
