package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	// http://localhost:8080/helloSpringMVC/ 가 매핑이 된다(프로젝트 속성에서 컨텍스트 루트로 설정했으므로)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(){
		
		return "home"; // view's logical name
	}
	
}
