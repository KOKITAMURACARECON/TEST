package com.example.demo.controller.Register;

import lombok.Getter;
import lombok.Setter;

// ゲッター、セッターを設定
@Getter
@Setter
// 各入力情報を取得する
public class RBean {
	private String name;
	private String age;
	private String tell;
	private String address;
}