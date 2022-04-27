package ch16_util;
//String�� StringBuffer�ӵ��� ���ϱ�
public class Test06_SB_String {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		long start,end;
		start = System.currentTimeMillis(); //�ý����� ����ð� ���ϱ�
		String str = ""; //����
		for(int i=1;i<=10000;i++){
			str += i;
			str += "+";
		}
		end = System.currentTimeMillis(); //�۾� ����ð� ���ϱ�
		System.out.println("end-start: "+(end-start)+"�и���");
		//---------------------
		//StringBuffer 
		//---------------------
		start = System.currentTimeMillis(); //���۽ð� 
		StringBuffer sb = new StringBuffer(); //��ü ����
		for(int i=1;i<=1000000;i++){
			sb.append(i);
			sb.append("+");
		}
		end = System.currentTimeMillis(); //�۾�����ð� 
		System.out.println("StringBuffer ����ð�:"+(end-start)+"�и���");
	}//main-end
}//class-end
