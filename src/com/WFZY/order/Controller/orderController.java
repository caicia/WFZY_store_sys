package com.WFZY.order.Controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import com.WFZY.pojo.GoodsExample;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodscomment;
import com.WFZY.pojo.GoodscommentExample;
import com.WFZY.pojo.GoodscommentWithBLOBs;
import com.WFZY.pojo.Orderrefunds;
import com.WFZY.pojo.OrderrefundsExample;
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
	
	@RequestMapping("/CancleOrder.action")
	@ResponseBody
	public String CancleOrder(@RequestBody Orderrefunds orderrefunds) {
		int flag = orderService.Cancleorder(orderrefunds);
		return "{\"flag\":" + flag + "}";
	}
	
	
	@RequestMapping("/shop/CancleList.action")
	public ModelAndView CancleList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		List<String> orderstatus = new ArrayList<String>();
		List<String> orderno = new ArrayList<String>();
		List<String> username = new ArrayList<String>();
		List<String> goodsname = new ArrayList<String>();
		
		OrderrefundsExample orderrefundsExample = new OrderrefundsExample();
		OrderrefundsExample.Criteria orderrefundsCriteria = orderrefundsExample.createCriteria();
		orderrefundsCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderrefundsCriteria.andRefundstatusEqualTo((byte)-1);
		List<Orderrefunds> orderrefunds = orderService.selectCanclegoods(orderrefundsExample);
		
		for(int i=0;i<orderrefunds.size();i++)
		{
			OrdersExample ordersExample = new OrdersExample();
			OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
			orderCriteria.andOrderidEqualTo(orderrefunds.get(i).getOrderid());
			
			List<Orders> order = orderService.selectOrder(ordersExample);
			orderstatus.add(String.valueOf(order.get(0).getOrderstatus()));
			orderno.add(order.get(0).getOrderno());
			username.add(userList(order.get(0).getUserid()));
			goodsname.add(order.get(0).getGoodsname());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", orderrefunds);
		modelAndView.addObject("orderstatus", orderstatus);
		modelAndView.addObject("orderno", orderno);
		modelAndView.addObject("username", username);
		modelAndView.addObject("goodsname", goodsname);
		modelAndView.setViewName("/CancleOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/CancleOrderList.action")
	public ModelAndView CancleOrderList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		List<String> orderstatus = new ArrayList<String>();
		List<String> orderno = new ArrayList<String>();
		List<String> username = new ArrayList<String>();
		List<String> goodsname = new ArrayList<String>();
		List<String> expressno = new ArrayList<String>();
		List<String> expressid = new ArrayList<String>();
		List<String> deliverytime = new ArrayList<String>();
		
		
		OrderrefundsExample orderrefundsExample = new OrderrefundsExample();
		OrderrefundsExample.Criteria orderrefundsCriteria = orderrefundsExample.createCriteria();
		orderrefundsCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderrefundsCriteria.andRefundstatusEqualTo((byte)0);
		List<Orderrefunds> orderrefunds = orderService.selectCanclegoods(orderrefundsExample);
		
		for(int i=0;i<orderrefunds.size();i++)
		{
			OrdersExample ordersExample = new OrdersExample();
			OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
			orderCriteria.andOrderidEqualTo(orderrefunds.get(i).getOrderid());
			
			List<Orders> order = orderService.selectOrder(ordersExample);
			orderstatus.add(String.valueOf(order.get(0).getOrderstatus()));
			orderno.add(order.get(0).getOrderno());
			username.add(userList(order.get(0).getUserid()));
			goodsname.add(order.get(0).getGoodsname());
			expressno.add(order.get(0).getExpressno());
			expressid.add(String.valueOf(order.get(0).getExpressid()));
			deliverytime.add(String.valueOf(order.get(0).getDeliverytime()));
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", orderrefunds);
		modelAndView.addObject("orderstatus", orderstatus);
		modelAndView.addObject("orderno", orderno);
		modelAndView.addObject("username", username);
		modelAndView.addObject("goodsname", goodsname);
		modelAndView.addObject("expressno", expressno);
		modelAndView.addObject("expressid", expressid);
		modelAndView.addObject("deliverytime", deliverytime);
		modelAndView.setViewName("/CancleOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showCancleOrderList.action")
	public ModelAndView showCancleOrderList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		orderCriteria.andOrderstatusEqualTo((byte)-1);
		List<Orders> order = orderService.selectOrder(ordersExample);
		
		for(int i=0;i<order.size();i++)
		{
			String userName = userList(order.get(i).getUserid());
			order.get(i).setusername(userName);
			for(int j=i+1;j<order.size();j++)
			{
				if(order.get(i).getOrderno().equals(order.get(j).getOrderno()))
				{
					System.out.println(order.get(i).getOrderno()+"=="+order.get(j).getOrderno());
					order.remove(j);
				}
			}
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showCancleOrderPage");
		return modelAndView;
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
			for(int j=i+1;j<order.size();j++)
			{
				if(order.get(i).getOrderno().equals(order.get(j).getOrderno()))
				{
					System.out.println(order.get(i).getOrderno()+"=="+order.get(j).getOrderno());
					order.remove(j);
				}
			}
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
			for(int j=i+1;j<order.size();j++)
			{
				if(order.get(i).getOrderno().equals(order.get(j).getOrderno()))
				{
					System.out.println(order.get(i).getOrderno()+"=="+order.get(j).getOrderno());
					order.remove(j);
				}
			}
		}
		
		System.out.println(order.get(1).getusername());
		
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
			for(int j=i+1;j<order.size();j++)
			{
				if(order.get(i).getOrderno().equals(order.get(j).getOrderno()))
				{
					System.out.println(order.get(i).getOrderno()+"=="+order.get(j).getOrderno());
					order.remove(j);
				}
			}
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.setViewName("/showExpressedOrderPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showOrderWLList.action")
	public ModelAndView showOrderWLList(HttpServletRequest request)
	{
		String orderid = request.getParameter("orderid");
		System.out.println(orderid);
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andOrdernoEqualTo(orderid);
		List<Orders> order = orderService.selectOrder(ordersExample);
		List<String> goodsname = new ArrayList<String>();
		List<String> goodscount = new ArrayList<String>();
		List<String> goodsprice = new ArrayList<String>();
		List<String> goodsremarks = new ArrayList<String>();
		
		BigDecimal totalmoney = new BigDecimal(0);
		for(int i=0;i<order.size();i++)
		{
			
			goodsname.add(order.get(i).getGoodsname());
			goodscount.add(String.valueOf(order.get(i).getGoodscount()));
			goodsprice.add(String.valueOf(order.get(i).getGoodsprice()));
			goodsremarks.add(String.valueOf(order.get(i).getGoodsremarks()));
			totalmoney = totalmoney.add(order.get(i).getGoodsmoney());
			if(i!=0)
			{
				order.remove(i);
			}
		}
		order.get(0).setGoodsmoney(totalmoney);
		order.get(0).setTotalmoney(totalmoney);
		order.get(0).setRealtotalmoney(totalmoney);
		
		System.out.println(order.get(0).getOrderno());
		
			String userName = userList(order.get(0).getUserid());
			order.get(0).setusername(userName);
			
			ExpressExample expressExample = new ExpressExample();
			ExpressExample.Criteria expressCriteria =  expressExample.createCriteria();
			expressCriteria.andExpressidEqualTo(order.get(0).getExpressid());
			List<Express> express = orderService.selectExpress(expressExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.addObject("goodsname", goodsname);
		modelAndView.addObject("goodscount", goodscount);
		modelAndView.addObject("goodsprice", goodsprice);
		modelAndView.addObject("goodsremarks", goodsremarks);
		modelAndView.addObject("count", goodscount.size());
		modelAndView.addObject("expressName" , express.get(0).getExpressname());
		modelAndView.setViewName("/orderDeliveryPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showComment.action")
	public ModelAndView showOrderComment(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		GoodscommentExample example = new GoodscommentExample();
		GoodscommentExample.Criteria commentCriteria = example.createCriteria();
		commentCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		commentCriteria.andIsshowEqualTo((byte)1);
		commentCriteria.andDataflagEqualTo((byte)1);
		List<GoodscommentWithBLOBs> commnet = orderService.selectComment(example);
		
		List<String> orderno = new ArrayList<String>();
		List<String> goodsname = new ArrayList<String>();
		List<String> username = new ArrayList<String>();
		
		for(int i=0;i<commnet.size();i++)
		{
			OrdersExample ordersExample = new OrdersExample();
			OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
			orderCriteria.andOrderidEqualTo(commnet.get(i).getOrderid());
			List<Orders> order = orderService.selectOrder(ordersExample);
			orderno.add(order.get(0).getOrderno());
		
			GoodsExample goodsExample = new GoodsExample();
			GoodsExample.Criteria goodsCriteria = goodsExample.createCriteria();
			goodsCriteria.andGoodsidEqualTo(commnet.get(i).getGoodsid());
			List<GoodsWithBLOBs> goods = orderService.selectgoods(goodsExample);
			goodsname.add(goods.get(0).getGoodsname());
		
			UsersExample usersExample = new UsersExample();
			UsersExample.Criteria userCriteria = usersExample.createCriteria();
			userCriteria.andUseridEqualTo(commnet.get(i).getUserid());
			List<Users> user = shopservice.getUserID(usersExample);
			username.add(user.get(0).getUsername());
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("comment", commnet);
		modelAndView.addObject("orderno", orderno);
		modelAndView.addObject("goodsname", goodsname);
		modelAndView.addObject("username", username);
		modelAndView.setViewName("/showComment");
		return modelAndView;
	}
	
	@RequestMapping("/updateComment.action")
	@ResponseBody
	public String updateComment(@RequestBody GoodscommentWithBLOBs goodscommentWithBLOBs) {
		int flag = orderService.updateComment(goodscommentWithBLOBs);
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/insertOrderExpress.action")
	@ResponseBody
	public String insertOrderExpress(@RequestBody Orders orders) {
		
		OrdersExample example = new OrdersExample();
		OrdersExample.Criteria orderCriteria = example.createCriteria();
		orderCriteria.andOrdernoEqualTo(orders.getOrderno());
		List<Orders> order = orderService.selectOrder(example);
		int flag = 0;
		orders.setOrderstatus((byte)1);
		for(int i=0;i<order.size();i++)
		{
			orders.setOrderid(order.get(i).getOrderid());
			flag = orderService.updataExpress(orders);
		}
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/shop/showWLList.action")
	public ModelAndView showWLList(HttpServletRequest request)
	{
		String com = request.getParameter("com");
		String no = request.getParameter("nu");
		String time = request.getParameter("time");
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
		modelAndView.addObject("time", new Date(time));
		modelAndView.addObject("expressno",no);
		modelAndView.addObject("expressname",express.get(0).getExpressname());
		
		modelAndView.setViewName("/showWL");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showDetailsPage.action")
	public ModelAndView showDetailsPage(HttpServletRequest request)
	{
		String orderid = request.getParameter("orderid");
		System.out.println(orderid);
		OrdersExample ordersExample = new OrdersExample();
		OrdersExample.Criteria orderCriteria = ordersExample.createCriteria();
		orderCriteria.andOrdernoEqualTo(orderid);
		List<Orders> order = orderService.selectOrder(ordersExample);
		List<String> goodsname = new ArrayList<String>();
		List<String> goodscount = new ArrayList<String>();
		List<String> goodsprice = new ArrayList<String>();
		List<String> goodsremarks = new ArrayList<String>();
		List<String> goodsstatus = new ArrayList<String>();
		
		BigDecimal totalmoney = new BigDecimal(0);
		for(int i=0;i<order.size();i++)
		{
			goodsname.add(order.get(i).getGoodsname());
			goodscount.add(String.valueOf(order.get(i).getGoodscount()));
			goodsprice.add(String.valueOf(order.get(i).getGoodsprice()));
			goodsremarks.add(String.valueOf(order.get(i).getGoodsremarks()));
			totalmoney = totalmoney.add(order.get(i).getGoodsmoney());
			goodsstatus.add(String.valueOf(order.get(i).getOrderstatus()));
			if(i!=0)
			{
				order.remove(i);
			}
		}
		order.get(0).setGoodsmoney(totalmoney);
		order.get(0).setTotalmoney(totalmoney);
		order.get(0).setRealtotalmoney(totalmoney);
		
		System.out.println(order.get(0).getOrderno());
		
			String userName = userList(order.get(0).getUserid());
			order.get(0).setusername(userName);
			
			ExpressExample expressExample = new ExpressExample();
			ExpressExample.Criteria expressCriteria =  expressExample.createCriteria();
			expressCriteria.andExpressidEqualTo(order.get(0).getExpressid());
			List<Express> express = orderService.selectExpress(expressExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("order", order);
		modelAndView.addObject("goodsname", goodsname);
		modelAndView.addObject("goodscount", goodscount);
		modelAndView.addObject("goodsprice", goodsprice);
		modelAndView.addObject("goodsremarks", goodsremarks);
		modelAndView.addObject("count", goodscount.size());
		modelAndView.addObject("goodsstatus", goodsstatus);
		modelAndView.addObject("expressName" , express.get(0).getExpressname());
		modelAndView.setViewName("/orderDetailsPage");
		return modelAndView;
	}
}
