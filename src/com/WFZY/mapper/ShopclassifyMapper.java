package com.WFZY.mapper;

import com.WFZY.pojo.Shopclassify;
import com.WFZY.pojo.ShopclassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopclassifyMapper {
    int countByExample(ShopclassifyExample example);

    int deleteByExample(ShopclassifyExample example);

    int deleteByPrimaryKey(Integer shopclassifyid);

    int insert(Shopclassify record);

    int insertSelective(Shopclassify record);

    List<Shopclassify> selectByExample(ShopclassifyExample example);

    Shopclassify selectByPrimaryKey(Integer shopclassifyid);

    int updateByExampleSelective(@Param("record") Shopclassify record, @Param("example") ShopclassifyExample example);

    int updateByExample(@Param("record") Shopclassify record, @Param("example") ShopclassifyExample example);

    int updateByPrimaryKeySelective(Shopclassify record);

    int updateByPrimaryKey(Shopclassify record);
}