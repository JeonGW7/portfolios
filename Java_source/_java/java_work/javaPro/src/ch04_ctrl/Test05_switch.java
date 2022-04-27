package ch04_ctrl;

public class Test05_switch {
	public static void main(String[] args) {
		//어떤수를 입력받아서 학점구하기 
		//90~100 'A'
		//80~89 'B'
		//70~79 'C'
		//60~69 'D'
		//0~59 'F'
		int score = Integer.parseInt(args[0]);
		char grade = ' '; //학점 넣을 변수
		if(score>100|| score<0){
			System.out.println("0~100사이만 입력하세요 ");
		} else{
			switch(score/10){ //몫
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7: 
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}//switch-end
		}//else-end
		System.out.println("점수:"+score);
		System.out.println("학점:"+grade);
		
	}//main-end
}//class-end
