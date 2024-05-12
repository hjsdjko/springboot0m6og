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


import com.dao.JiankangshouceDao;
import com.entity.JiankangshouceEntity;
import com.service.JiankangshouceService;
import com.entity.vo.JiankangshouceVO;
import com.entity.view.JiankangshouceView;

@Service("jiankangshouceService")
public class JiankangshouceServiceImpl extends ServiceImpl<JiankangshouceDao, JiankangshouceEntity> implements JiankangshouceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangshouceEntity> page = this.selectPage(
                new Query<JiankangshouceEntity>(params).getPage(),
                new EntityWrapper<JiankangshouceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangshouceEntity> wrapper) {
		  Page<JiankangshouceView> page =new Query<JiankangshouceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangshouceVO> selectListVO(Wrapper<JiankangshouceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangshouceVO selectVO(Wrapper<JiankangshouceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangshouceView> selectListView(Wrapper<JiankangshouceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangshouceView selectView(Wrapper<JiankangshouceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
