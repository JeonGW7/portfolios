package com.example.board.mapper;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.example.board.model.BoardVO;
//BoardMapper.java
//인터페이스
//@Repository : 해당 클래스가 데이터베이스에 접근하는 클래스임을 명시
@Repository("com.example.board.mapper.BoardMapper")
@Mapper
public interface BoardMapper {
	//인터페이스 메서드 이름이 xml의 id명이 된다
	//글갯수 얻기
	public int boardCount() throws Exception;
	
	//글목록=리스트
	public List<BoardVO> boardList() throws Exception;
	
	//글내용 보기=상세보기
	public BoardVO boardDetail(int bno) throws Exception;
	
	//글쓰기
	public void boardInsert(BoardVO boardVO) throws Exception;
	
	//글수정
	public void boardUpdate(BoardVO boardVO) throws Exception;
	
	//글삭제
	public void boardDelete(int bno) throws Exception;
}
