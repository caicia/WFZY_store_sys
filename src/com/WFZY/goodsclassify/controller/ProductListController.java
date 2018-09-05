package com.WFZY.goodsclassify.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.goodsclassify.service.ProductCategoryService;
import com.WFZY.goodsclassify.service.ProductListService;
import com.WFZY.mapper.GoodsMapper;
import com.WFZY.mapper.ShopsMapper;
import com.WFZY.pojo.Goods;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodsclassify;
import com.WFZY.pojo.Shops;
import com.WFZY.pojo.ShopsExample;
import com.WFZY.pojo.ShopsexpressExample;
import com.WFZY.pojo.Users;
import com.WFZY.ulits.DateUtils;
import com.WFZY.vo.GoodsclassifyVo;

@Controller(value = "ProductListController")
public class ProductListController {

	@Resource(name = "ProductListService")
	private ProductListService productListService;

	@Resource(name = "ProductCategoryService")
	private ProductCategoryService productCategoryService;

	@Autowired
	private ShopsMapper shopsMapper;

	/**
	 * 
	 * 查询全部商品
	 * 
	 * @return
	 */
	@RequestMapping("/shop/product/product_list.action")
	public String seletGoodsAll(HttpServletRequest request, Model model) {

		// 获取登录商家的ID
		Users user = (Users) request.getSession().getAttribute("loginUser");
		System.out.println(user);

		// 查询 该商家的店铺ID （通过userid）
		ShopsExample shopsExample = new ShopsExample();
		shopsExample.createCriteria().andUseridEqualTo(user.getUserid());
		List<Shops> shops = this.shopsMapper.selectByExample(shopsExample);
		// System.out.println(shops);
		// System.out.println(shops.get(0).getShopid());
		Integer shopid = shops.get(0).getShopid();

		Integer dataflagInt = 1;
		Byte dataflag = dataflagInt.byteValue();

		List<Goods> goodsList = productListService.seletGoodsAll(dataflag, shopid);

		model.addAttribute("goodsList", goodsList);

		return "/product/product-list";
	}

	/**
	 * 
	 * 查询商品详细内容(通过goodsid)
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_showGoodsDetails.action")
	public String showGoodsDetails(HttpServletRequest request, Model model) {

		Integer goodsid = Integer.valueOf(request.getParameter("goodsid"));

		Goods goods = productListService.showGoodsDetails(goodsid);

		Goodsclassify goodsclassify = productCategoryService.selectGnameByGid(goods.getGoodsclassifyid());

		String goodsclassifyname = goodsclassify.getGoodsclassifyname();

		String createtime = null;
		if (goods.getCreatetime() != null) {
			createtime = new DateUtils().getSimpleDate(goods.getCreatetime());
			model.addAttribute("createtime", createtime);
		}
		String saletime = null;
		if (goods.getSaletime() != null) {
			saletime = new DateUtils().getSimpleDate(goods.getSaletime());
			model.addAttribute("saletime", saletime);
		}

		model.addAttribute("goods", goods);
		model.addAttribute("goodsclassifyname", goodsclassifyname);
		model.addAttribute("createtime", createtime);
		model.addAttribute("saletime", saletime);

		return "/product/product_showGoodsDetails";
	}

	/**
	 * 
	 * 查询 商品详细内容(通过goodsid)
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_toUpdateGoods.action")
	public String toUpdateGoods(HttpServletRequest request, Model model) {

		Integer goodsid = Integer.valueOf(request.getParameter("goodsid"));

		Goods goods = productListService.showGoodsDetails(goodsid);

		Goodsclassify goodsclassify = productCategoryService.selectGnameByGid(goods.getGoodsclassifyid());

		List<Goodsclassify> goodsclassifyList = productCategoryService.selectThreeGoodsclassifyAll();

		String goodsclassifyname = goodsclassify.getGoodsclassifyname();

		String createtime = null;
		if (goods.getCreatetime() != null) {
			createtime = new DateUtils().getSimpleDate(goods.getCreatetime());
			model.addAttribute("createtime", createtime);
		}
		String saletime = null;
		if (goods.getSaletime() != null) {
			saletime = new DateUtils().getSimpleDate(goods.getSaletime());
			model.addAttribute("saletime", saletime);
		}

		model.addAttribute("goods", goods);
		model.addAttribute("goodsclassifyname", goodsclassifyname);
		model.addAttribute("goodsclassifyList", goodsclassifyList);

		return "/product/product_updateGoods";
	}

	/**
	 * 
	 * 修改 商品详细内容 (通过goodsid)
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_updateGoods.action")
	public @ResponseBody String updateGoods(@RequestBody GoodsWithBLOBs goodsWithBLOBs) {

		if (goodsWithBLOBs.getIssale() == 1) {
			goodsWithBLOBs.setSaletime(new Date());
		}

		int i = productListService.updateGoods(goodsWithBLOBs);

		return "{\"message\":" + i + "}";
	}

	/**
	 * 
	 * 修改 商品详细内容 (通过goodsid)
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_toAddGoods.action")
	public String toAddGoods(Model model) {

		List<Goodsclassify> goodsclassifyList = productCategoryService.selectThreeGoodsclassifyAll();

		model.addAttribute("goodsclassifyList", goodsclassifyList);

		return "/product/product_addGoods";
	}

	/*
	 * 上传图片 图片位置为/image/activity/
	 */
	@RequestMapping("/uploadImg.action")
	public void uploadImg(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "file", required = false) MultipartFile fileUpload)
			throws IllegalStateException, IOException {

		if (fileUpload != null) {
			String realPath = request.getSession().getServletContext().getRealPath("/images/goodsImg/");
			String relaPath = request.getContextPath() + "/images/goodsImg/";
			String picName = DateUtils.getRandomDate() + fileUpload.getOriginalFilename();
			String savePath = realPath + picName;
			String saveUrl = relaPath + picName;
			request.getSession().setAttribute("saveUrl", saveUrl);
			if (realPath == null) {
				return;
			}
			fileUpload.transferTo(new File(savePath));

		} else {
			System.out.println("文件不存在");
		}
	}

	/**
	 * 
	 * 添加 新 商品
	 * 
	 * @return
	 */
	@RequestMapping("/product/addGoodsApply.action")
	public @ResponseBody String addGoodsApply(@RequestBody GoodsWithBLOBs goodsWithBLOBs, HttpServletRequest request) {

		// 获取登录商家的ID
		Users user = (Users) request.getSession().getAttribute("loginUser");
		System.out.println(user);

		// 查询 该商家的店铺ID （通过userid）
		ShopsExample shopsExample = new ShopsExample();
		shopsExample.createCriteria().andUseridEqualTo(user.getUserid());
		List<Shops> shops = this.shopsMapper.selectByExample(shopsExample);
		// System.out.println(shops);
		// System.out.println(shops.get(0).getShopid());
		Integer shopid = shops.get(0).getShopid();

		String goodssn = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		String productno = UUID.randomUUID().toString().replace("-", "").toLowerCase();

		String goodsimg = (String) request.getSession().getAttribute("saveUrl");

		goodsWithBLOBs.setShopid(shopid);
		goodsWithBLOBs.setGoodssn(goodssn);
		goodsWithBLOBs.setProductno(productno);
		goodsWithBLOBs.setGoodsimg(goodsimg);

		// 判断是否上架 ，如上架则添加上架时间，否则无。
		if (goodsWithBLOBs.getIssale() == 1) {
			goodsWithBLOBs.setSaletime(new Date());
		}
		goodsWithBLOBs.setCreatetime(new Date());

		int i = productListService.addGoodsApply(goodsWithBLOBs);

		return "{\"message\":" + i + "}";
	}

	/**
	 * 
	 * 删除 商品（通过goodsid）
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_toDeleteGoods.action")
	public @ResponseBody String deleteGoods(HttpServletRequest request) {

		Integer goodsid = Integer.valueOf(request.getParameter("goodsid"));

		Integer dataflagInt = -1;
		Byte dataflag = dataflagInt.byteValue();

		GoodsWithBLOBs goodsWithBLOBs = new GoodsWithBLOBs();
		goodsWithBLOBs.setGoodsid(goodsid);
		goodsWithBLOBs.setDataflag(dataflag);

		int i = productListService.deleteGoods(goodsWithBLOBs);

		return "{\"message\":" + i + "}";
	}

	/**
	 * 
	 * 查询 已删除失效的商品
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_deletedGoods.action")
	public String deletedGoods(Model model) {

		Integer dataflagInt = -1;
		Byte dataflag = dataflagInt.byteValue();

		List<Goods> deletedGoodsList = productListService.seletdeletedGoodsAll(dataflag);

		model.addAttribute("deletedGoodsList", deletedGoodsList);

		return "/product/product_deletedGoods";
	}

	/**
	 * 
	 * 恢复 已删除失效的商品
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_recoverDeletedGoods.action")
	public @ResponseBody String recoverDeletedGoods(HttpServletRequest request, Model model) {

		Integer goodsid = Integer.valueOf(request.getParameter("goodsid"));

		Integer dataflagInt = 1;
		Byte dataflag = dataflagInt.byteValue();

		GoodsWithBLOBs goodsWithBLOBs = new GoodsWithBLOBs();
		goodsWithBLOBs.setGoodsid(goodsid);
		goodsWithBLOBs.setDataflag(dataflag);

		int i = productListService.recoverDeletedGoods(goodsWithBLOBs);

		return "{\"message\":" + i + "}";
	}
}
