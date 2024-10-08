package com.entity.view;

import com.entity.JiankangyinshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康饮食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
@TableName("jiankangyinshi")
public class JiankangyinshiView  extends JiankangyinshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangyinshiView(){
	}
 
 	public JiankangyinshiView(JiankangyinshiEntity jiankangyinshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangyinshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
