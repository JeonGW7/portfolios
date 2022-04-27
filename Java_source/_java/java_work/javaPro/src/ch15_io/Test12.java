package ch15_io;
import java.io.*;
public class Test12 {
	public static void main(String[] args) throws Exception {
		Test11_HandPhone phone = new Test11_HandPhone("플립3", 1500000, "SKT");
		//저장 작업
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		oos.writeObject(phone);//파일로 쓰기 작업
		oos.close();
		
		//읽어오기 작업
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		Test11_HandPhone phone2 = (Test11_HandPhone)ois.readObject();
		System.out.println("핸드폰 이름:"+phone2.getName());
		System.out.println("핸드폰 가격:"+phone2.getPrice());
		System.out.println("통신사:"+phone2.getTelecom());
		ois.close(); //반드시 close()해야한다 
	}//main-end
}//class-end
