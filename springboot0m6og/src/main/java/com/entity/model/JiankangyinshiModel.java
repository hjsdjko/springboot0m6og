package com.entity.model;

import com.entity.JiankangyinshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康饮食
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public class JiankangyinshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 早餐搭配
	 */
	
	private String zaocandapei;
		
	/**
	 * 午餐搭配
	 */
	
	private String wucandapei;
		
	/**
	 * 晚餐搭配
	 */
	
	private String wancandapei;
		
	/**
	 * 适合人群
	 */
	
	private String shiherenqun;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 健康师账号
	 */
	
	private String jiankangshizhanghao;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：早餐搭配
	 */
	 
	public void setZaocandapei(String zaocandapei) {
		this.zaocandapei = zaocandapei;
	}
	
	/**
	 * 获取：早餐搭配
	 */
	public String getZaocandapei() {
		return zaocandapei;
	}
				
	
	/**
	 * 设置：午餐搭配
	 */
	 
	public void setWucandapei(String wucandapei) {
		this.wucandapei = wucandapei;
	}
	
	/**
	 * 获取：午餐搭配
	 */
	public String getWucandapei() {
		return wucandapei;
	}
				
	
	/**
	 * 设置：晚餐搭配
	 */
	 
	public void setWancandapei(String wancandapei) {
		this.wancandapei = wancandapei;
	}
	
	/**
	 * 获取：晚餐搭配
	 */
	public String getWancandapei() {
		return wancandapei;
	}
				
	
	/**
	 * 设置：适合人群
	 */
	 
	public void setShiherenqun(String shiherenqun) {
		this.shiherenqun = shiherenqun;
	}
	
	/**
	 * 获取：适合人群
	 */
	public String getShiherenqun() {
		return shiherenqun;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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
