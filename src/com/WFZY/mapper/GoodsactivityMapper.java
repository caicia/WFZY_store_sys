package com.WFZY.mapper;

import com.WFZY.pojo.Goodsactivity;
import com.WFZY.pojo.GoodsactivityExample;
import com.WFZY.pojo.GoodsactivityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsactivityMapper {
    int countByExample(GoodsactivityExample example);

    int deleteByExample(GoodsactivityExample example);

    int deleteByPrimaryKey(GoodsactivityKey key);

    int insert(Goodsactivity record);

    int insertSelective(Goodsactivity record);

    List<Goodsactivity> selectByExample(GoodsactivityExample example);

    Goodsactivity selectByPrimaryKey(GoodsactivityKey key);

    int updateByExampleSelective(@Param("record") Goodsactivity record, @Param("example") GoodsactivityExample example);

    int updateByExample(@Param("record") Goodsactivity record, @Param("example") GoodsactivityExample example);

    int updateByPrimaryKeySelective(Goodsactivity record);

    int updateByPrimaryKey(Goodsactivity record);
}