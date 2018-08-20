package com.WFZY.mapper;

import com.WFZY.pojo.Orderrefunds;
import com.WFZY.pojo.OrderrefundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderrefundsMapper {
    int countByExample(OrderrefundsExample example);

    int deleteByExample(OrderrefundsExample example);

    int deleteByPrimaryKey(Integer orderrefundsid);

    int insert(Orderrefunds record);

    int insertSelective(Orderrefunds record);

    List<Orderrefunds> selectByExample(OrderrefundsExample example);

    Orderrefunds selectByPrimaryKey(Integer orderrefundsid);

    int updateByExampleSelective(@Param("record") Orderrefunds record, @Param("example") OrderrefundsExample example);

    int updateByExample(@Param("record") Orderrefunds record, @Param("example") OrderrefundsExample example);

    int updateByPrimaryKeySelective(Orderrefunds record);

    int updateByPrimaryKey(Orderrefunds record);
}