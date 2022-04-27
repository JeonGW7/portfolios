package mail;
import java.io.*;
import com.oreilly.servlet.*;
public class MailSender {
	//전역변수
	private String from;
	private String to;
	private String subject;
	private String content;
	
	public MailSender(){ //생성자: 초기화작업
		from="";
		to="";
		subject="";
		content="";
	}//cons-end
	//setter메서드만 넣기 
	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}
	//기타 메서드
	public String send(){
		String reply="";
		try{
			MailMessage mail=new MailMessage("smtp.nate.com");
			mail.from(from);
			mail.to(to);
			mail.setSubject(subject);
			PrintStream out=mail.getPrintStream(); //out객체 생성
			out.println(content);
			mail.sendAndClose(); //출력 스트림 내용을 보내고 종료
			reply="메일 보내기 성공";
		}catch(Exception ex){
			reply="메일전송실패:"+ex;
		}
		return reply;
	}
}//class-end
