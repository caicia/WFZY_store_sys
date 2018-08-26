package com.WFZY.order.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.order.service.orderService;
import com.WFZY.pojo.Express;
import com.WFZY.pojo.ExpressExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;
import com.WFZY.pojo.Shops;
import com.WFZY.pojo.ShopsExample;
import com.WFZY.pojo.Shopsexpress;
import com.WFZY.pojo.ShopsexpressExample;
import com.WFZY.pojo.Users;
import com.WFZY.pojo.UsersExample;
import com.WFZY.shop.service.ShopService;
import com.mysql.fabric.Response;
import com.show.api.ShowApiRequest;

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
	
	public String userList(int userid){
		UsersExample usersExample = new UsersExample();
		UsersExample.Criteria userCriteria = usersExample.createCriteria();
		userCriteria.andUseridEqualTo(userid);
		List<Users> i = shopservice.getUserID(usersExample);
		return i.get(0).getUsername();
	}
	
	@RequestMapping("/shop/showNotExpressOrderList.action")
	public ModelAndView showOrderList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andOrderstatusEqualTo((byte)-2);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		for(int i=0;i<order.size();i++)
		{
			String userName = userList(order.get(i).getUserid());
			order.get(i).setusername(userName);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showExpressingOrderList.action")
	public ModelAndView showExpressingOrderList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andExpressnoNotEqualTo("");
		orderCriteria.andOrderstatusEqualTo((byte)1);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		
		for(int i=0;i<order.size();i++)
		{
			String userName = userList(order.get(i).getUserid());
			order.get(i).setusername(userName);
		}
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showExpressingOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showExpressedOrderList.action")
	public ModelAndView showExpressedOrderList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andOrderstatusEqualTo((byte)2);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		
		for(int i=0;i<order.size();i++)
		{
			String userName = userList(order.get(i).getUserid());
			order.get(i).setusername(userName);
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showExpressedOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showOrderWLList.action")
	public ModelAndView showOrderWLList(HttpServletRequest request)
	{
		int orderid = Integer.valueOf(request.getParameter("orderid"));
		System.out.println(orderid);
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andOrderidEqualTo(orderid);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		System.out.println(order.get(0).getOrderno());
		
			String userName = userList(order.get(0).getUserid());
			order.get(0).setusername(userName);
			
			ExpressExample expressExample = new ExpressExample();
			ExpressExample.Criteria expressCriteria =  expressExample.createCriteria();
			expressCriteria.andExpressidEqualTo(order.get(0).getExpressid());
			List<Express> express = orderService.selectExpress(expressExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.addObject("expressName" , express.get(0).getExpressname());
		modelAndView.setViewName("/orderDeliveryPage");
		return modelAndView;
	}
	
	@RequestMapping("/insertOrderExpress.action")
	@ResponseBody
	public String insertOrderExpress(@RequestBody Orders orders) {

		orders.setOrderstatus((byte)1);
		int flag = orderService.updataExpress(orders);
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/shop/showWLList.action")
	public ModelAndView showWLList(HttpServletRequest request)
	{
		String com = request.getParameter("com");
		String no = request.getParameter("nu");
		System.out.println(com);
		ExpressExample expressExample = new ExpressExample();
		ExpressExample.Criteria expressCriteria =  expressExample.createCriteria();
		expressCriteria.andExpressidEqualTo(Integer.valueOf(com));
		List<Express> express = orderService.selectExpress(expressExample);
		System.out.println(com+"     "+no);
		String res=new ShowApiRequest("http://route.showapi.com/64-19","73182","8124bc932b74449eaba24a70a9d1965c")
				.addTextPara("com",express.get(0).getExpresscode())
				.addTextPara("nu",no)
			  .post();
		
		
		
		
		JSONObject jsonarray = new JSONObject(res);
		JSONArray detailsRes = jsonarray.getJSONObject("showapi_res_body").getJSONArray("data");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("res", jsonarray);
		modelAndView.addObject("detailsRes",detailsRes);
		modelAndView.addObject("length", detailsRes.length());
		modelAndView.setViewName("/showWL");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showDetailsPage.action")
	public ModelAndView showDetailsPage(HttpServletRequest request)
	{
		int orderid = Integer.valueOf(request.getParameter("orderid"));
		System.out.println(orderid);
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andOrderidEqualTo(orderid);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		System.out.println(order.get(0).getOrderno());
		
			String userName = userList(order.get(0).getUserid());
			order.get(0).setusername(userName);
			
			ExpressExample expressExample = new ExpressExample();
			ExpressExample.Criteria expressCriteria =  expressExample.createCriteria();
			expressCriteria.andExpressidEqualTo(order.get(0).getExpressid());
			List<Express> express = orderService.selectExpress(expressExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.addObject("expressName" , express.get(0).getExpressname());
		modelAndView.setViewName("/orderDetailsPage");
		return modelAndView;
	}
}
