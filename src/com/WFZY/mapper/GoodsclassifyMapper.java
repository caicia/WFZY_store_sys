package com.WFZY.mapper;

import com.WFZY.pojo.Goodsclassify;
import com.WFZY.pojo.GoodsclassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsclassifyMapper {
    int countByExample(GoodsclassifyExample example);

    int deleteByExample(GoodsclassifyExample example);

    int deleteByPrimaryKey(Integer goodsclassifyid);

    int insert(Goodsclassify record);

    int insertSelective(Goodsclassify record);

    List<Goodsclassify> selectByExample(GoodsclassifyExample example);

    Goodsclassify selectByPrimaryKey(Integer goodsclassifyid);

    int updateByExampleSelective(@Param("record") Goodsclassify record, @Param("example") GoodsclassifyExample example);

    int updateByExample(@Param("record") Goodsclassify record, @Param("example") GoodsclassifyExample example);

    int updateByPrimaryKeySelective(Goodsclassify record);

    int updateByPrimaryKey(Goodsclassify record);
}