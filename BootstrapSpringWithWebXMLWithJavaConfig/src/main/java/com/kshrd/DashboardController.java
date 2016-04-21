package com.kshrd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	@RequestMapping(value="/web/dashboard", method=RequestMethod.GET)
	public String dashboard(){
		return "/WEB-INF/dashboard.jsp";
	}
}
