package ch07_oop;

public class Test07_Member_test {
	public static void main(String[] args) {
		Test07_Member dto = new Test07_Member(); //��ü����
		dto.setId("hong");
		dto.setPwd("p12345");
		dto.setName("ȫ�浿");
		dto.setTel("010-1234-5678");
		dto.setEmail("hong@naver.com");
		dto.setAddr("2�� 205ȣ");
		
		//dto ������ ������, �������� DBó���� �Ѵ�
		System.out.println(dto.getId());
		System.out.println(dto.getPwd());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAddr());
		
	}//main-end
}//class-end
