package ch08_const;
//this() : �ڽ��� Ŭ���� ���� ������ ȣ��
class Cons{
	String title;
	int num;
	//����Ʈ ������
	public Cons(){}
	//���� �ִ� ������
	public Cons(String title){
		this(title,100);//�ڽ��� Ŭ���� �ȿ� �ִ� ������ ȣ��
	}
	//���� �ִ� ������
	public Cons(String title, int num) {
		this.title = title;
		this.num = num;
	}
	//����� ���� �޼ҵ�
	public void disp(){
		System.out.println("title: "+title);
		System.out.println("num: "+num);
		System.out.println();
	}
}//class-end--
public class Test03_this {
	public static void main(String[] args) {
		Cons c1 = new Cons("����1");
		c1.disp();
		//
		Cons c2 = new Cons("����2",200);
		c2.disp();
	}//main-end
}//class-end
