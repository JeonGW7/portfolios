package ch10_interface_abs;

public class BoardDAOImp1 implements BoardDAO{

	@Override
	public void boardWrite() {
		System.out.println("게시판 글쓰기");
	}

	@Override
	public void boardList() {
		System.out.println("게시판 리스트 목록");
	}

	@Override
	public void boardEdit() {
		System.out.println("게시판 글수정");
	}

	@Override
	public void boardContent() {
		System.out.println("게시판 글 내용 보기");
	}

	@Override
	public void boardDelete() {
		System.out.println("게시판 글 삭제 ");
	}

}
//Test03_board.java