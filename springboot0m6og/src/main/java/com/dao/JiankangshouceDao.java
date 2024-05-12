package com.dao;

import com.entity.JiankangshouceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangshouceVO;
import com.entity.view.JiankangshouceView;


/**
 * 健康手册
 * 
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public interface JiankangshouceDao extends BaseMapper<JiankangshouceEntity> {
	
	List<JiankangshouceVO> selectListVO(@Param("ew") Wrapper<JiankangshouceEntity> wrapper);
	
	JiankangshouceVO selectVO(@Param("ew") Wrapper<JiankangshouceEntity> wrapper);
	
	List<JiankangshouceView> selectListView(@Param("ew") Wrapper<JiankangshouceEntity> wrapper);

	List<JiankangshouceView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangshouceEntity> wrapper);
	
	JiankangshouceView selectView(@Param("ew") Wrapper<JiankangshouceEntity> wrapper);
	

}
