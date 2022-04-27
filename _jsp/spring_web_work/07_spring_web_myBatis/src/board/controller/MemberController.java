package board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.naming.NamingException;

import javax.servlet.http.HttpServletRequest;


import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired; //setter 메서드 대신 사용
import org.springframework.stereotype.Controller;//@Controller

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.MemberDto;

@Controller
public class MemberController {
   
   @Autowired
   SqlSessionTemplate sst; //변수 setter 메서드 넣지 않아도 자동 setter
   
   //회원가입 폼
   @RequestMapping("/insertForm.do")
   public String insertForm(){
      return "/member/insertForm";//insertForm.jsp
   }
   //id중복체크
   @RequestMapping(value="idCheck.do", method=RequestMethod.POST)
   public ModelAndView idCheck(String id){
      
      int x=-1; //변수
      SqlSession session=sst.getSqlSessionFactory().openSession();
      MemberDto memberDto=session.selectOne("member.selectOne",id);
      session.close();
      
      if(memberDto==null){
         x=1; //사용가능한 id
      }
      
      return new ModelAndView("/member/idCheck","x",x);
      //                  idCheck.jsp
   }
   //회원가입
   @RequestMapping(value="insertPro.do",method=RequestMethod.POST)
   public String memberInsert(@ModelAttribute("memberDto") MemberDto memberDto){
      SqlSession session=sst.getSqlSessionFactory().openSession();
      session.insert("member.insertMember",memberDto);
      session.close();
      
      return "/member/loginForm"; //뷰 리턴
   }   
      //로그인
   @RequestMapping("loginForm.do")
   public String loginForm(){
      return "/member/loginForm";
   
   }
   
   @RequestMapping(value="/loginPro.do",method=RequestMethod.POST)
   public ModelAndView memLogin(String id, String pw){
      SqlSession session=sst.getSqlSessionFactory().openSession();
      HashMap<String,String> map=new HashMap<String,String>();
      
      map.put("id", id);
      map.put("pw", pw);
      
      MemberDto memberDto=session.selectOne("member.selectLogin", map);
      session.close();
      
      if(memberDto == null){
         return new ModelAndView("/member/loginForm","msg","로그인 실패");
      }
      return new ModelAndView("/member/loginSuccess","memberDto",memberDto);
   }
   
      //내 정보 수정폼 
      @RequestMapping("memberUpdateForm.do")
      public ModelAndView updateForm(String id){
         SqlSession session=sst.getSqlSessionFactory().openSession();
         MemberDto memberDto=session.selectOne("member.selectOne",id);
         session.close();
         String email=memberDto.getEmail();
         int index=email.indexOf("@");
         String email1=email.substring(0,index); //hong
         String email2=email.substring(index); //@daum.net
         String email3=email.substring(index+1); //daum.net
         
         String tel=memberDto.getTel(); // 01022223333
         String tel1=tel.substring(0,3); //010
         String tel2=tel.substring(3,7); //2222
         String tel3=tel.substring(7);  //3333
         
         ModelAndView mv=new ModelAndView();
         mv.setViewName("/member/updateForm"); //뷰=jsp
         mv.addObject("memberDto",memberDto); //JSP에서 사용할 데이터
         mv.addObject("email1",email1);
         mv.addObject("email2",email2); //value
         mv.addObject("email3",email3); //text
         mv.addObject("tel1",tel1);
         mv.addObject("tel2",tel2);
         mv.addObject("tel3",tel3);
         return mv;
      }

   
   //DB 수정
   @RequestMapping("memberUpdatePro.do")
   public String updateMem(@ModelAttribute("memberDto") MemberDto memberDto){
	   SqlSession session=sst.getSqlSessionFactory().openSession();
	   session.update("member.memberUpdate",memberDto);
	   session.commit();
	   session.close();
	   return "redirect:list.do"; //DB가서 확인
   }
   
   //로그아웃
   @RequestMapping("/logOut.do")
   public String userOut(){
	   return "/member/logOut"; //logOut.jsp
   }
   
   //회원탈퇴 폼
   @RequestMapping("/memberDeleteForm.do")
   public ModelAndView deleteForm(String id){
      SqlSession session=sst.getSqlSessionFactory().openSession();
      MemberDto memberDto=session.selectOne("member.selectOne",id);
      session.close();
      return new ModelAndView("/member/memberDeleteForm","memberDto",memberDto);
   }
   
   //회원탈퇴 
   @RequestMapping(value="/memberDeletePro.do",method=RequestMethod.POST)
   public ModelAndView memberDeletePro(String id,String pw){
	   SqlSession session=sst.getSqlSessionFactory().openSession();
	   HashMap<String,String> map=new HashMap<String, String>();
	   map.put("id", id);
	   map.put("pw", pw);
	   session.delete("member.memberDelete",map);
	   session.commit();
       session.close();
       return new ModelAndView("/member/loginSuccess"); 
   }
}//class-end