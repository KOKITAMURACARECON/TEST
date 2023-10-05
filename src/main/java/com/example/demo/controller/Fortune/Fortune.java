package com.example.demo.controller.Fortune;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 占い用コントローラー
 */
@Controller
public class Fortune {

	// fotuneにアクセスすると実行されるようにマッピング
	@RequestMapping(value = "/fortune")
	public String start() {
		// fnにランダムな実数を設定
		double fn = Math.random();
		if (fn >= 0.7) {
			// fnが0.7以上の場合greatFortune.htmlへ遷移
			return "Fortune/greatFortune.html";
		} else if (fn >= 0.4) {
			// fnが0.4以上の場合middleFortune.htmlへ遷移
			return "Fortune/middleFortune.html";
		} else if (fn >= 0.1) {
			// fnが0.1以上の場合smallFortune.htmlへ遷移
			return "Fortune/smallFortune.html";
		} else {
			// それ以外の場合misFortune.htmlへ遷移
			return "Fortune/misFortune.html";
		}
	}

}
