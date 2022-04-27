package co.kr.test05memboard;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model; // request.setAttribute("key", value)
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;//***

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.apache.ibatis.session.SqlSession; // MyBatis 사용
import model.member.MemberDto;

@RequestMapping("/member")
@Controller
public class MemberController {
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/insertForm.do") //요청매핑
	public String insertForm() {
		return "/member/insertForm"; //insertForm.jsp 뷰리턴
	}
	
	//ID중복체크
	@RequestMapping(value="idCheck.do",method=RequestMethod.POST)
	public String idCheck(Model model,String id) {
		int x=-1;
		MemberDto memberDto=sqlSession.selectOne("member.selectOne",id);
		if(memberDto==null) {
			x=1; //사용가능한 id
		}
		model.addAttribute("x",x);
		return "/member/idCheck"; //idCheck.jsp
	}
	
	//회원가입
	@RequestMapping(value="insertPro.do",method=RequestMethod.POST)
	public String insertPro(MemberDto memberDto) {
		sqlSession.insert("member.insertMember",memberDto);
		return "/member/loginForm"; //loginForm.jsp 뷰리턴
	}
	
	//로그인 폼
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "/member/loginForm"; //loginForm.jsp 뷰 리턴
	}
	
	//로그인
	@RequestMapping(value="loginPro.do",method=RequestMethod.POST)
	public String loginPro(String id,String pw,Model model) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("id",id);
		map.put("pw",pw);
		MemberDto memberDto=sqlSession.selectOne("member.selectLogin",map);
		if(memberDto==null) { //로그인 실패
			model.addAttribute("msg","존재하지 않는 id입니다");
			return "/member/loginForm"; //loginForm.jsp
		}
		model.addAttribute("memberDto",memberDto);
		return "/member/loginSuccess";
	}
	
	//로그아웃
	@RequestMapping("/logOut.do")
	public String userOut() {
		return "/member/logOut"; //logOut.jsp 뷰 리턴
	}
	
	//내정보수정폼
	@RequestMapping("memberUpdateForm.do")
	public String updateForm(String id,Model model) {
		MemberDto memberDto=sqlSession.selectOne("member.selectOne",id);
		
		//email
		String email=memberDto.getEmail(); //ppp@daum.net
		int index=email.indexOf("@");
		System.out.printf("email:",email);
		System.out.printf("index:",index);
		String email1=email.substring(0,index); //ppp
		String email2=email.substring(index); //@daum.net
		String email3=email.substring(index+1); //daum.net
		
		//tel
		String tel=memberDto.getTel(); //01022223333
		String tel1=tel.substring(0,3); //010
		String tel2=tel.substring(3,7); //2222
		String tel3=tel.substring(7); //3333
		
		model.addAttribute("email1",email1);
		model.addAttribute("email2",email2);
		model.addAttribute("email3",email3);
		model.addAttribute("tel1",tel1);
		model.addAttribute("tel2",tel2);
		model.addAttribute("tel3",tel3);
		model.addAttribute("memberDto",memberDto);
		return "/member/updateForm"; //updateForm.jsp 뷰리턴
	}
	
	//DB내용수정
	@RequestMapping(value="memberUpdatePro.do",method=RequestMethod.POST)
	public String memberUpdatePro(MemberDto memberDto) {
		sqlSession.update("member.memberUpdate",memberDto);
		return "/member/loginForm"; //loginForm.jsp
	}
	
	//탈퇴폼
	@RequestMapping("/memberDeleteForm.do")
	public String memberDeleteForm(Model model,String id) {
		MemberDto memberDto=sqlSession.selectOne("member.selectOne",id);
		model.addAttribute("memberDto",memberDto);
		return "/member/memberDeleteForm"; //memberDeleteForm.jsp 뷰리턴
	}
	
	//탈퇴 : DB 자료 삭제
	@RequestMapping(value="/memberDeletePro.do",method=RequestMethod.POST)
	public String memberDeletePro(Model model,String id,String pw) {
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("id",id);
		map.put("pw",pw);
		sqlSession.delete("member.memberDelete",map);
		return "/member/loginForm"; //loginForm.jsp 뷰 리턴
	}
}
