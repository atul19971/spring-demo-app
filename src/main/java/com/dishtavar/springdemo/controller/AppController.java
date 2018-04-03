package com.dishtavar.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("hello");
		return model;
	}
}
