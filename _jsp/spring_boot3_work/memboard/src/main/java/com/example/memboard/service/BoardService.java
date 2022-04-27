package com.example.memboard.service;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.example.memboard.model.BoardDto;
import com.example.memboard.mapper.BoardMapper;

@Service("com.example.memboard.service.BoardService")
public class BoardService {
   
   @Resource(name="com.example.memboard.mapper.BoardMapper")
   BoardMapper boardMapper;
   
   //최대 글번호
      public Integer numMax() throws Exception{
         return boardMapper.numMax();
      }

      //답글위치 확보 
      public void reStep(BoardDto boardDto) throws Exception{
         boardMapper.reStep(boardDto);
      }

      //글쓰기 , 답글쓰기
      public void insertDao(BoardDto boardDto) throws Exception{
         boardMapper.insertDao(boardDto);
      }

    
      //글 갯수
      public int countDao() throws Exception{
         return boardMapper.countDao();
      }

      //리스트
      public List listDao(Map map) throws Exception{
         return boardMapper.listDao(map);
      }

      //조회수 증가 
      public void readcountDao(int num) throws Exception{
         boardMapper.readcountDao(num);
      }

      //글내용 보기 , 글 수정 
      public BoardDto getBoard(int num) throws Exception{
         return boardMapper.getBoard(num);
      }

      //DB글수정 
      public void updateDao(BoardDto boardDto) throws Exception{
         boardMapper.updateDao(boardDto);
      }
      
      //글 삭제 
      public void deleteDao(int num) throws Exception{
         boardMapper.deleteDao(num);
      }

}