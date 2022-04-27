package ch14_exception;
//throw : ���� ����
//throws : �޼��� ȣ���� �װ����� ����� �ѱ��
public class Test04_exception {
	public static void main(String[] args) {
		int jum[]={50,60,70,80,90};
		try{
			double a = Jumsu.calcAvg(jum);
			System.out.println("���: "+a);
		}catch(JumsuException ex){
			new Throwable("msg");
			new Exception("msg");
			System.out.println(ex);
		}
	}//main-end
}//class-end
//--------------------------------
class Jumsu{
	public static double calcAvg(int score[]) throws JumsuException {
		if(score.length != 6){//���ܹ߻����� 
			throw new JumsuException("�迭 ���� �߻�");
		}
		//����ó��
		int sum = 0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}//for-end
		double avg = (double)sum/score.length;
		return avg;
	}//calcAvg()-end
}//class-end
//--------------------------------
@SuppressWarnings("serial")
class JumsuException extends Exception{
	public JumsuException(String msg){
		super(msg);
	}
}