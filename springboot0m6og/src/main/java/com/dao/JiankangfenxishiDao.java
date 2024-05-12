package com.dao;

import com.entity.JiankangfenxishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangfenxishiVO;
import com.entity.view.JiankangfenxishiView;


/**
 * 健康分析师
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public interface JiankangfenxishiDao extends BaseMapper<JiankangfenxishiEntity> {
	
	List<JiankangfenxishiVO> selectListVO(@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);
	
	JiankangfenxishiVO selectVO(@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);
	
	List<JiankangfenxishiView> selectListView(@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);

	List<JiankangfenxishiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);
	
	JiankangfenxishiView selectView(@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);
	

}
