package com.cafe24.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	// FORWARDING
	
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("email", "ydhwa_18@naver.com");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	
	@RequestMapping("/hello3")	// 모델 직접 받아서 세팅함
	public String hello3(Model model) {
		model.addAttribute("email", "ydhwa_18@gmail.com");
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello4")
//	@PostMapping POST 요청일 때만 실행. spring 4점대에 등장
	public String hello4(Model model,
//			@RequestParam(value = "e", required = true) String email,
			@RequestParam("email") String email,
			@RequestParam String name /* 어노테이션에 value 생략 시 변수 이름으로 request parameter name */) {
		System.out.println(name);
		model.addAttribute("email", email);
		return "/WEB-INF/views/hello.jsp";
	}
	
	/* 기술이 침투했기 때문에 비추천 */
	@RequestMapping("/hello5")
	public String hello5(Model model, HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		System.out.println(name);
		model.addAttribute("email", email);
		return "/WEB-INF/views/hello.jsp";
	}
	
	// ------------------------------------------
}
