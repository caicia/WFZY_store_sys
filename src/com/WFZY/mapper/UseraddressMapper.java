package com.WFZY.mapper;

import com.WFZY.pojo.Useraddress;
import com.WFZY.pojo.UseraddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseraddressMapper {
    int countByExample(UseraddressExample example);

    int deleteByExample(UseraddressExample example);

    int deleteByPrimaryKey(Integer addressid);

    int insert(Useraddress record);

    int insertSelective(Useraddress record);

    List<Useraddress> selectByExample(UseraddressExample example);

    Useraddress selectByPrimaryKey(Integer addressid);

    int updateByExampleSelective(@Param("record") Useraddress record, @Param("example") UseraddressExample example);

    int updateByExample(@Param("record") Useraddress record, @Param("example") UseraddressExample example);

    int updateByPrimaryKeySelective(Useraddress record);

    int updateByPrimaryKey(Useraddress record);
}