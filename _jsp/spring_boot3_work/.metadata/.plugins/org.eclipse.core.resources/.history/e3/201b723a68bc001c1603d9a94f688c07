package com.example.memboard.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 
import com.example.memboard.model.MemberDto;
import com.example.memboard.mapper.MemberMapper;
 
@Service("com.example.memboard.service.MemberService")
public class MemberService {

   @Resource(name="com.example.memboard.mapper.MemberMapper")
   MemberMapper memberMapper;

   //id중복체크, 내정보 수정
   public MemberDto getMember(String id) throws Exception{
      return memberMapper.selectOne(id);
   }
   
   //회원가입
   public void insertMember(MemberDto memberDto) throws Exception{
      memberMapper.insertMember(memberDto);
   }
   
   //로그인 
   public MemberDto loginPro(Map map) throws Exception{
      return memberMapper.selectLogin(map);
   }
   
   //DB에 내정보 수정
   public void memberUpdate(MemberDto memberDto) throws Exception{
      memberMapper.memberUpdate(memberDto);
   }
   
   //탈퇴
   public void memberDelete(String id) throws Exception{
      memberMapper.memberDelete(id);
   }
   
}//class-end