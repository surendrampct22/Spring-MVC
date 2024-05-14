package com.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/employee-controller")
public class EmployeeController {
	
	@RequestMapping(value = "/hello" ,method = RequestMethod.GET )
	@ResponseBody
	public String getValue() {
	System.out.println("Hello");
		return "Hi";
	}

	
}
