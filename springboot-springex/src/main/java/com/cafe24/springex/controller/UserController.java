package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @RequestMapping
 * type + method
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	// @GetMapping("/join")과 완전히 동일
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	// overload
	@RequestMapping(value = {"/join", "/j"}, method = RequestMethod.POST)
	// @PostMapping({"/join", "/j"})과 완전히 동일
	// @ModelAttribute: 모델에 객체 넣어줌
	public String join(@ModelAttribute UserVo userVo) {
		if(!valid(userVo)) {
			return "/WEB-INF/views/join.jsp";
		}
		System.out.println(userVo);
		return "redirect:/hello";
	}
	
	private boolean valid(UserVo userVo) {
		return false;
	}
}
