package ch03_oper;
//���迬��, ������ 
public class Test02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("���迬��");
		System.out.println(7>5); //true
		System.out.println(7>=5); //true
		System.out.println(7<5); //false
		System.out.println(7<=5); //false
		System.out.println(7!=5); //true
		System.out.println(7==5); //false
		System.out.println();
		//
		System.out.println("���迬��� ������");
		System.out.println(7>5 && 7>3); //true
		System.out.println(7>5 && 7>10); //false
		System.out.println(7>5 || 7>10); //true
	}//main-end

}//class-end
