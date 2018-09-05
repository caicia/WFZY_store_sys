package com.WFZY.goodsclassify.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WFZY.goodsclassify.service.ProductCategoryService;
import com.WFZY.goodsclassify.service.ProductListService;
import com.WFZY.mapper.GoodsMapper;
import com.WFZY.pojo.AdminsExample;
import com.WFZY.pojo.Goods;
import com.WFZY.pojo.GoodsExample;
import com.WFZY.pojo.GoodsWithBLOBs;

@Service("ProductListService")
public class ProductListServiceImpl implements ProductListService {

	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> seletGoodsAll(Byte dataflag,Integer shopid) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andDataflagEqualTo(dataflag).andShopidEqualTo(shopid);
		List<Goods> goodsList = this.goodsMapper.selectByExample(goodsExample);
		return goodsList;
	}

	/**
	 * 
	 * 查询商品详细内容(通过goodsid)
	 * @return
	 */
	@Override
	public Goods showGoodsDetails(Integer goodsid) {
		Goods good = this.goodsMapper.selectByPrimaryKey(goodsid);
		return good;
	}

	/**
	 * 
	 * 修改      商品详细内容   (通过goodsid)
	 * @return
	 */
	@Override
	public int updateGoods(GoodsWithBLOBs goodsWithBLOBs) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andGoodsidEqualTo(goodsWithBLOBs.getGoodsid());
		int i = this.goodsMapper.updateByExampleSelective(goodsWithBLOBs, goodsExample);
		return i;
	}

	/**
	 * 
	 * 添加    新  商品  
	 * @return
	 */
	@Override
	public int addGoodsApply(GoodsWithBLOBs goodsWithBLOBs) {
		int i = this.goodsMapper.insertSelective(goodsWithBLOBs);
		return i;
	}

	/**
	 * 
	 * 删除  商品（通过goodsid）
	 * 
	 * @return
	 */
	@Override
	public int deleteGoods(GoodsWithBLOBs goodsWithBLOBs) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andGoodsidEqualTo(goodsWithBLOBs.getGoodsid());
		int i = this.goodsMapper.updateByExampleSelective(goodsWithBLOBs, goodsExample);
		return i;
	}

	/**
	 * 
	 * 查询    已删除失效的商品
	 * 
	 * @return
	 */
	@Override
	public List<Goods> seletdeletedGoodsAll(Byte dataflag) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andDataflagEqualTo(dataflag);
		List<Goods> deletedGoodsList = this.goodsMapper.selectByExample(goodsExample);
		return deletedGoodsList;
	}

	/**
	 * 
	 * 恢复    已删除失效的商品
	 * 
	 * @return
	 */
	@Override
	public int recoverDeletedGoods(GoodsWithBLOBs goodsWithBLOBs) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andGoodsidEqualTo(goodsWithBLOBs.getGoodsid());
		int i = this.goodsMapper.updateByExampleSelective(goodsWithBLOBs, goodsExample);
		return i;
	}
	


	

}
