package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping
 * Method 단독 매핑
 */

@Controller
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/board/update")
	public String update(
			// String name
			// @RequestParam String name
			@RequestParam("name") String name	// 이런 표기 방식을 추천
	) {
		System.out.println("---" + name + "---");
		return "BoardController: update()";
	}
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write(
			@RequestParam(value = "n", required = true, defaultValue = "") String name,
			// defaultValue는 자동으로 래핑을 해주므로, 문자열로 적어둔다.
			@RequestParam(value = "age", required = true, defaultValue = "0") int age
	) {
		// 사용자가 파라미터를 지정하지 않으면 디폴트값을 지정해두는 것이 좋다. -> 이후 값 처리
		System.out.println("---" + name + "---" + age);
		return "BoardController: write()";
	}
	
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(
			@PathVariable(value = "no") Long no
//			@PathVariable("no") Long no
		) {
		/*
		 *  http://localhost:8080/springex1/board/view?no=10 보다
		 *  http://localhost:8080/springex1/board/view/10 가 표현 상 더 예쁘지 않나?
		 */
		return "BoardController: view(" + no + ")";
	}
}
