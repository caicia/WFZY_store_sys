package com.WFZY.order.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.order.service.orderService;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;
import com.WFZY.pojo.Shops;
import com.WFZY.pojo.ShopsExample;
import com.WFZY.pojo.Users;
import com.WFZY.shop.service.ShopService;

@Controller
public class orderController {

	@Resource(name = "orderServiceImpl")
	private orderService orderService;
	
	@Resource(name = "ShopServiceImpl")
	private ShopService shopservice;
	
	public List<Shops> shopList(HttpServletRequest request){
		Users users = (Users) request.getSession().getAttribute("loginUser");
		ShopsExample record = new ShopsExample(); 
		ShopsExample.Criteria shopCriteria = record.createCriteria();
		shopCriteria.andUseridEqualTo(Integer.valueOf(users.getUserid()));
		List<Shops> shopList = shopservice.getShopsID(record);
		return shopList;
	}
	
	@RequestMapping("/shop/showNotExpressOrderList.action")
	public ModelAndView showOrderList(HttpServletRequest request)
	{
		List<Shops> shopList = shopList(request);
		
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andExpressnoEqualTo("");
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showExpressingOrderList.action")
	public ModelAndView showExpressingOrderList(HttpServletRequest request)
	{
		List<Shops> shopList = shopList(request);
		
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andExpressnoNotEqualTo("");
		orderCriteria.andIsclosedEqualTo((byte)0);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showExpressingOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showExpressedOrderList.action")
	public ModelAndView showExpressedOrderList(HttpServletRequest request)
	{
		List<Shops> shopList = shopList(request);
		
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andIsclosedEqualTo((byte)1);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showExpressedOrderPage");
		return modelAndView;
	}
	
	
}
