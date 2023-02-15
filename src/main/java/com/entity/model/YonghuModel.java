package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author
 * @email
 */
public class YonghuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String xingming;
	private String mima;
	private String xingbie;
	private String dianhua;
	private String youxiang;
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getXingming() {
		return xingming;
	}
	public void setMima(String mima) {
		this.mima = mima;
	}
	public String getMima() {
		return mima;
	}
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getXingbie() {
		return xingbie;
	}
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	public String getDianhua() {
		return dianhua;
	}

	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}

	public String getYouxiang() {
		return youxiang;
	}

}
