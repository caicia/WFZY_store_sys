package com.WFZY.mapper;

import com.WFZY.pojo.Goodscomment;
import com.WFZY.pojo.GoodscommentExample;
import com.WFZY.pojo.GoodscommentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscommentMapper {
    int countByExample(GoodscommentExample example);

    int deleteByExample(GoodscommentExample example);

    int deleteByPrimaryKey(Integer commentid);

    int insert(GoodscommentWithBLOBs record);

    int insertSelective(GoodscommentWithBLOBs record);

    List<GoodscommentWithBLOBs> selectByExampleWithBLOBs(GoodscommentExample example);

    List<Goodscomment> selectByExample(GoodscommentExample example);

    GoodscommentWithBLOBs selectByPrimaryKey(Integer commentid);

    int updateByExampleSelective(@Param("record") GoodscommentWithBLOBs record, @Param("example") GoodscommentExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodscommentWithBLOBs record, @Param("example") GoodscommentExample example);

    int updateByExample(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByPrimaryKeySelective(GoodscommentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodscommentWithBLOBs record);

    int updateByPrimaryKey(Goodscomment record);
}