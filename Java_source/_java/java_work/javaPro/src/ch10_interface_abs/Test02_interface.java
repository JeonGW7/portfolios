package ch10_interface_abs;
interface AA2{
	public int aa();
}
interface BB2{
	public char bb();
}
interface CC2{
	public String cc();
}
//�������̽��� Ŭ�������� ��ӹ޾� ���� 
class DD2 implements AA2,BB2,CC2{
	//�������̵�
	public int aa(){
		return 100;
	}
	public char bb(){
		return 'A';
	}
	public String cc(){
		return "ȫ�浿";
	}
	
	
}
public class Test02_interface {
	public static void main(String[] args) {
		DD2 D = new DD2();
		int a = D.aa();
		char ch = D.bb();
		String s = D.cc();
		System.out.println("a:"+a);
		System.out.println("ch:"+ch);
		System.out.println("s:"+s);
		System.out.println(new DD2().aa());
		System.out.println(new DD2().bb());
		System.out.println(new DD2().cc());
	}

}
