package com.WFZY.mapper;

import com.WFZY.pojo.Shoppingcarts;
import com.WFZY.pojo.ShoppingcartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcartsMapper {
    int countByExample(ShoppingcartsExample example);

    int deleteByExample(ShoppingcartsExample example);

    int deleteByPrimaryKey(Integer shoppingcarts);

    int insert(Shoppingcarts record);

    int insertSelective(Shoppingcarts record);

    List<Shoppingcarts> selectByExample(ShoppingcartsExample example);

    Shoppingcarts selectByPrimaryKey(Integer shoppingcarts);

    int updateByExampleSelective(@Param("record") Shoppingcarts record, @Param("example") ShoppingcartsExample example);

    int updateByExample(@Param("record") Shoppingcarts record, @Param("example") ShoppingcartsExample example);

    int updateByPrimaryKeySelective(Shoppingcarts record);

    int updateByPrimaryKey(Shoppingcarts record);
}