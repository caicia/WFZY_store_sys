package com.WFZY.order.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.WFZY.mapper.ExpressMapper;
import com.WFZY.mapper.OrdersMapper;
import com.WFZY.order.service.orderService;
import com.WFZY.pojo.Banks;
import com.WFZY.pojo.Express;
import com.WFZY.pojo.ExpressExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

@Service("orderServiceImpl")
public class orderServiceImpl implements orderService{
	
	@Resource
	private OrdersMapper ordersMapper;
	
	@Resource
	private ExpressMapper expressMapper;
	
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


}
