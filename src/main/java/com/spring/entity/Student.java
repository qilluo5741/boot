package com.spring.entity;
/**
 * 测试，学生
 * @author Administrator
 */
public class Student {
	private String stuId;
	private String stuName;
	private String stuGender;
	private ClassInfo cls;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	public ClassInfo getCls() {
		return cls;
	}
	public void setCls(ClassInfo cls) {
		this.cls = cls;
	}
	public Student(String stuId, String stuName, String stuGender, ClassInfo cls) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuGender = stuGender;
		this.cls = cls;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
