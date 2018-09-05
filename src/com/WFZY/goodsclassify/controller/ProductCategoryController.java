package com.WFZY.goodsclassify.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.WFZY.goodsclassify.service.ProductCategoryService;
import com.WFZY.pojo.Goodsclassify;
import com.WFZY.ulits.DateUtils;
import com.WFZY.vo.GoodsclassifyVo;

@Controller(value = "ProductCategoryController")
public class ProductCategoryController {
	@Resource(name = "ProductCategoryService")
	private ProductCategoryService productCategoryService;

	/**
	 * 查询一级商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/prodctCategory.action")
	public ModelAndView selectGoodsClassify() {
		List<GoodsclassifyVo> goodsclassifyListVo = productCategoryService.selectOneGoodsclassifyVoAll();
		// 创建ModelAndView，用来存放数据和视图
		ModelAndView modelAndView = new ModelAndView();
		// 设置数据到模型中
		modelAndView.addObject("goodsclassifyListVo", goodsclassifyListVo);
		// 设置视图jsp，需要设置视图的物理地址
		modelAndView.setViewName("/product/product-category");

		return modelAndView;
	}

	/**
	 * 查询二级商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/prodctCategoryTwo.action")
	public String selectTwoGoodsClassify(Model model) {
		List<GoodsclassifyVo> goodsclassifyListVo = productCategoryService.selectTwoGoodsclassifyVoAll();

		model.addAttribute("goodsclassifyListVo", goodsclassifyListVo);

		return "/product/product-category";
	}

	/**
	 * 查询三级商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/prodctCategoryThree.action")
	public String selectThreeGoodsClassify(Model model) {

		List<GoodsclassifyVo> goodsclassifyListVo = productCategoryService.selectThreeGoodsclassifyVoAll();

		model.addAttribute("goodsclassifyListVo", goodsclassifyListVo);

		return "/product/product-category";
	}

	/**
	 * 查找一级商品分类名称
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_OneGoodsClassify.action")
	public String OneGoodsClassify(HttpServletRequest request, Model model) {

		List<Goodsclassify> GoodsclassifyNameList = productCategoryService.selectOneGoodsclassifyAll();

		model.addAttribute("GoodsclassifyNameList", GoodsclassifyNameList);

		return "/product/product_addOneGoodsClassify";
	}

	/**
	 * 添加一级商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_addOneGoodsClassify.action")
	public String addOneGoodsClassify(HttpServletRequest request, Model model) {
		// 获取商品分类级别
		Integer goodsclassifygrade = Integer.valueOf(request.getParameter("goodsclassifygrade"));
		// 获取商品分类名称
		String goodsclassifyname = request.getParameter("goodsclassifyname");
		// 获取商品排序号
		Integer goodsclassifysort = Integer.valueOf(request.getParameter("goodsclassifysort"));

		Goodsclassify goodsclassify = new Goodsclassify();
		goodsclassify.setGoodsclassifyname(goodsclassifyname);
		goodsclassify.setGoodsclassifysort(goodsclassifysort);
		goodsclassify.setGoodsclassifygrade(goodsclassifygrade);
		goodsclassify.setCreatetime(new Date());

		int i = productCategoryService.addOneGoodsClassify(goodsclassify);

		return "/product/prodctCategory.action";
	}

	/**
	 * 查找二级商品分类名称
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_TwoGoodsClassify.action")
	public String TwoGoodsClassify(HttpServletRequest request, Model model) {
		System.out.println("===================================================");
		// 查询父类ID
		Integer goodsclassifyid = Integer.valueOf(request.getParameter("goodsclassifyid"));
		System.out.println(goodsclassifyid);

		List<Goodsclassify> GoodsclassifyNameList = productCategoryService.selectTwoGoodsclassifyAll();

		// 查询父类名称
		Goodsclassify goodsclassify = productCategoryService.selectGnameByGid(goodsclassifyid);

		model.addAttribute("GoodsclassifyNameList", GoodsclassifyNameList);

		model.addAttribute("goodsclassify", goodsclassify);

		return "/product/product_addTwoGoodsClassify";
	}

	/**
	 * 添加二级商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_addTwoGoodsClassify.action")
	public String addTwoGoodsClassify(HttpServletRequest request, Model model) {

		// 获取二级分类名称
		String goodsclassifyname = request.getParameter("goodsclassifyname");
		// 获取父类分类名称
		String goodsclassifyparentname = request.getParameter("gpname");
		// 获取父类ID
		Integer goodsclassifyparentid = Integer.valueOf(request.getParameter("gpid"));
		// 获取商品排序号
		Integer goodsclassifysort = Integer.valueOf(request.getParameter("goodsclassifysort"));
		// 获取商品分类级别
		Integer goodsclassifygrade = 2;

		Goodsclassify goodsclassify = new Goodsclassify();
		goodsclassify.setGoodsclassifyname(goodsclassifyname);
		goodsclassify.setGoodsclassifyparentname(goodsclassifyparentname);
		goodsclassify.setGoodsclassifyparentid(goodsclassifyparentid);
		goodsclassify.setGoodsclassifysort(goodsclassifysort);
		goodsclassify.setGoodsclassifygrade(goodsclassifygrade);
		goodsclassify.setCreatetime(new Date());

		int i = productCategoryService.addTwoGoodsClassify(goodsclassify);

		return "/product/prodctCategoryTwo.action";
	}

	
	
	/**
	 * 查找三级商品分类名称
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_ThreeGoodsClassify.action")
	public String ThreeGoodsClassify(HttpServletRequest request, Model model) {
		System.out.println("===================================================");
		// 查询父类ID
		Integer goodsclassifyid = Integer.valueOf(request.getParameter("goodsclassifyid"));
		System.out.println(goodsclassifyid);

		List<Goodsclassify> GoodsclassifyNameList = productCategoryService.selectThreeGoodsclassifyAll();

		// 查询父类名称
		Goodsclassify goodsclassify = productCategoryService.selectGnameByGid(goodsclassifyid);

		model.addAttribute("GoodsclassifyNameList", GoodsclassifyNameList);

		model.addAttribute("goodsclassify", goodsclassify);

		return "/product/product_addThreeGoodsClassify";
	}

	/**
	 * 添加三级商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_addThreeGoodsClassify.action")
	public String addThreeGoodsClassify(HttpServletRequest request, Model model) {

		// 获取二级分类名称
		String goodsclassifyname = request.getParameter("goodsclassifyname");
		// 获取父类分类名称
		String goodsclassifyparentname = request.getParameter("gpname");
		// 获取父类ID
		Integer goodsclassifyparentid = Integer.valueOf(request.getParameter("gpid"));
		// 获取商品排序号
		Integer goodsclassifysort = Integer.valueOf(request.getParameter("goodsclassifysort"));
		// 获取商品分类级别
		Integer goodsclassifygrade = 3;

		Goodsclassify goodsclassify = new Goodsclassify();
		goodsclassify.setGoodsclassifyname(goodsclassifyname);
		goodsclassify.setGoodsclassifyparentname(goodsclassifyparentname);
		goodsclassify.setGoodsclassifyparentid(goodsclassifyparentid);
		goodsclassify.setGoodsclassifysort(goodsclassifysort);
		goodsclassify.setGoodsclassifygrade(goodsclassifygrade);
		goodsclassify.setCreatetime(new Date());

		int i = productCategoryService.addThreeGoodsClassify(goodsclassify);

		return "/product/prodctCategoryThree.action";
	}
	
	/**
	 * 查询要修改的 商品分类名称 、排序号
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_updateGoodsClassify.action")
	public String updateGoodsClassify(HttpServletRequest request, Model model) {

		Integer goodsclassifyid = Integer.valueOf(request.getParameter("goodsclassifyid"));

		String goodsclassifyname = request.getParameter("goodsclassifyname");

		Integer goodsclassifysort = Integer.valueOf(request.getParameter("goodsclassifysort"));

		Integer goodsclassifygrade = Integer.valueOf(request.getParameter("goodsclassifygrade"));

		Goodsclassify goodsclassify = new Goodsclassify();
		goodsclassify.setGoodsclassifyid(goodsclassifyid);
		goodsclassify.setGoodsclassifyname(goodsclassifyname);
		goodsclassify.setGoodsclassifysort(goodsclassifysort);
		goodsclassify.setGoodsclassifygrade(goodsclassifygrade);

		model.addAttribute("goodsclassify", goodsclassify);

		return "/product/product_updateGoodsClassify";
	}

	/**
	 * 修改 商品分类（分类名称、排序号）
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_updateAllGoodsClassify.action")
	public String updateAllGoodsClassify(HttpServletRequest request, Model model) {

		Integer goodsclassifyid = Integer.valueOf(request.getParameter("goodsclassifyid"));

		String goodsclassifyname = request.getParameter("goodsclassifyname");

		Integer goodsclassifysort = Integer.valueOf(request.getParameter("goodsclassifysort"));

		Goodsclassify goodsclassify = new Goodsclassify();
		goodsclassify.setGoodsclassifyid(goodsclassifyid);
		goodsclassify.setGoodsclassifyname(goodsclassifyname);
		goodsclassify.setGoodsclassifysort(goodsclassifysort);

		int i = productCategoryService.updateAllGoodsClassify(goodsclassify);

		return "/product/prodctCategory.action";
	}
	/**
	 * 删除 商品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product/product_deleteGoodsClassify.action")
	public String deleteGoodsClassify(HttpServletRequest request, Model model) {
		// 获取商品分类ID
		Integer goodsclassifyid = Integer.valueOf(request.getParameter("goodsclassifyid"));

		// 查询父类下面 子类的数目
		int childCount = productCategoryService.selectChildCount(goodsclassifyid);

		// 删除 ID为goodsclassifyid的商品分类(如果该分类有子类，则不能删除，应先删除所有子类。反之则可以删除)
		if (childCount <= 0) {
			int i = productCategoryService.deleteGoodsClassify(goodsclassifyid);
			System.out.println("====================================================");
			System.out.println("删除成功");
			System.out.println("====================================================");
		}else{
			System.out.println("====================================================");
			System.out.println("删除失败，请先删除该类的所有子类，才能删除这一类。");
			System.out.println("====================================================");
		}
		return "/product/prodctCategory.action";
	}
	
	
//	/**
//	 * 搜索  商品分类
//	 * 
//	 * @return
//	 */
//	@RequestMapping("/product/product_serchGoodsClassify.action")
//	public String serchGoodsClassify(HttpServletRequest request, Model model) {
//		
//		String searchInput = request.getParameter("searchInput");
//		
//		List<GoodsclassifyVo> searchGoodsclassifyVo =  productCategoryService.searchGoodsClassify(searchInput);
//		
//		model.addAttribute("searchGoodsclassifyVo", searchGoodsclassifyVo);
//		
//		return "/product/product_searchGoodsClassify.jsp";
//	}
	
}
