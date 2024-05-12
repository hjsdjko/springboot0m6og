package com.entity.model;

import com.entity.YundongjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 运动计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-09 21:32:54
 */
public class YundongjihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 运动类型
	 */
	
	private String yundongleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 运动强度
	 */
	
	private String yundongqiangdu;
		
	/**
	 * 运动周期
	 */
	
	private String yundongzhouqi;
		
	/**
	 * 运动备注
	 */
	
	private String yundongbeizhu;
		
	/**
	 * 运动目标
	 */
	
	private String yundongmubiao;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 计划时长
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jihuashizhang;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：运动类型
	 */
	 
	public void setYundongleixing(String yundongleixing) {
		this.yundongleixing = yundongleixing;
	}
	
	/**
	 * 获取：运动类型
	 */
	public String getYundongleixing() {
		return yundongleixing;
	}
				
	
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
	 * 设置：运动强度
	 */
	 
	public void setYundongqiangdu(String yundongqiangdu) {
		this.yundongqiangdu = yundongqiangdu;
	}
	
	/**
	 * 获取：运动强度
	 */
	public String getYundongqiangdu() {
		return yundongqiangdu;
	}
				
	
	/**
	 * 设置：运动周期
	 */
	 
	public void setYundongzhouqi(String yundongzhouqi) {
		this.yundongzhouqi = yundongzhouqi;
	}
	
	/**
	 * 获取：运动周期
	 */
	public String getYundongzhouqi() {
		return yundongzhouqi;
	}
				
	
	/**
	 * 设置：运动备注
	 */
	 
	public void setYundongbeizhu(String yundongbeizhu) {
		this.yundongbeizhu = yundongbeizhu;
	}
	
	/**
	 * 获取：运动备注
	 */
	public String getYundongbeizhu() {
		return yundongbeizhu;
	}
				
	
	/**
	 * 设置：运动目标
	 */
	 
	public void setYundongmubiao(String yundongmubiao) {
		this.yundongmubiao = yundongmubiao;
	}
	
	/**
	 * 获取：运动目标
	 */
	public String getYundongmubiao() {
		return yundongmubiao;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：计划时长
	 */
	 
	public void setJihuashizhang(Date jihuashizhang) {
		this.jihuashizhang = jihuashizhang;
	}
	
	/**
	 * 获取：计划时长
	 */
	public Date getJihuashizhang() {
		return jihuashizhang;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
