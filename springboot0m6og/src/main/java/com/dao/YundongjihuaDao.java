package com.dao;

import com.entity.YundongjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundongjihuaVO;
import com.entity.view.YundongjihuaView;


/**
 * 运动计划
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public interface YundongjihuaDao extends BaseMapper<YundongjihuaEntity> {
	
	List<YundongjihuaVO> selectListVO(@Param("ew") Wrapper<YundongjihuaEntity> wrapper);
	
	YundongjihuaVO selectVO(@Param("ew") Wrapper<YundongjihuaEntity> wrapper);
	
	List<YundongjihuaView> selectListView(@Param("ew") Wrapper<YundongjihuaEntity> wrapper);

	List<YundongjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<YundongjihuaEntity> wrapper);
	
	YundongjihuaView selectView(@Param("ew") Wrapper<YundongjihuaEntity> wrapper);
	

}
