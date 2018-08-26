package com.WFZY.mapper;

import com.WFZY.pojo.Goodsapply;
import com.WFZY.pojo.GoodsapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsapplyMapper {
    int countByExample(GoodsapplyExample example);

    int deleteByExample(GoodsapplyExample example);

    int deleteByPrimaryKey(Integer goodsapplyid);

    int insert(Goodsapply record);

    int insertSelective(Goodsapply record);

    List<Goodsapply> selectByExampleWithBLOBs(GoodsapplyExample example);

    List<Goodsapply> selectByExample(GoodsapplyExample example);

    Goodsapply selectByPrimaryKey(Integer goodsapplyid);

    int updateByExampleSelective(@Param("record") Goodsapply record, @Param("example") GoodsapplyExample example);

    int updateByExampleWithBLOBs(@Param("record") Goodsapply record, @Param("example") GoodsapplyExample example);

    int updateByExample(@Param("record") Goodsapply record, @Param("example") GoodsapplyExample example);

    int updateByPrimaryKeySelective(Goodsapply record);

    int updateByPrimaryKeyWithBLOBs(Goodsapply record);

    int updateByPrimaryKey(Goodsapply record);
}