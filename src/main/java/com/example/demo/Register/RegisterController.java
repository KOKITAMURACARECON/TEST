package com.example.demo.Register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping("/")
	public String start() {
		return "register/input.html";
	}

	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute RBean rb, ModelAndView mav) {
		mav.addObject("rb", rb);
		mav.setViewName("register/register.html");
		return mav;
	}
}
