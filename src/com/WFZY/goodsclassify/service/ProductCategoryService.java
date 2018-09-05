package com.WFZY.goodsclassify.service;

import java.util.List;

import com.WFZY.pojo.Goodsclassify;
import com.WFZY.vo.GoodsclassifyVo;

public interface ProductCategoryService {
	
/////////////////////////////////////////////////////////////////////////////
	/**
	 * 查询一级商品分类
	 * ===================返回值为GoodsclassifyVo=======================
	 */
	List<GoodsclassifyVo> selectOneGoodsclassifyVoAll();
	/**
	 * 查询二级商品分类
	 * ===================返回值为GoodsclassifyVo=======================
	 */
	List<GoodsclassifyVo> selectTwoGoodsclassifyVoAll();
	
	/**
	 * 查询三级商品分类
	 * ===================返回值为GoodsclassifyVo=======================
	 */
	List<GoodsclassifyVo> selectThreeGoodsclassifyVoAll();
	
/////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 查询一级商品分类
	 */
	List<Goodsclassify> selectOneGoodsclassifyAll();
	/**
	 * 查询二级商品分类
	 */
	List<Goodsclassify> selectTwoGoodsclassifyAll();
	
	/**
	 * 查询三级商品分类
	 */
	List<Goodsclassify> selectThreeGoodsclassifyAll();
	
////////////////////////////////////////////////////////////////////////////	
	/**
	 * 添加一级商品分类
	 * 
	 * @return
	 */
	int addOneGoodsClassify(Goodsclassify goodsclassify);
	/**
	 * 添加二级商品分类
	 * 
	 * @return
	 */
	int addTwoGoodsClassify(Goodsclassify goodsclassify);
	/**
	 * 添加三级商品分类
	 * 
	 * @return
	 */
	int addThreeGoodsClassify(Goodsclassify goodsclassify);
	
	/**
	 * 查询父类名称（通过GID）
	 * @param goodsclassifyid -》 GID
	 * @return
	 */
	Goodsclassify selectGnameByGid(Integer goodsclassifyid);
	
	/**
	 * 修改 商品分类（分类名称、排序号）
	 * 
	 * @return
	 */
	int updateAllGoodsClassify(Goodsclassify goodsclassify);
	/**
	 * 删除 商品分类
	 * 
	 * @return
	 */
	int deleteGoodsClassify(Integer goodsclassifyid);
	/**
	 * //查询父类下面  子类的数目
	 * @param goodsclassifyid
	 * @return
	 */
	int selectChildCount(Integer goodsclassifyid);
//	/**
//	 * 搜索  商品分类
//	 * 
//	 * @return
//	 */
//	List<GoodsclassifyVo> searchGoodsClassify(String searchInput);
//	
	
}
