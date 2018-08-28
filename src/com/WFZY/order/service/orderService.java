package com.WFZY.order.service;

import java.util.List;

import com.WFZY.pojo.Express;
import com.WFZY.pojo.ExpressExample;
import com.WFZY.pojo.Goodsactivity;
import com.WFZY.pojo.GoodsactivityExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

public interface orderService {

	public List<Orders> selectOrder(OrdersExample example);

	public List<Express> selectExpress(ExpressExample example);

	public int insertExpress(Orders record);

	public int updataExpress(Orders record);

	public List<Goodsactivity> selectactivity(GoodsactivityExample example);

}
