package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiankangfenxishiDao;
import com.entity.JiankangfenxishiEntity;
import com.service.JiankangfenxishiService;
import com.entity.vo.JiankangfenxishiVO;
import com.entity.view.JiankangfenxishiView;

@Service("jiankangfenxishiService")
public class JiankangfenxishiServiceImpl extends ServiceImpl<JiankangfenxishiDao, JiankangfenxishiEntity> implements JiankangfenxishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangfenxishiEntity> page = this.selectPage(
                new Query<JiankangfenxishiEntity>(params).getPage(),
                new EntityWrapper<JiankangfenxishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangfenxishiEntity> wrapper) {
		  Page<JiankangfenxishiView> page =new Query<JiankangfenxishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangfenxishiVO> selectListVO(Wrapper<JiankangfenxishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangfenxishiVO selectVO(Wrapper<JiankangfenxishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangfenxishiView> selectListView(Wrapper<JiankangfenxishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangfenxishiView selectView(Wrapper<JiankangfenxishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
