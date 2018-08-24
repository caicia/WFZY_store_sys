package com.WFZY.mapper;

import com.WFZY.pojo.Shopsexpress;
import com.WFZY.pojo.ShopsexpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopsexpressMapper {
    int countByExample(ShopsexpressExample example);

    int deleteByExample(ShopsexpressExample example);

    int deleteByPrimaryKey(Integer scoreid);

    int insert(Shopsexpress record);

    int insertSelective(Shopsexpress record);

    List<Shopsexpress> selectByExample(ShopsexpressExample example);

    Shopsexpress selectByPrimaryKey(Integer scoreid);

    int updateByExampleSelective(@Param("record") Shopsexpress record, @Param("example") ShopsexpressExample example);

    int updateByExample(@Param("record") Shopsexpress record, @Param("example") ShopsexpressExample example);

    int updateByPrimaryKeySelective(Shopsexpress record);

    int updateByPrimaryKey(Shopsexpress record);
}