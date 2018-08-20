package com.WFZY.mapper;

import com.WFZY.pojo.Shopscores;
import com.WFZY.pojo.ShopscoresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopscoresMapper {
    int countByExample(ShopscoresExample example);

    int deleteByExample(ShopscoresExample example);

    int deleteByPrimaryKey(Integer scoreid);

    int insert(Shopscores record);

    int insertSelective(Shopscores record);

    List<Shopscores> selectByExample(ShopscoresExample example);

    Shopscores selectByPrimaryKey(Integer scoreid);

    int updateByExampleSelective(@Param("record") Shopscores record, @Param("example") ShopscoresExample example);

    int updateByExample(@Param("record") Shopscores record, @Param("example") ShopscoresExample example);

    int updateByPrimaryKeySelective(Shopscores record);

    int updateByPrimaryKey(Shopscores record);
}