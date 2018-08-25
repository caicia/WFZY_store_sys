package com.WFZY.market.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.market.service.marketService;
import com.WFZY.order.service.orderService;
import com.WFZY.shop.service.ShopService;

@Controller
public class marketController {

	@Resource(name = "marketServiceImpl")
	private marketService marketService;
	
	@RequestMapping("/shop/showMarketList.action")
	public ModelAndView showOrderList()
	{
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/showOrderPage");
		return modelAndView;
	}
	
	
}
