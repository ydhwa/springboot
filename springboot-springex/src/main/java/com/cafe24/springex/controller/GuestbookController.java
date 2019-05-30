package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping
 * type 단독 매핑
 */

@RequestMapping("/guestbook/*")
@Controller
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	// /guestbook/[method name] 입력하면 나온다. 그래도 명시적으로 매핑해주는 게 좋다.
	public String list() {
		return "GuestbookController: list";
	}

}
