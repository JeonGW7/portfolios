package co.kr.test02board;
import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.servlet.http.HttpServletRequest;
import java.util.*; //Map,List
import model.board.BoardDto;

@Controller
public class BoardController {
	//추가
	@Autowired
	private SqlSession sqlSession; //myBatis사용, setter자동
	
	//입력폼
	@RequestMapping("/insertForm.do")
	public String insertF() {
		return "/board/insertForm"; //뷰 리턴  insertForm.jsp
	}
	
	//insert
	@RequestMapping(value="/insertPro.do",method=RequestMethod.POST)
	public String insertPP(@ModelAttribute("boardDto") BoardDto boardDto,HttpServletRequest request) {
		boardDto.setIp(request.getRemoteAddr()); //ip구하여 setter작업
		sqlSession.insert("board.insertBoard",boardDto);
		
		return "redirect:list.do";
	}
	
	//list
	@RequestMapping("/list.do")
	public ModelAndView listdo() {
		List<HashMap<String,String>> list=sqlSession.selectList("board.selectAll");
		ModelAndView mv=new ModelAndView("/board/list","list",list);
		//                                   뷰이름,JSP에서 사용할 데이터
		return mv; //뷰리턴
	}
	
	//글내용 보기
	@RequestMapping("content.do")
	public ModelAndView contentP(int num) {
		sqlSession.update("board.readcountBoard",num); //조회수 증가
		BoardDto boardDto=sqlSession.selectOne("board.selectOne",num);
		return new ModelAndView("/board/content","boardDto",boardDto);
		//                                 뷰
	}
	
	//글수정 폼
	@RequestMapping("editForm.do")
	public ModelAndView editF(int num) {
		BoardDto boardDto=sqlSession.selectOne("board.selectOne",num);
		return new ModelAndView("/board/editForm","boardDto",boardDto);
	}
	
	//DB글수정
	@RequestMapping(value="editPro.do",method=RequestMethod.POST)
	public String editPro(@ModelAttribute("boardDto") BoardDto boardDto) {
		sqlSession.update("board.editBoard",boardDto);
		return "redirect:list.do";
	}
	
	//DB글삭제
	@RequestMapping("deletePro.do")
	public String deletePro(int num) {
		sqlSession.delete("board.deleteBoard",num);
		return "redirect:list.do";
	}
}//class-end
