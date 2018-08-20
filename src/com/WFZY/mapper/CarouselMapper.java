package com.WFZY.mapper;

import com.WFZY.pojo.Carousel;
import com.WFZY.pojo.CarouselExample;
import com.WFZY.pojo.CarouselWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarouselMapper {
    int countByExample(CarouselExample example);

    int deleteByExample(CarouselExample example);

    int deleteByPrimaryKey(Integer carouselid);

    int insert(CarouselWithBLOBs record);

    int insertSelective(CarouselWithBLOBs record);

    List<CarouselWithBLOBs> selectByExampleWithBLOBs(CarouselExample example);

    List<Carousel> selectByExample(CarouselExample example);

    CarouselWithBLOBs selectByPrimaryKey(Integer carouselid);

    int updateByExampleSelective(@Param("record") CarouselWithBLOBs record, @Param("example") CarouselExample example);

    int updateByExampleWithBLOBs(@Param("record") CarouselWithBLOBs record, @Param("example") CarouselExample example);

    int updateByExample(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByPrimaryKeySelective(CarouselWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CarouselWithBLOBs record);

    int updateByPrimaryKey(Carousel record);
}