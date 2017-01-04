package com.spring.entity;

public class ClassInfo {
	private String clsId;
	private String clsName;
	public String getClsId() {
		return clsId;
	}
	public void setClsId(String clsId) {
		this.clsId = clsId;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public ClassInfo(String clsId) {
		super();
		this.clsId = clsId;
	}
	public ClassInfo(String clsId, String clsName) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
	}
	public ClassInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
