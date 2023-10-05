package com.example.demo.controller.Register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * お問い合わせフォーム用コントローラー
 */
@Controller
public class RegisterController {
	// スラッシュにアクセスすると実行されるようにマッピング
	@RequestMapping("/")
	public String start() {
		// input.htmlへ遷移
		return "register/input.html";
	}

	// registerにアクセスすると実行されるようにマッピング
	@RequestMapping("/register")
	// @ModelAttributeを使用してRBeanにバインド ModelAndViewはコントローラーからviewへデータを渡すため
	public ModelAndView register(@ModelAttribute RBean rb, ModelAndView mav) {
		// rbに取得したデータを設定
		mav.addObject("rb", rb);
		// register.htmlへ遷移
		mav.setViewName("register/register.html");
		return mav;
	}
}
