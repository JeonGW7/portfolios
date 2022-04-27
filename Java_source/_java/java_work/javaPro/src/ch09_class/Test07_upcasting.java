package ch09_class;
//upcasting
//����Ŭ���� ������ ���� ��ü ó���ϴ� ��

class PanMae2{
	protected String pum;
	protected int su;
	protected int dan;
	
	//����Ʈ ������
	public PanMae2(){}
	//�����ִ� ������
	public PanMae2(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	//����� ���� �޼��� 
	public void disp(){
		System.out.println(pum+"--"+su+"--"+dan);
	}
}//class-end---
//�Ļ�Ŭ����
class SalePanMae extends PanMae2{
	private double rate; //������
	// ����Ʈ ������
	public SalePanMae(){}
	// ���� �ִ� ������
	public SalePanMae(String pum,int su,int dan,double rate){
		super(pum,su,dan); //���� Ŭ������ ������ ȣ�� 
		this.rate = rate;
	}
	//�������̵� : ��ӹ��� �޼��� ���� ������ 
	public void disp(){
		System.out.println();
		System.out.println("pum: "+pum);
		System.out.println("su: "+su);
		System.out.println("dan: "+dan);
		System.out.println("���ΰ�: "+(int)(dan-(dan*rate)));
	}
}//class-end---
public class Test07_upcasting {
	public static void main(String[] args) {
		PanMae2 p = new PanMae2("�ѿ챹��",1,5000);
		p.disp();
		//
		//����Ŭ���� ������ ���� ��üó�� : �޸� ���� ȿ���� ����
		p = new SalePanMae("�ع����κ��", 1, 7000, 0.2);
		p.disp();
	}//main-end
}//class-end
