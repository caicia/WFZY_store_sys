package com.WFZY.market.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.WFZY.mapper.OrdersMapper;
import com.WFZY.order.service.orderService;
import com.WFZY.pojo.Banks;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

@Service("marketServiceImpl")
public class marketServiceImpl implements orderService{
	
	@Resource
	private OrdersMapper ordersMapper;
	
	@Transactional(isolation = Isolation.DEFAULT, readOnly = false, propagation = Propagation.REQUIRED)

	@Override
	public List<Orders> selectOrder(OrdersExample example) {
		// TODO Auto-generated method stub
		return ordersMapper.selectByExample(example);
		
	}

}
