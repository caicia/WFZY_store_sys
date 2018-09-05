package com.WFZY.goodsclassify.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.WFZY.pojo.Goods;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodsclassify;
import com.WFZY.vo.GoodsclassifyVo;


public interface ProductListService {
	
	/**
	 * 
	 * 查询全部商品
	 * @return
	 */
	List<Goods> seletGoodsAll(Byte dataflag,Integer shopid);

	/**
	 * 
	 * 查询商品详细内容(通过goodsid)
	 * @return
	 */
	Goods showGoodsDetails(Integer goodsid);

	/**
	 * 
	 * 修改      商品详细内容   (通过goodsid)
	 * @return
	 */
	int updateGoods(GoodsWithBLOBs goodsWithBLOBs);

	/**
	 * 
	 * 添加    新  商品  
	 * @return
	 */
	int addGoodsApply(GoodsWithBLOBs goodsWithBLOBs);

	/**
	 * 
	 * 删除  商品（通过goodsid）
	 * 
	 * @return
	 */
	int deleteGoods(GoodsWithBLOBs goodsWithBLOBs);

	/**
	 * 
	 * 查询    已删除失效的商品
	 * 
	 * @return
	 */
	List<Goods> seletdeletedGoodsAll(Byte dataflag);

	/**
	 * 
	 * 恢复    已删除失效的商品
	 * 
	 * @return
	 */
	int recoverDeletedGoods(GoodsWithBLOBs goodsWithBLOBs);
	

}
