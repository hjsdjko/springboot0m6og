package com.dao;

import com.entity.JiankangyinshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangyinshiVO;
import com.entity.view.JiankangyinshiView;


/**
 * 健康饮食
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public interface JiankangyinshiDao extends BaseMapper<JiankangyinshiEntity> {
	
	List<JiankangyinshiVO> selectListVO(@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);
	
	JiankangyinshiVO selectVO(@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);
	
	List<JiankangyinshiView> selectListView(@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);

	List<JiankangyinshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);
	
	JiankangyinshiView selectView(@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);
	

}
