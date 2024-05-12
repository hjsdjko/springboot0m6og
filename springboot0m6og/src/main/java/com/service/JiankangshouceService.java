package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangshouceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangshouceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangshouceView;


/**
 * 健康手册
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public interface JiankangshouceService extends IService<JiankangshouceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangshouceVO> selectListVO(Wrapper<JiankangshouceEntity> wrapper);
   	
   	JiankangshouceVO selectVO(@Param("ew") Wrapper<JiankangshouceEntity> wrapper);
   	
   	List<JiankangshouceView> selectListView(Wrapper<JiankangshouceEntity> wrapper);
   	
   	JiankangshouceView selectView(@Param("ew") Wrapper<JiankangshouceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangshouceEntity> wrapper);
   	

}

