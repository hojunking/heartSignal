package com.hs.meetme.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hs.meetme.useraccess.domain.AccountVO;

@Controller
public class BuildController {
	
	@GetMapping("/vue")
	public String vueIndex() {
		return "/index";
	}
	
	@GetMapping("/createCourse")
	public String createCourse(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AccountVO user = (AccountVO) session.getAttribute("userSession");
		
		if(user == null) {
			return "";
		}
		
		return "/index";
	}
	@GetMapping("/coupleCreateCourse")
	public String coupleCreateCourse(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AccountVO user = (AccountVO) session.getAttribute("userSession");
		String coupleId = user.getCoupleStatus();
		
		// 조건을 좀 더 확인 해야함.
		if(user == null || !coupleId.equals("y")) {
			return "";
		}
		return "/index";
	}
	
	@GetMapping("/test")
	public String vueTest() {
		return "test";
	}
}
