package com.WFZY.mapper;

import com.WFZY.pojo.Limittimes;
import com.WFZY.pojo.LimittimesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimittimesMapper {
    int countByExample(LimittimesExample example);

    int deleteByExample(LimittimesExample example);

    int deleteByPrimaryKey(Integer limittimitid);

    int insert(Limittimes record);

    int insertSelective(Limittimes record);

    List<Limittimes> selectByExample(LimittimesExample example);

    Limittimes selectByPrimaryKey(Integer limittimitid);

    int updateByExampleSelective(@Param("record") Limittimes record, @Param("example") LimittimesExample example);

    int updateByExample(@Param("record") Limittimes record, @Param("example") LimittimesExample example);

    int updateByPrimaryKeySelective(Limittimes record);

    int updateByPrimaryKey(Limittimes record);
}