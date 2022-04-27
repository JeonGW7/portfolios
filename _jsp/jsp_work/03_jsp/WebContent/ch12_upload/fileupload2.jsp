<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.oreilly.servlet.*"
    import="com.oreilly.servlet.multipart.*"
    import="java.io.*"
    import="java.util.*"
    %>
<%--fileupload2.jsp --%>
<%
request.setCharacterEncoding("UTF-8");
String savepath="c:\\_upload\\";
int size=1024*1024*5;
try{
	MultipartRequest mul=new MultipartRequest(request,savepath,size,"utf-8",new DefaultFileRenamePolicy());
	//파일 업로드 
	//form안에서 전송된 파일 정보 받기
	Enumeration en=mul.getFileNames();
	String formName=(String)en.nextElement();
	String filename=mul.getFilesystemName(formName);
	if(filename==null){
		out.println("파일 업로드 되지않음");
	}else{
		//파일 업로드가 되었을때
		out.println("이름:"+mul.getParameter("name")+"<br>");
		out.println("암호:"+mul.getParameter("pw")+"<br>");
		out.println("이메일:"+mul.getParameter("email")+"<br>");
		//
		out.println("Form안의 name:"+formName+"<br>"); //f1
		out.println("filename:"+filename+"<br>");
		String filename2=mul.getFilesystemName("f1");
		out.println("filename2 서버에 저장된 이름:"+filename2+"<br>");
		String originalName=mul.getOriginalFileName("f1"); //원래파일이름
		out.println("originalName:"+originalName+"<br>");
		File file=mul.getFile("f1"); //파일 정보를 File형으로 받는다
		if(file!=null){//업로드된게 있으면
			out.println("파일size:"+file.length()+"<br>");
		}
		String type=mul.getContentType("f1"); //전송된 file의 contentType
		out.println("contentType:"+type+"<br>");
	}
}catch(Exception ex){
	out.println("파일 업로드 예외:"+ex);
}
%>