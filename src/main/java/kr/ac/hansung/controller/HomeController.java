package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	// http://localhost:8080/helloSpringMVC/ �� ������ �ȴ�(������Ʈ �Ӽ����� ���ؽ�Ʈ ��Ʈ�� ���������Ƿ�)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(){
		
		return "home"; // view's logical name
	}
	
}