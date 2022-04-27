package ch10_interface_abs;
//인터페이스 = 메뉴판과 유사
public interface BoardDAO {
	public void boardWrite();
	public void boardList();
	public void boardEdit();
	public void boardContent();
	public void boardDelete();
}
