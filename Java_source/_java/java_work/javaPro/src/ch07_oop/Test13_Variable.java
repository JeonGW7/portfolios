package ch07_oop;
//static ������ �߸� ����� ���� 
class SangPum13{
	//��������=Ŭ��������=�ʵ�=������Ƽ=property
	private String pum; //ǰ��
	private int su; //����
	//private static int dan; //�ܰ�
	private int dan; //�ܰ�
	
	//������
	public SangPum13(String pum,int su,int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}
	
	//����� ���� �޼��� 
	public void disp(){
		System.out.println(pum+"--"+su+"--"+dan);
	}
}
public class Test13_Variable {
	public static void main(String[] args) {
		SangPum13 banana = new SangPum13("�ٳ���", 1, 3500); //��ü����
		SangPum13 apple = new SangPum13("���", 3, 6000);
		SangPum13 orange = new SangPum13("������", 5, 3500);
		banana.disp();
		apple.disp();
		orange.disp();
	}//main-end
}//class-end
