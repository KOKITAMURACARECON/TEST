package com.example.demo.Fortune;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {

	@RequestMapping(value="/fortune")
	public String start() {
		double fn = Math.random();
		if (fn >= 0.7) {
			return "Fortune/greatFortune.html";
		} else if (fn >= 0.4) {
			return "Fortune/middleFortune.html";
		} else if (fn >= 0.1) {
			return "Fortune/smallFortune";
		} else {
			return "Fortune/misFortune.html";
		}
	}

}
