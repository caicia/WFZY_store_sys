package com.WFZY.order.service;

import java.util.List;

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

public interface orderService {

	public List<Orders> selectOrder(OrdersExample example);

	public List<Express> selectExpress(ExpressExample example);

	public int insertExpress(Orders record);

	public int updataExpress(Orders record);

	public List<Goodsactivity> selectactivity(GoodsactivityExample example);

	public List<GoodscommentWithBLOBs> selectComment(GoodscommentExample example);

	public int updateComment(GoodscommentWithBLOBs record);

	public List<GoodsWithBLOBs> selectgoods(GoodsExample example);

	public List<Orderrefunds> selectCanclegoods(OrderrefundsExample example);

	public int Cancleorder(Orderrefunds example);

}
