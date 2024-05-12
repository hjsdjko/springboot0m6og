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


import com.dao.YundongjihuaDao;
import com.entity.YundongjihuaEntity;
import com.service.YundongjihuaService;
import com.entity.vo.YundongjihuaVO;
import com.entity.view.YundongjihuaView;

@Service("yundongjihuaService")
public class YundongjihuaServiceImpl extends ServiceImpl<YundongjihuaDao, YundongjihuaEntity> implements YundongjihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongjihuaEntity> page = this.selectPage(
                new Query<YundongjihuaEntity>(params).getPage(),
                new EntityWrapper<YundongjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongjihuaEntity> wrapper) {
		  Page<YundongjihuaView> page =new Query<YundongjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundongjihuaVO> selectListVO(Wrapper<YundongjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongjihuaVO selectVO(Wrapper<YundongjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongjihuaView> selectListView(Wrapper<YundongjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongjihuaView selectView(Wrapper<YundongjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
