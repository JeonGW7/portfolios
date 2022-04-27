package ch09_class;

public class Test02_homework {

	public static void main(String[] args) {
		String str = args[0];
		String s1 =str.substring(7,8);
		int j = Integer.parseInt(s1);
//		char ch = s1.charAt(7);
//		if(ch=='1' || ch=='3')
//		if(ju.equals("1") || ju.equals("3")
		if(j%2==1){
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}

}
