package com.science.model;

import java.util.Date;

public class ProFinance {
	private int proFinanceId;
	private Industry industry;//融资领域
	private User user;
	private Shop shop;
	private float financeMoney;//融资额度
	private String head;//标题
	private Finance finance;//融资方式
	private String endTime;//截止时间
	private String searchKey;//关键词
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;	
	private String attachment; //附件
	public int getProFinanceId() {
		return proFinanceId;
	}
	public void setProFinanceId(int proFinanceId) {
		this.proFinanceId = proFinanceId;
	}
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public float getFinanceMoney() {
		return financeMoney;
	}
	public void setFinanceMoney(float financeMoney) {
		this.financeMoney = financeMoney;
	}
	
	public Finance getFinance() {
		return finance;
	}
	public void setFinance(Finance finance) {
		this.finance = finance;
	}
	
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public int getAttentionNum() {
		return attentionNum;
	}
	public void setAttentionNum(int attentionNum) {
		this.attentionNum = attentionNum;
	}
	public int getConsultationNum() {
		return consultationNum;
	}
	public void setConsultationNum(int consultationNum) {
		this.consultationNum = consultationNum;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	
	
	

}
