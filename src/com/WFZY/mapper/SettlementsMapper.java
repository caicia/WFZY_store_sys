package com.WFZY.mapper;

import com.WFZY.pojo.Settlements;
import com.WFZY.pojo.SettlementsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettlementsMapper {
    int countByExample(SettlementsExample example);

    int deleteByExample(SettlementsExample example);

    int deleteByPrimaryKey(Integer settlementid);

    int insert(Settlements record);

    int insertSelective(Settlements record);

    List<Settlements> selectByExample(SettlementsExample example);

    Settlements selectByPrimaryKey(Integer settlementid);

    int updateByExampleSelective(@Param("record") Settlements record, @Param("example") SettlementsExample example);

    int updateByExample(@Param("record") Settlements record, @Param("example") SettlementsExample example);

    int updateByPrimaryKeySelective(Settlements record);

    int updateByPrimaryKey(Settlements record);
}