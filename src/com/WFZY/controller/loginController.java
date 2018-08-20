package com.WFZY.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.WFZY.service.loginService;

@Controller
public class loginController {

	@Resource(name = "loginServiceImpl")
	private loginService loginService;
	
	
}
