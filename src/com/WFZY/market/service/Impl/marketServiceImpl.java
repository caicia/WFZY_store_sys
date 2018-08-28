package com.WFZY.market.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.WFZY.mapper.GoodsMapper;
import com.WFZY.mapper.GoodsactivityMapper;
import com.WFZY.mapper.GoodsapplyMapper;
import com.WFZY.mapper.GoodstimeMapper;
import com.WFZY.mapper.OrdersMapper;
import com.WFZY.market.service.marketService;
import com.WFZY.order.service.orderService;
import com.WFZY.pojo.Banks;
import com.WFZY.pojo.GoodsExample;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodsactivity;
import com.WFZY.pojo.GoodsactivityExample;
import com.WFZY.pojo.Goodsapply;
import com.WFZY.pojo.GoodsapplyExample;
import com.WFZY.pojo.Goodstime;
import com.WFZY.pojo.GoodstimeExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

@Service("marketServiceImpl")
public class marketServiceImpl implements marketService{
	
	@Resource
	private GoodsMapper goodsMapper;

	@Resource
	private GoodstimeMapper goodstimeMapper;
	
	@Resource
	private GoodsapplyMapper goodsapplyMapper;
	
	@Resource
	private GoodsactivityMapper goodsactivityMapper;

	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<GoodsWithBLOBs> selectGoods(GoodsExample example) {
		// TODO Auto-generated method stub
		return goodsMapper.selectByExampleWithBLOBs(example);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Goodstime> selectGoodsTime(GoodstimeExample example) {
		// TODO Auto-generated method stub
		return goodstimeMapper.selectByExample(example);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int insertMarket(Goodsapply record) {
		// TODO Auto-generated method stub
		return goodsapplyMapper.insertSelective(record);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Goodsapply> selectMarket(GoodsapplyExample example) {
		// TODO Auto-generated method stub
		return goodsapplyMapper.selectByExampleWithBLOBs(example);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int cancleMarket(Goodsactivity record) {
		// TODO Auto-generated method stub
		return goodsactivityMapper.updateByPrimaryKeySelective(record);
		
	}

	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int updataApply(Goodsapply record) {
		// TODO Auto-generated method stub
		return goodsapplyMapper.updateByPrimaryKeySelective(record);
		
	}

}
