package ch14_exception;
//throw : 예외 생성
//throws : 메서드 호출한 그곳으로 제어권 넘긴다
public class Test04_exception {
	public static void main(String[] args) {
		int jum[]={50,60,70,80,90};
		try{
			double a = Jumsu.calcAvg(jum);
			System.out.println("평균: "+a);
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
		if(score.length != 6){//예외발생조건 
			throw new JumsuException("배열 예외 발생");
		}
		//정상처리
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