package com.entity.view;

import com.entity.JiankangfenxishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康分析师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
@TableName("jiankangfenxishi")
public class JiankangfenxishiView  extends JiankangfenxishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangfenxishiView(){
	}
 
 	public JiankangfenxishiView(JiankangfenxishiEntity jiankangfenxishiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangfenxishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}