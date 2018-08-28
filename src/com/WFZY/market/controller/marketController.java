package com.WFZY.market.controller;

import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.market.service.marketService;
import com.WFZY.order.service.orderService;
import com.WFZY.pojo.GoodsExample;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodsapply;
import com.WFZY.pojo.GoodsapplyExample;
import com.WFZY.pojo.Goodstime;
import com.WFZY.pojo.GoodstimeExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;
import com.WFZY.pojo.Shops;
import com.WFZY.pojo.ShopsExample;
import com.WFZY.pojo.Users;
import com.WFZY.shop.service.ShopService;

@Controller
public class marketController {

	@Resource(name = "marketServiceImpl")
	private marketService marketService;
	
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
	
	@RequestMapping("/shop/showMarketList.action")
	public ModelAndView showMarketList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		GoodsExample example = new GoodsExample();
		GoodsExample.Criteria goodsCriteria = example.createCriteria();
		goodsCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		List<GoodsWithBLOBs> goods = marketService.selectGoods(example);
		
		GoodstimeExample goodstimeExample = new GoodstimeExample();
		GoodstimeExample.Criteria goodsCriteria2 = goodstimeExample.createCriteria();
		goodsCriteria2.andFlogEqualTo(1);
		List<Goodstime> time = marketService.selectGoodsTime(goodstimeExample);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("shops", shopList);
		modelAndView.addObject("goods", goods);
		modelAndView.addObject("time", time);
		modelAndView.setViewName("/marketPage");
		return modelAndView;
	}
	
	@RequestMapping("/insertGoodsApply.action")
	@ResponseBody
	public String insertGoodsApply(@RequestBody Goodsapply goodsapply) {
		
		List<Goodsapply> i = null;
		System.out.println(goodsapply.getGoodstype());
		System.out.println(goodsapply.getGoodsid());
		if(goodsapply.getGoodstype() == 1)
		{
			GoodsapplyExample goodsapplyExample = new GoodsapplyExample();
			GoodsapplyExample.Criteria goodsapplyCriteria = goodsapplyExample.createCriteria();
			goodsapplyCriteria.andStarttimeEqualTo(goodsapply.getStarttime());
			goodsapplyCriteria.andGoodsidEqualTo(goodsapply.getGoodsid());
			i = marketService.selectMarket(goodsapplyExample);
		}
		else if(goodsapply.getGoodstype() != 1)
		{
			GoodsapplyExample goodsapplyExample = new GoodsapplyExample();
			GoodsapplyExample.Criteria goodsapplyCriteria = goodsapplyExample.createCriteria();
			goodsapplyCriteria.andGoodsidEqualTo(goodsapply.getGoodsid());
			i = marketService.selectMarket(goodsapplyExample);
		}
		int flag=0;
		if(i.isEmpty())
		{
			flag = marketService.insertMarket(goodsapply);
		}
		else
		{
			flag=-1;
		}
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/shop/showMarketShowList.action")
	public ModelAndView showMarketShowList(HttpServletRequest request) throws ParseException
	{
		List<Shops> shopList = shopList(request);
		
		
		GoodsapplyExample goodsapplyExample = new GoodsapplyExample();
		GoodsapplyExample.Criteria goodsapplyCriteria = goodsapplyExample.createCriteria();
		goodsapplyCriteria.andShopidEqualTo(shopList.get(0).getShopid());
		List<Goodsapply>  i = marketService.selectMarket(goodsapplyExample);
		
		for(int j=0;j<i.size();j++)
		{
		GoodsExample example = new GoodsExample();
		GoodsExample.Criteria goodsCriteria = example.createCriteria();
		goodsCriteria.andGoodsidEqualTo(i.get(j).getGoodsid());
		List<GoodsWithBLOBs> goods = marketService.selectGoods(example);
		i.get(j).setgoodsName(goods.get(0).getGoodsname());
		
		
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("shops", shopList.get(0).getShopname());
		modelAndView.addObject("goodsapply", i);
		modelAndView.setViewName("/marketShowPage");
		return modelAndView;
	}
}
