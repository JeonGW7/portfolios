package com.example.board.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.board.model.BoardVO;
import com.example.board.mapper.BoardMapper;//인터페이스

@Service("com.example.board.service.BoardService")
public class BoardService {
	
	@Resource(name="com.example.board.mapper.BoardMapper")
	BoardMapper boardMapper;
	
	//리스트
	public List<BoardVO> boardListService() throws Exception{
		return boardMapper.boardList();
	}
	
	//글내용 보기
	public BoardVO boardDetailService(int bno) throws Exception{
		return boardMapper.boardDetail(bno);
	}
	
	//글쓰기
	public void boardInsertService(BoardVO boardVO) throws Exception{
		boardMapper.boardInsert(boardVO);
	}
	
	//글수정
	public void boardUpdateService(BoardVO boardVO) throws Exception{
		boardMapper.boardUpdate(boardVO);
	}
	
	//글삭제
	public void boardDeleteService(int bno) throws Exception{
		boardMapper.boardDelete(bno);
	}
}
