package ch10_interface_abs;

public class Test03_board {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAOImp1(); //���� Ŭ���� ������ ���� ��ü ó�� 
		dao.boardWrite();
		dao.boardList();
		dao.boardEdit();
		dao.boardContent();
		dao.boardDelete();
	}//main-end
}//class-end
