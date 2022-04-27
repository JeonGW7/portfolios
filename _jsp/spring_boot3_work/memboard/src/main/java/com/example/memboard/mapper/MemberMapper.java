package com.example.memboard.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper; //Mapper = 연결
import org.springframework.stereotype.Repository; //Repository 저장소

import com.example.memboard.model.MemberDto;

//MemberMapper.java 인터페이스가 MemberMapper.xml하고  매핑을 한다는 뜻이다
//MemberMapper.java 인터페이스 메서드이름이 MemberMapper.xml의 id명이 된다
//@Repository : 해당 클래스가 데이터베이스에 접근하는 클래스임을 명시
//@Repository("com.example.member.mapper.MemberMapper")
@Repository("com.example.memboard.mapper.MemberMapper")
@Mapper
public interface MemberMapper {
	//id중복체크, 내정보 수정
    public MemberDto selectOne(String id) throws Exception;
    
    //회원가입
    public void insertMember(MemberDto memberDto) throws Exception;
    
    //로그인 
    public MemberDto selectLogin(Map map) throws Exception;
    
    //DB에 내정보 수정
    public void memberUpdate(MemberDto memberDTO) throws Exception;
    
    //탈퇴
    //memberDelete
    public void memberDelete(String id) throws Exception;
}