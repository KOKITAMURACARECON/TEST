package com.example.demo.controller.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * HelloWorld表示用コントローラー
 */
@Controller
public class demoController {

	// demoにアクセスすると実行されるようにマッピング
	@RequestMapping(value = "/demo")
	private String hello() {
		// index.htmlへ遷移
		return "HelloWorld/index.html";
	}
}