package ch10_interface_abs;

public class BoardDAOImp1 implements BoardDAO{

	@Override
	public void boardWrite() {
		System.out.println("�Խ��� �۾���");
	}

	@Override
	public void boardList() {
		System.out.println("�Խ��� ����Ʈ ���");
	}

	@Override
	public void boardEdit() {
		System.out.println("�Խ��� �ۼ���");
	}

	@Override
	public void boardContent() {
		System.out.println("�Խ��� �� ���� ����");
	}

	@Override
	public void boardDelete() {
		System.out.println("�Խ��� �� ���� ");
	}

}
//Test03_board.java