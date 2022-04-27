package co.kr.test04oracle;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model; // request.setAttribute("key", value) Model : JSP에서 사용할 데이터
import org.springframework.web.servlet.ModelAndView; //Model, View

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;//Map,List

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.apache.ibatis.session.SqlSession; // MyBatis 사용
import model.board.BoardDto;

@Controller
public class BoardController {
	@Autowired
	SqlSession sqlSession; // 자동 setter작업

	// 입력 폼으로 이동, writeForm
	@RequestMapping("writeForm.do")
	public String writeForm() {
		return "/board/writeForm"; // 뷰 리턴 writeForm.jsp
	}//writeForm()-end

	// DB insert, 입력(글쓰기)
	@RequestMapping(value = "writePro.do", method = RequestMethod.POST)
	public String writePro(@ModelAttribute("boardDto") BoardDto boardDto) {
		//최대 글번호 얻기 안한다
		sqlSession.insert("board.writeDao", boardDto);
		return "redirect:list.do";
	}//writePro()-end

	//리스트
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<BoardDto> list = sqlSession.selectList("board.listDao");
		model.addAttribute("list", list); // JSP에서 사용할 데이터
		return "/board/list"; // 뷰 리턴 list.jsp
	}//list()-end

	//조회수 증가
	//글내용 보기
	@RequestMapping("content.do")
	public String contentView(Model model,HttpServletRequest request) {
		//조회수 증가
		sqlSession.update("board.upHit",request.getParameter("bId"));

		//글내용보기
		BoardDto boardDto=sqlSession.selectOne("board.contentView",request.getParameter("bId"));
		model.addAttribute("boardDto",boardDto);
		return "/board/content"; //content.jsp 뷰리턴
	}

	//DB글수정
	@RequestMapping(value="modifyPro.do",method=RequestMethod.POST)
	public String modify(@ModelAttribute("boardDto") BoardDto boardDto) {
		sqlSession.update("board.modifyDao",boardDto); //글수정
		return "redirect:list.do";
	}

	// 글삭제
	@RequestMapping("delete.do")
	public String delePro(HttpServletRequest request) {
		sqlSession.delete("board.deleteDao",request.getParameter("bId"));
		return "redirect:list.do";
	}

	// 답글 쓰기 위해 화면에 보여줄 자료
	@RequestMapping("replyView.do")
	public String replyView(Model model,HttpServletRequest request) {
		//content.jsp에서 보낸것 받기
		BoardDto boardDto=sqlSession.selectOne("board.replyView",request.getParameter("bId"));
		model.addAttribute("boardDto",boardDto); //JSP사용할 데이터
		return "/board/replyView"; //replyView.jsp 뷰 리턴
	}

	//답글 위치 확보
	//답글 쓰기
	@RequestMapping(value="/replyPro.do",method=RequestMethod.POST)
	public String replyPro(@ModelAttribute("boardDto") BoardDto boardDto,HttpServletRequest request) {
		//답글 위치 확보
		String bGroup=request.getParameter("bGroup");
		String bStep=request.getParameter("bStep");

		Map<String,String> map=new HashMap<String,String>();
		map.put("bGroup", bGroup);
		map.put("bStep", bStep);

		sqlSession.update("board.replyShape",map); 

		//답글쓰기
		sqlSession.insert("board.replyDao",boardDto);
		return "redirect:list.do";
	}
}//class-end
