package upload;
import java.io.*;
import javax.servlet.http.*;
import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;
public class FileUploadBean {
	//사용자 정의 메서드
	public String upload(HttpServletRequest request){
		String reply=""; //변수
		String savepath="c:\\_upload\\";
		int size=1024*1024*5;
		try{
			MultipartRequest mu=new MultipartRequest(request,savepath,size,"utf-8",new DefaultFileRenamePolicy());
			reply="파일 업로드 성공";
		}catch(Exception ex){
			reply="파일 업로드 실패:"+ex;
		}
		return reply;
	}//upload-end
}//class-end
