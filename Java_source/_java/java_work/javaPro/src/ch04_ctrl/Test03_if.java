package ch04_ctrl;

public class Test03_if {

	public static void main(String[] args) {
		//������ �Է¹޾� ���� ���ϱ� 
		//90~100 A����
		//80~89 B����
		//70~79 C����
		//60~69 D����
		//0~59 F����
		int score = Integer.parseInt(args[0]);
		if(score>100||score<0){
			System.out.println("0~100���̸� �Է��ϼ���");
		} else{
			char grade = ' '; //���� ���� ����
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
			
			System.out.println("����:"+score);
			System.out.println("����:"+grade);
		}//else-end
		
	}//main-end

}//class-end
