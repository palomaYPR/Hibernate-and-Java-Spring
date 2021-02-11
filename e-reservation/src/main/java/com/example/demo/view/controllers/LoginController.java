package com.example.demo.view.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Custom login controller
 * @author paloma
 *
 */

@Controller
@RequestMapping("app")
public class LoginController {
	
	@GetMapping(value = {"/login", "/"})
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		String errorMessage = "Access denied";
		mav.addObject("errorMsg", errorMessage);
		mav.setViewName("Login");
		return mav;
	}	
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
}
