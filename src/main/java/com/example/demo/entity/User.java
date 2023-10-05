package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "users")
public class User {

	/**
	 * ID
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * ユーザーID
	 */
	@Column(name = "user_id")
	private String userId;

	/**
	 * 名前
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 年齢
	 */
	@Column(name = "age")
	private String age;

	/**
	 * 電話番号
	 */
	@Column(name = "tell")
	private String phone;

	/**
	 * 住所
	 */
	@Column(name = "address")
	private String address;
}