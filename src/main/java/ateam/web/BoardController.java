package ateam.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ateam.dto.BoardDTO;
import ateam.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/notice.do")
	public String noticeView(Model model) {

		List<BoardDTO> board = boardService.boardList();
		model.addAttribute("notice",board);
		return "/notice";
	}

}
