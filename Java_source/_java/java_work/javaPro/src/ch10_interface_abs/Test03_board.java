package ch10_interface_abs;

public class Test03_board {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAOImp1(); //상위 클래스 변수로 하위 객체 처리 
		dao.boardWrite();
		dao.boardList();
		dao.boardEdit();
		dao.boardContent();
		dao.boardDelete();
	}//main-end
}//class-end
