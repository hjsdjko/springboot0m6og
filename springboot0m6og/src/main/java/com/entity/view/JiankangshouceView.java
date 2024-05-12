package com.entity.view;

import com.entity.JiankangshouceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康手册
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
@TableName("jiankangshouce")
public class JiankangshouceView  extends JiankangshouceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangshouceView(){
	}
 
 	public JiankangshouceView(JiankangshouceEntity jiankangshouceEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangshouceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
