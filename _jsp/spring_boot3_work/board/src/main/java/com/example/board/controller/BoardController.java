package com.example.board.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.board.model.BoardVO;
import com.example.board.service.BoardService;

@Controller
public class BoardController {
	@Resource(name="com.example.board.service.BoardService")
	BoardService boardService; //변수
	
	//글쓰기 폼
	@RequestMapping("/insertForm")
	private String boardInsertForm() {
		return "insertForm"; //WEB-INF/views/insertForm.jsp
	}
	
	//글쓰기
	@RequestMapping("/insertPro")
	private String boardInsertPro(@ModelAttribute("boardVO") BoardVO boardVO,
			HttpServletRequest request) throws Exception {
		boardService.boardInsertService(boardVO);
		return "redirect:/list";
	}
	
	//글목록=리스트
	@RequestMapping("/list")
	private String boardList(Model model) throws Exception{
		model.addAttribute("list",boardService.boardListService());
		return "list"; //WEB-INF/views/list.jsp
	}
	
	//글내용보기=상세보기
	@RequestMapping("/detail/{bno}")
	private String boardDetail(@PathVariable int bno,Model model) throws Exception {
		model.addAttribute("detail",boardService.boardDetailService(bno));
		return "detail"; //WEB-INF/views/detail.jsp 
	}
	
	//글수정폼
	@RequestMapping("/update/{bno}")
	private String boardUpdateForm(@PathVariable int bno,Model model) throws Exception{
		model.addAttribute("boardVO",boardService.boardDetailService(bno));
		return "updateForm"; //WEB-INF/views/updateForm.jsp 
	}
	
	//글수정
	@RequestMapping(value="/updatePro",method=RequestMethod.POST)
	private String boardUpdatePro(@ModelAttribute("boardVO1") BoardVO boardVO1,
			HttpServletRequest request) throws Exception{
		String bno=request.getParameter("bno");
		boardVO1.setBno(Integer.parseInt(bno));
		boardService.boardUpdateService(boardVO1);
		return "redirect:/list";
	}
	
	//글삭제
	@RequestMapping("/delete/{bno}")
	private String boardDelete(@PathVariable int bno) throws Exception{
		boardService.boardDeleteService(bno);
		return "redirect:/list";
	}
}//class-end
