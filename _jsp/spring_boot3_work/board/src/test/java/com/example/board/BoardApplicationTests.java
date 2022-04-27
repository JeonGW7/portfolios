package com.example.board;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import com.example.board.model.BoardVO;
import com.example.board.mapper.BoardMapper;
import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootTest
class BoardApplicationTests {
	@Autowired
	private BoardMapper boardMapper; //변수를 자동 setter 
	@Test
	void contextLoads() {
	}
	/*
	@Test
	public void TestInsert() throws Exception{
		BoardVO vo=new BoardVO();
		vo.setSubject("제목1");
		vo.setContent("내용1");
		vo.setWriter("이름1");
		boardMapper.boardInsert(vo);
	}
	*/
	/*
	//글내용보기
	@Test
	public void selectDetail() throws Exception{
		BoardVO vo=boardMapper.boardDetail(3);
		System.out.println(vo.getBno());
		System.out.println(vo.getSubject());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
	}
	*/
	/*
	//리스트
	@Test
	public void testList() throws Exception{
		int boardCount=boardMapper.boardCount();
		if(boardCount>0) {
			List<BoardVO> boardList=boardMapper.boardList();
			if(CollectionUtils.isEmpty(boardList)==false) {
				for(BoardVO vo:boardList) {
					System.out.println("---------------");
					System.out.println(vo.getSubject());
					System.out.println(vo.getContent());
					System.out.println(vo.getWriter());
					System.out.println(vo.getReg_date());
					System.out.println("---------------");
				}
			}
		}
		
	}
	*/
	/*
	//글수정
	@Test
	public void testUpdate() throws Exception{
		BoardVO vo=new BoardVO();
		vo.setSubject("제목77");
		vo.setContent("내용77");
		//vo.setWriter("이름77");
		vo.setBno(2);
		boardMapper.boardUpdate(vo);
		
		//수정내용 보기
		BoardVO vo2=boardMapper.boardDetail(2);
		//JSON으로 확인
		String boardJson=new ObjectMapper().writeValueAsString(vo2);
		System.out.println(boardJson);
	}
	*/
	//글삭제
	@Test
	public void testDelete() throws Exception{
		boardMapper.boardDelete(2);
	}
}
