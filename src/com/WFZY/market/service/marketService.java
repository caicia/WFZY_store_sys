package com.WFZY.market.service;

import java.util.List;

import com.WFZY.pojo.GoodsExample;
import com.WFZY.pojo.GoodsWithBLOBs;
import com.WFZY.pojo.Goodsapply;
import com.WFZY.pojo.GoodsapplyExample;
import com.WFZY.pojo.Goodstime;
import com.WFZY.pojo.GoodstimeExample;
import com.WFZY.pojo.Orders;
import com.WFZY.pojo.OrdersExample;

public interface marketService {

	public List<GoodsWithBLOBs> selectGoods(GoodsExample example);

	public List<Goodstime> selectGoodsTime(GoodstimeExample example);

	public int insertMarket(Goodsapply record);

	public List<Goodsapply> selectMarket(GoodsapplyExample example);

	

}
