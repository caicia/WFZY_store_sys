package com.WFZY.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.pojo.Users;
import com.WFZY.service.loginService;

@Controller
public class loginController {

	@Resource(name = "loginServiceImpl")
	private loginService loginService;
	
	@RequestMapping(value = "/userLogin.action")
	public @ResponseBody String userLogin(HttpServletRequest request, HttpSession session) {
		String loginName = request.getParameter("loginName");
		String loginPwd = request.getParameter("loginPwd");
		System.out.println("登录时：" + loginName + "," + loginPwd);
		int flag = loginService.selectUserLogin(loginName, loginPwd);
		if (flag != 0) {
			Users loginuser = loginService.selectUser(flag);
			
			session.setAttribute("loginUser", loginuser);
			System.out.println(loginuser.getUsertype());
			if(Integer.valueOf(loginuser.getUsertype())==2)
			{
				flag=1;
			}
			else
			{
				flag=-1;
			}
		}
		System.out.println(flag);
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping(value = "/userLoginOut.action")
	public void userLoginOut(HttpServletRequest request, HttpSession session,HttpServletResponse response) throws IOException {
		Users user = (Users) request.getSession().getAttribute("loginUser");
		System.out.println(user.getUsername());
		request.getSession().setAttribute("loginUser", null);
		response.sendRedirect("login.jsp");
		return;
	}
	
	@RequestMapping(value = "/test.action")
	public ModelAndView test()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/house_list");
		return modelAndView;
	}
}
