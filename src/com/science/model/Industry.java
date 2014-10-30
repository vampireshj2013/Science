package com.science.model;

import java.util.ArrayList;
import java.util.List;


/**
 * 行业 模型
 * @author WHJ
 *
 */
public class Industry {
	private int industryId;
	private String industryName;
	private String industryLevel;
	private List<Industry> childs = new ArrayList<Industry>();
	public int getIndustryId() {
		return industryId;
	}
	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getIndustryLevel() {
		return industryLevel;
	}
	public void setIndustryLevel(String industryLevel) {
		this.industryLevel = industryLevel;
	}
	public List<Industry> getChilds() {
		return childs;
	}
	public void setChilds(List<Industry> childs) {
		this.childs = childs;
	}
	

}
