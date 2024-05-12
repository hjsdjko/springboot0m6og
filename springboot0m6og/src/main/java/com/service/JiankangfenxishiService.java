package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangfenxishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangfenxishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangfenxishiView;


/**
 * 健康分析师
 *
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public interface JiankangfenxishiService extends IService<JiankangfenxishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangfenxishiVO> selectListVO(Wrapper<JiankangfenxishiEntity> wrapper);
   	
   	JiankangfenxishiVO selectVO(@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);
   	
   	List<JiankangfenxishiView> selectListView(Wrapper<JiankangfenxishiEntity> wrapper);
   	
   	JiankangfenxishiView selectView(@Param("ew") Wrapper<JiankangfenxishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangfenxishiEntity> wrapper);
   	

}

