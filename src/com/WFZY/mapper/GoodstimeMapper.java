package com.WFZY.mapper;

import com.WFZY.pojo.Goodstime;
import com.WFZY.pojo.GoodstimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodstimeMapper {
    int countByExample(GoodstimeExample example);

    int deleteByExample(GoodstimeExample example);

    int deleteByPrimaryKey(Integer timeid);

    int insert(Goodstime record);

    int insertSelective(Goodstime record);

    List<Goodstime> selectByExample(GoodstimeExample example);

    Goodstime selectByPrimaryKey(Integer timeid);

    int updateByExampleSelective(@Param("record") Goodstime record, @Param("example") GoodstimeExample example);

    int updateByExample(@Param("record") Goodstime record, @Param("example") GoodstimeExample example);

    int updateByPrimaryKeySelective(Goodstime record);

    int updateByPrimaryKey(Goodstime record);
}