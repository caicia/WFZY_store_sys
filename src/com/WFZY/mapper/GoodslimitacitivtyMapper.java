package com.WFZY.mapper;

import com.WFZY.pojo.Goodslimitacitivty;
import com.WFZY.pojo.GoodslimitacitivtyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodslimitacitivtyMapper {
    int countByExample(GoodslimitacitivtyExample example);

    int deleteByExample(GoodslimitacitivtyExample example);

    int insert(Goodslimitacitivty record);

    int insertSelective(Goodslimitacitivty record);

    List<Goodslimitacitivty> selectByExample(GoodslimitacitivtyExample example);

    int updateByExampleSelective(@Param("record") Goodslimitacitivty record, @Param("example") GoodslimitacitivtyExample example);

    int updateByExample(@Param("record") Goodslimitacitivty record, @Param("example") GoodslimitacitivtyExample example);
}