package ch01;

public class Test04 {

	public static void main(String[] args) {
		// \n : new line
		// \r : 캐리지 리턴, 그 줄의 첫번째로 커서 이동된다. 
		// \t : 일정 간격을 띄움
		// '' : 인용부호
		// "" : 인용부호 
		// \n
		System.out.print("kim1\n");
		System.out.print("lee1\n");
		System.out.print("park1\n");
		
		// \r 
		System.out.print("kim2\r");
		System.out.print("lee2\r");
		System.out.print("park2\r");
		
		// \r \n 
		System.out.println("park3\r\n");
		
		// \''
		System.out.println("\"kim\""); //"kim"
		System.out.println("\'kim\'"); //'kim'
		System.out.println("\\kim\\"); //\kim\
		
	}//main-end

}//class-end
