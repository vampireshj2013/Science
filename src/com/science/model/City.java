package com.science.model;

import java.util.ArrayList;
import java.util.List;

public class City {
	
	private int classId;
	private String className;
	private int classParentId;
	private int classType;
	private List<City> citys = new ArrayList<City>();
	
	public List<City> getCitys() {
		return citys;
	}
	public void setCitys(List<City> citys) {
		this.citys = citys;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getClassParentId() {
		return classParentId;
	}
	public void setClassParentId(int classParentId) {
		this.classParentId = classParentId;
	}
	public int getClassType() {
		return classType;
	}
	public void setClassType(int classType) {
		this.classType = classType;
	}
	

}
