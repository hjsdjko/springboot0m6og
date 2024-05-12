package com.entity.vo;

import com.entity.JiankangshouceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康手册
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public class JiankangshouceVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 帮助内容
	 */
	
	private String bangzhuneirong;
		
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 适用人群
	 */
	
	private String shiyongrenqun;
		
	/**
	 * 健康师账号
	 */
	
	private String jiankangshizhanghao;
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：帮助内容
	 */
	 
	public void setBangzhuneirong(String bangzhuneirong) {
		this.bangzhuneirong = bangzhuneirong;
	}
	
	/**
	 * 获取：帮助内容
	 */
	public String getBangzhuneirong() {
		return bangzhuneirong;
	}
				
	
	/**
	 * 设置：标签
	 */
	 
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：适用人群
	 */
	 
	public void setShiyongrenqun(String shiyongrenqun) {
		this.shiyongrenqun = shiyongrenqun;
	}
	
	/**
	 * 获取：适用人群
	 */
	public String getShiyongrenqun() {
		return shiyongrenqun;
	}
				
	
	/**
	 * 设置：健康师账号
	 */
	 
	public void setJiankangshizhanghao(String jiankangshizhanghao) {
		this.jiankangshizhanghao = jiankangshizhanghao;
	}
	
	/**
	 * 获取：健康师账号
	 */
	public String getJiankangshizhanghao() {
		return jiankangshizhanghao;
	}
			
}
