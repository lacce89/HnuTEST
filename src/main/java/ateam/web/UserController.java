package ateam.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ateam.dto.UserDTO;
import ateam.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource(name="txManager")
	PlatformTransactionManager transationManager;
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="/test.do")
	public String psTest(Model model) {
		System.out.println("!@!@!@#!@$!@#!@#!@#");
		UserDTO dto = userService.test();
		
		model.addAttribute("dto", dto);
		
		return "test01";
	}
	
	
}
