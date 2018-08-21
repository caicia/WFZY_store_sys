package com.WFZY.shop.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.WFZY.pojo.ActivityExample;
import com.WFZY.pojo.ActivityWithBLOBs;
import com.WFZY.pojo.Banks;
import com.WFZY.pojo.BanksExample;

import com.WFZY.pojo.Shopclassify;
import com.WFZY.pojo.ShopclassifyExample;
import com.WFZY.pojo.ShopclassifyExample.Criteria;
import com.WFZY.pojo.Shops;
import com.WFZY.pojo.ShopsExample;
import com.WFZY.pojo.Users;
import com.WFZY.pojo.UsersExample;
import com.WFZY.shop.service.ShopService;



@Controller
public class ShopIndexController {
	
	
	@Resource(name = "ShopServiceImpl")
	private ShopService shopservice;
	


	@RequestMapping("/updateShops.action")
	@ResponseBody
	public String showShopClassify(@RequestBody Shops shops,HttpServletRequest request) {
		if(request.getSession().getAttribute("saveUrlUpdata")!=null)
		{
			shops.setShopimg(String.valueOf(request.getSession().getAttribute("saveUrlUpdata")));
		}
		int flag = shopservice.updataShopApply(shops);
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/updateBanks.action")
	@ResponseBody
	public String updateBanks(@RequestBody Banks Banks,HttpServletRequest request) {
		int flag = shopservice.updataBanks(Banks);
		return "{\"flag\":" + flag + "}";
	}
	
	@RequestMapping("/checkBanksNumber")
	@ResponseBody
	public String checkBanksNumber(HttpServletRequest request) {
		
		String bankno=request.getParameter("bankno");
		PrintWriter out1 = null;
	    BufferedReader in = null;
	    String result = "";
	    try {
	            String url="https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?cardNo="+bankno+"&cardBinCheck=true";
	            URL realUrl = new URL(url);
	            // 打开和URL之间的连接
	            URLConnection conn = realUrl.openConnection();
	            // 设置通用的请求属性
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
	            conn.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            // 发送POST请求必须设置如下两行
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            // 获取URLConnection对象对应的输出流
	            out1 = new PrintWriter(conn.getOutputStream());
	            // 发送请求参数
	            out1.print("");
	            // flush输出流的缓冲
	            out1.flush();
	            // 定义BufferedReader输入流来读取URL的响应
	            in = new BufferedReader(
	                    new InputStreamReader(conn.getInputStream()));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	            
	            System.out.println(result);
	        } catch (Exception e) {
	            System.out.println("发送 POST 请求出现异常！"+e);
	            e.printStackTrace();
	        }
	        //使用finally块来关闭输出流、输入流
	        finally{
	            try{
	                if(out1!=null){
	                    out1.close();
	                }
	                if(in!=null){
	                    in.close();
	                }
	            }
	            catch(IOException ex){
	                ex.printStackTrace();
	            }
	        }
		return result;
	}
	
	/*
	 * 上传图片 图片位置为/image/activity/
	 */
	@RequestMapping("/shop/uploadShopUpdate")
	public void login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "file", required = false) MultipartFile fileUpload)
			throws IllegalStateException, IOException {
		
		if (fileUpload != null) {
			String realPath = request.getSession().getServletContext().getRealPath("/image/shopEmoji/");
			String relaPath = request.getContextPath() + "/image/shopEmoji/";
			String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
			String picName = uuid + fileUpload.getOriginalFilename();
			String savePath = realPath + picName;
			String saveUrl = relaPath + picName;
			request.getSession().setAttribute("saveUrlUpdata", saveUrl);
			if (realPath == null) {
				return;
			}
			fileUpload.transferTo(new File(savePath));
			
		} else {
			System.out.println("文件不存在");
		}
	}
	
	@RequestMapping("/shop/showApplyPage")
	public ModelAndView showApplyPage(HttpServletRequest request) {
		Users users = (Users) request.getSession().getAttribute("loginUser");
		ShopsExample record = new ShopsExample(); 
		ShopsExample.Criteria shopCriteria = record.createCriteria();
		System.out.println(users);
		shopCriteria.andUseridEqualTo(Integer.valueOf(users.getUserid()));
		List<Shops> shopList = shopservice.getShopsID(record);
		BanksExample bankExceple = new BanksExample();
		BanksExample.Criteria bankCriteria = bankExceple.createCriteria();
		bankCriteria.andBankidEqualTo(shopList.get(0).getBankid());
		List<Banks> banks = shopservice.getBanksID(bankExceple);
		
		ShopclassifyExample shopclassify = new ShopclassifyExample();
		Criteria shopCriterion = shopclassify.createCriteria();
		shopCriterion.andShopclassifyidEqualTo(shopList.get(0).getShopclassifyid());
		
		List<Shopclassify> i=shopservice.getShopclassifyName(shopclassify);
		
		ModelAndView modelAndView = new ModelAndView();
		
		UsersExample user = new UsersExample();
		UsersExample.Criteria UserCriteria = user.createCriteria();
		UserCriteria.andUseridEqualTo(shopList.get(0).getUserid());
 		List<Users> user1 = shopservice.getUserID(user);
		modelAndView.addObject("shopList", shopList);
		modelAndView.addObject("banks", banks);
		modelAndView.addObject("Shopclassify", i);
		modelAndView.addObject("user", user1);
		modelAndView.setViewName("/shopLongApplyPage");
		return modelAndView;
	}
	
	@RequestMapping("/shop/showBanksPage")
	public ModelAndView showBanksPage(HttpServletRequest request) {
		Users users = (Users) request.getSession().getAttribute("loginUser");
		ShopsExample record = new ShopsExample(); 
		ShopsExample.Criteria shopCriteria = record.createCriteria();
		System.out.println(users);
		shopCriteria.andUseridEqualTo(Integer.valueOf(users.getUserid()));
		List<Shops> shopList = shopservice.getShopsID(record);
		BanksExample bankExceple = new BanksExample();
		BanksExample.Criteria bankCriteria = bankExceple.createCriteria();
		bankCriteria.andBankidEqualTo(shopList.get(0).getBankid());
		List<Banks> banks = shopservice.getBanksID(bankExceple);
		
		ModelAndView modelAndView = new ModelAndView();
		
		UsersExample user = new UsersExample();
		UsersExample.Criteria UserCriteria = user.createCriteria();
		UserCriteria.andUseridEqualTo(shopList.get(0).getUserid());
 		List<Users> user1 = shopservice.getUserID(user);
		modelAndView.addObject("shopList", shopList);
		modelAndView.addObject("banks", banks);
		modelAndView.setViewName("/shopBanksPage");
		return modelAndView;
	}
	
	
	

}
