package com.Hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld{
	@RequestMapping("/")
	public String show() {
		return "hello amar how are you.";
	}
}
