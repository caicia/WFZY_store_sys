package com.WFZY.goodsclassify.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WFZY.goodsclassify.service.ProductCategoryService;
import com.WFZY.mapper.GoodsclassifyMapper;
import com.WFZY.pojo.Goodsclassify;
import com.WFZY.pojo.GoodsclassifyExample;
import com.WFZY.vo.GoodsclassifyVo;

@Service("ProductCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private GoodsclassifyMapper goodsclassifyMapper;
	
	/**
	 * 查询一级商品类别
	 */
	@Override
	public List<GoodsclassifyVo> selectOneGoodsclassifyVoAll() {
		List<GoodsclassifyVo> goodsclassifyListVo= this.goodsclassifyMapper.selectOneGoodsClassifyVoByPid();
		return goodsclassifyListVo;
	}
	/**
	 * 查询二级商品类别
	 */
	@Override
	public List<GoodsclassifyVo> selectTwoGoodsclassifyVoAll() {
		List<GoodsclassifyVo> goodsclassifyListTwoVo= this.goodsclassifyMapper.selectTwoGoodsClassifyVoByPid();
		return goodsclassifyListTwoVo;
	}
	/**
	 * 查询三级商品类别
	 */
	@Override
	public List<GoodsclassifyVo> selectThreeGoodsclassifyVoAll() {
		List<GoodsclassifyVo> goodsclassifyListThreeVo= this.goodsclassifyMapper.selectThreeGoodsClassifyVoByPid();
		return goodsclassifyListThreeVo;
	}
	
	/**
	 * 查询一级商品类别
	 */
	@Override
	public List<Goodsclassify> selectOneGoodsclassifyAll() {
		List<Goodsclassify> goodsclassifyList= this.goodsclassifyMapper.selectOneGoodsClassifyByPid();
		return goodsclassifyList;
	}
	/**
	 * 查询二级商品类别
	 */
	@Override
	public List<Goodsclassify> selectTwoGoodsclassifyAll() {
		List<Goodsclassify> goodsclassifyListTwo= this.goodsclassifyMapper.selectTwoGoodsClassifyByPid();
		return goodsclassifyListTwo;
	}
	/**
	 * 查询三级商品类别
	 */
	@Override
	public List<Goodsclassify> selectThreeGoodsclassifyAll() {
		List<Goodsclassify> goodsclassifyListThree= this.goodsclassifyMapper.selectThreeGoodsClassifyByPid();
		return goodsclassifyListThree;
	}
	
	
	
	
	
	
	/**
	 * 添加一级商品类别
	 */
	@Override
	public int addOneGoodsClassify(Goodsclassify goodsclassify) {
		int i =this.goodsclassifyMapper.insertSelective(goodsclassify);
		return i;
	}

	@Override
	public Goodsclassify selectGnameByGid(Integer goodsclassifyid) {
		Goodsclassify goodsclassify = this.goodsclassifyMapper.selectGnameByGid(goodsclassifyid);
		return goodsclassify;
	}
	/**
	 * 添加二级商品类别
	 */
	@Override
	public int addTwoGoodsClassify(Goodsclassify goodsclassify) {
		int  i =this.goodsclassifyMapper.insertSelective(goodsclassify);
		return i;
	}

	@Override
	public int updateAllGoodsClassify(Goodsclassify goodsclassify) {
		GoodsclassifyExample  goodsclassifyExample = new GoodsclassifyExample();
		goodsclassifyExample.createCriteria().andGoodsclassifyidEqualTo(goodsclassify.getGoodsclassifyid());
		int  i =this.goodsclassifyMapper.updateByExampleSelective(goodsclassify, goodsclassifyExample);
		return i;
	}

	@Override
	public int deleteGoodsClassify(Integer goodsclassifyid) {
		int  i =this.goodsclassifyMapper.deleteByPrimaryKey(goodsclassifyid);
		return i;
	}

	/**
	 * //查询父类下面  子类的数目
	 * @param goodsclassifyid
	 * @return
	 */
	@Override
	public int selectChildCount(Integer goodsclassifyid) {
		int  i =this.goodsclassifyMapper.selectChildCount(goodsclassifyid);
		return i;
	}

	/**
	 * 添加三级商品类别
	 */
	@Override
	public int addThreeGoodsClassify(Goodsclassify goodsclassify) {
		int  i =this.goodsclassifyMapper.insertSelective(goodsclassify);
		return i;
	}
//	/**
//	 * 搜索  商品分类
//	 * 
//	 * @return
//	 */
//	@Override
//	public List<GoodsclassifyVo> searchGoodsClassify(String searchInput) {
//		List<GoodsclassifyVo> searchGoodsclassify = this.goodsclassifyMapper.searchGoodsClassify(searchInput);
//		return searchGoodsclassify;
//	}

	

}
