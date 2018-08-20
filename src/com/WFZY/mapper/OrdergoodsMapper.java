package com.WFZY.mapper;

import com.WFZY.pojo.Ordergoods;
import com.WFZY.pojo.OrdergoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdergoodsMapper {
    int countByExample(OrdergoodsExample example);

    int deleteByExample(OrdergoodsExample example);

    int deleteByPrimaryKey(Integer ordergoodsid);

    int insert(Ordergoods record);

    int insertSelective(Ordergoods record);

    List<Ordergoods> selectByExample(OrdergoodsExample example);

    Ordergoods selectByPrimaryKey(Integer ordergoodsid);

    int updateByExampleSelective(@Param("record") Ordergoods record, @Param("example") OrdergoodsExample example);

    int updateByExample(@Param("record") Ordergoods record, @Param("example") OrdergoodsExample example);

    int updateByPrimaryKeySelective(Ordergoods record);

    int updateByPrimaryKey(Ordergoods record);
}