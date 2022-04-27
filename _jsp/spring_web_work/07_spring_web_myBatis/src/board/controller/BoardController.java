package board.controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
//import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired; //setter메서드 대신 사용
import org.springframework.stereotype.Controller; //@Controller
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Propagation;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardDto;

//컨트롤러=Action
@Controller
//@RequestMapping("/board")
public class BoardController {
	@Autowired
	SqlSessionTemplate sst; //변수

	@RequestMapping("list.do")
	public ModelAndView listAll(HttpServletRequest request) throws NamingException,IOException{
		String keyField=request.getParameter("keyField");
		String keyWord=request.getParameter("keyWord");
		//System.out.println("필드:"+keyField);
		//System.out.println("검색어:"+keyWord);
		SqlSession session=sst.getSqlSessionFactory().openSession();
		List list=null;
		if(keyWord==null || keyWord.equals(null) || keyWord.equals("")){
			list=session.selectList("board.selectAll");
			//                    네임스페이스.id (board.xml)
		}else{ //검색
			Map<String,Object> map=new HashMap<String,Object>(); //DTO대신 사용
			map.put("keyField", keyField);
			map.put("keyWord", keyWord);
			list=session.selectList("board.searchAll",map);
		}

		session.close();
		return new ModelAndView("/board/list","list",list);
		//                     list.jsp(뷰),JSP에서 사용할 데이터
	}//listAll-end
	
	//insert하기 위해서
	//입력폼
	@RequestMapping("writeForm.do")
	//@RequestMapping(value="writeForm.do",method=RequestMethod.GET)
	public String boardWriteForm(){
		return "/board/writeForm"; //뷰리턴 writeForm.jsp
	}
	//DB에 insert 
	@RequestMapping(value="writePro.do",method=RequestMethod.POST)
	public String boardWritePro(@ModelAttribute("boardDto") BoardDto boardDto) throws NamingException,IOException{
		SqlSession session=sst.getSqlSessionFactory().openSession();
		session.insert("board.insertBoard",boardDto);
		session.commit();
		session.close();
		return "redirect:list.do"; //response.sendRedirect("list.jsp")
	}//boardWritePro-end
	
	//글내용보기
	@RequestMapping("content.do")
	public ModelAndView getOneBoard(int num){
		SqlSession session=sst.getSqlSessionFactory().openSession();
		session.update("board.readCountBoard",num); //조회수 증가
		BoardDto boardDto=(BoardDto)session.selectOne("board.selectOne",num); //글내용보기
		session.close();
		return new ModelAndView("/board/content","boardDto",boardDto);
	}
	
	//글 수정 폼
	@RequestMapping(value="editForm.do",method=RequestMethod.GET)
	public ModelAndView editForm(int num){
		SqlSession session=sst.getSqlSessionFactory().openSession();
		BoardDto boardDto=(BoardDto)session.selectOne("board.selectOne",num);
		return new ModelAndView("/board/editForm","boardDto",boardDto);
	}
	
	//DB글수정
	@RequestMapping(value="editPro.do",method=RequestMethod.POST)
	public String updateBoard(@ModelAttribute("boardDto") BoardDto boardDto){
		SqlSession session=sst.getSqlSessionFactory().openSession();
		session.update("board.updateBoard",boardDto); //글수정
		session.commit();
		session.close();
		return "redirect:list.do";
	}
	
	//글삭제
	@RequestMapping("delete.do")
	public String deleteBoard(int num){
		SqlSession session=sst.getSqlSessionFactory().openSession();
		session.delete("board.deleteBoard",num); //글삭제
		session.commit();
		session.close();
		return "redirect:list.do";
	}
}//class-end
