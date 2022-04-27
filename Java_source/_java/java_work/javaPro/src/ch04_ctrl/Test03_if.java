package ch04_ctrl;

public class Test03_if {

	public static void main(String[] args) {
		//점수를 입력받아 학점 구하기 
		//90~100 A학점
		//80~89 B학점
		//70~79 C학점
		//60~69 D학점
		//0~59 F학점
		int score = Integer.parseInt(args[0]);
		if(score>100||score<0){
			System.out.println("0~100사이만 입력하세요");
		} else{
			char grade = ' '; //학점 넣을 변수
			if(score<=100 && score>=90){
				grade = 'A';
			} else if(score>=80){ //80~89
				grade = 'B';
			} else if(score>=70){ //70~79
				grade = 'C';
			} else if(score>=60){ //60~69
				grade = 'D';
			} else{ // 0~59
				grade = 'F';
			}
			
			System.out.println("점수:"+score);
			System.out.println("학점:"+grade);
		}//else-end
		
	}//main-end

}//class-end
