package com.WFZY.order.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.WFZY.mapper.ExpressMapper;
import com.WFZY.mapper.GoodsMapper;
import com.WFZY.mapper.GoodsactivityMapper;
import com.WFZY.mapper.GoodscommentMapper;
import com.WFZY.mapper.OrderrefundsMapper;
import com.WFZY.mapper.OrdersMapper;
import com.WFZY.order.service.orderService;
import com.WFZY.pojo.Banks;
import com.WFZY.pojo.Express;
import com.WFZY.pojo.ExpressExample;
import com.WFZY.pojo.GoodsExample;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodsactivity;
import com.WFZY.pojo.GoodsactivityExample;
import com.WFZY.pojo.Goodscomment;
import com.WFZY.pojo.GoodscommentExample;
import com.WFZY.pojo.GoodscommentWithBLOBs;
import com.WFZY.pojo.Orderrefunds;
import com.WFZY.pojo.OrderrefundsExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

@Service("orderServiceImpl")
public class orderServiceImpl implements orderService{
	
	@Resource
	private OrdersMapper ordersMapper;
	
	@Resource
	private ExpressMapper expressMapper;
	
	@Resource
	private GoodsactivityMapper goodsactivityMapper;
	
	@Resource
	private GoodscommentMapper goodscommentMapper;
	
	@Resource
	private GoodsMapper goodsMapper;
	
	@Resource
	private OrderrefundsMapper orderrefundsMapper;
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Orders> selectOrder(OrdersExample example) {
		// TODO Auto-generated method stub
		return ordersMapper.selectByExample(example);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Express> selectExpress(ExpressExample example) {
		// TODO Auto-generated method stub
		return expressMapper.selectByExample(example);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int insertExpress(Orders record) {
		// TODO Auto-generated method stub
		return ordersMapper.insertSelective(record);
		
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int updataExpress(Orders record) {
		// TODO Auto-generated method stub
		return ordersMapper.updateByPrimaryKeySelective(record);
		
	}

	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Goodsactivity> selectactivity(GoodsactivityExample example) {
		// TODO Auto-generated method stub
		return goodsactivityMapper.selectByExample(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<GoodscommentWithBLOBs> selectComment(GoodscommentExample example) {
		// TODO Auto-generated method stub
		return goodscommentMapper.selectByExampleWithBLOBs(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int updateComment(GoodscommentWithBLOBs record) {
		// TODO Auto-generated method stub
		return goodscommentMapper.updateByPrimaryKeySelective(record);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<GoodsWithBLOBs> selectgoods(GoodsExample example) {
		// TODO Auto-generated method stub
		return goodsMapper.selectByExampleWithBLOBs(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Orderrefunds> selectCanclegoods(OrderrefundsExample example) {
		// TODO Auto-generated method stub
		return orderrefundsMapper.selectByExample(example);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public int Cancleorder(Orderrefunds example) {
		// TODO Auto-generated method stub
		int flag = orderrefundsMapper.updateByPrimaryKeySelective(example);
		if(flag == 1 && example.getRefundstatus() == 1)
		{
			Orders order = new Orders();
			order.setOrderid(example.getOrderid());
			order.setOrderstatus((byte)-1);
			flag = ordersMapper.updateByPrimaryKeySelective(order);
		}
		return flag;
	}
}
