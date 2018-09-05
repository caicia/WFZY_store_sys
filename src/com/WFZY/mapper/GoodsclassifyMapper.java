package com.WFZY.mapper;

import com.WFZY.pojo.Goodsclassify;
import com.WFZY.pojo.GoodsclassifyExample;
import com.WFZY.vo.GoodsclassifyVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsclassifyMapper {
	
    int countByExample(GoodsclassifyExample example);//按条件计数

    int deleteByExample(GoodsclassifyExample example);//按条件查询

    int deleteByPrimaryKey(Integer goodsclassifyid);//按主键删除

    int insert(Goodsclassify record);//插入数据

    int insertSelective(Goodsclassify record);
    
////////////////////////////////////////////////////////////    
    /**
     * 查询一级商品分类  selectOneGoodsClassifyVoByPid
     * @return
     */
    List<GoodsclassifyVo> selectOneGoodsClassifyVoByPid();
    /**
     * 查询二级商品分类  selectTwoGoodsClassifyVoByPid
     * @param example
     * @return
     */
    List<GoodsclassifyVo>  selectTwoGoodsClassifyVoByPid();
    
    /**
     * 查询三级商品分类  selectThreeGoodsClassifyVoByPid
     * @param example
     * @return
     */
    List<GoodsclassifyVo> selectThreeGoodsClassifyVoByPid();
////////////////////////////////////////////////////////////
    
  ///////////////////////////////////////////////////////////////// 
    /**
     * 查询一级商品分类  selectOneGoodsClassifyByPid
     * @return
     */
    List<Goodsclassify> selectOneGoodsClassifyByPid();
    /**
     * 查询二级商品分类  selectTwoGoodsClassifyByPid
     * @param example
     * @return
     */
    List<Goodsclassify>  selectTwoGoodsClassifyByPid();
    
    /**
     * 查询三级商品分类  selectThreeGoodsClassifyByPid
     * @param example
     * @return
     */
    List<Goodsclassify> selectThreeGoodsClassifyByPid();
/////////////////////////////////////////////////////////////////////// 
    

    List<Goodsclassify> selectByExample(GoodsclassifyExample example);// 	按条件查询

    Goodsclassify selectByPrimaryKey(Integer goodsclassifyid);//按主键查询

    int updateByExampleSelective(@Param("record") Goodsclassify record, @Param("example") GoodsclassifyExample example);

    int updateByExample(@Param("record") Goodsclassify record, @Param("example") GoodsclassifyExample example);

    int updateByPrimaryKeySelective(Goodsclassify record);

    int updateByPrimaryKey(Goodsclassify record);

    
    /**
     * 查询父类名称（通过GID）
     * @param goodsclassifyid
     * @return
     */
    Goodsclassify selectGnameByGid(Integer goodsclassifyid);
    
    /**
	 * //查询父类下面  子类的数目
	 * @param goodsclassifyid
	 * @return
	 */
	int selectChildCount(Integer goodsclassifyid);

//	/**
//	 * 搜索  商品分类
//	 * 
//	 * @return
//	 */
//	List<GoodsclassifyVo> searchGoodsClassify(String searchInput);

    
}