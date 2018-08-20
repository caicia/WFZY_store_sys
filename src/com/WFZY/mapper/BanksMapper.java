package com.WFZY.mapper;

import com.WFZY.pojo.Banks;
import com.WFZY.pojo.BanksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanksMapper {
    int countByExample(BanksExample example);

    int deleteByExample(BanksExample example);

    int deleteByPrimaryKey(Integer bankid);

    int insert(Banks record);

    int insertSelective(Banks record);

    List<Banks> selectByExample(BanksExample example);

    Banks selectByPrimaryKey(Integer bankid);

    int updateByExampleSelective(@Param("record") Banks record, @Param("example") BanksExample example);

    int updateByExample(@Param("record") Banks record, @Param("example") BanksExample example);

    int updateByPrimaryKeySelective(Banks record);

    int updateByPrimaryKey(Banks record);
}