package ch09_class;
//��ü �迭 ����
class Sung{
	private String name;
	private int kor;
	private int eng;
	
	//default ������
	public Sung(){}
	//���� �ִ� ������
	public Sung(String name,int kor,int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public void disp(){
		System.out.println(name+"--"+kor+"--"+eng);
	}
}
public class Test03_object_arr {

	public static void main(String[] args) {
		Sung kim = new Sung("kim",77,88);
		Sung lee = new Sung("lee",80,90);
		Sung park = new Sung("park",90,100);
		kim.disp();
		lee.disp();
		park.disp();
		System.out.println();
		//
//		int x[] = new int[3];
//		x[0]=100;
//		x[1]=200;
//		x[2]=300;
		//��ü �迭
		Sung s[] = new Sung[3]; //��ü�迭 ����
		s[0] = new Sung("aaa",66,77);
		s[1] = new Sung("bbb",88,99);
		s[2] = new Sung("ccc",90,100);
		for(int i=0;i<s.length;i++){
			s[i].disp();
		}
		System.out.println();
//		int y[] = {10,20,30}
		Sung m[] = {new Sung("kbs",70,80), new Sung("sbs",90,80), new Sung("mbc",99,88)};
		for(int i=0;i<m.length;i++){
			m[i].disp();
		}
	}//main-end
}//class-end
