package com.WFZY.order.service;

import java.util.List;

import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

public interface orderService {

	public List<Orders> selectOrder(OrdersExample example);

}
