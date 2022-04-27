package ch07_oop;

public class Test07_Member_test {
	public static void main(String[] args) {
		Test07_Member dto = new Test07_Member(); //객체생성
		dto.setId("hong");
		dto.setPwd("p12345");
		dto.setName("홍길동");
		dto.setTel("010-1234-5678");
		dto.setEmail("hong@naver.com");
		dto.setAddr("2차 205호");
		
		//dto 서버로 보내고, 서버에서 DB처리를 한다
		System.out.println(dto.getId());
		System.out.println(dto.getPwd());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAddr());
		
	}//main-end
}//class-end
