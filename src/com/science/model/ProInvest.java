package com.science.model;

import java.util.Date;

public class ProInvest {
	private int proInvestId;
	private Industry industry;//投资领域
	private User user;
	private Shop shop;
	private City city;//投资区域
	private String head;//标题
	private float investMoney;//投资额度
	private Invest invest;//投资方式
	private String endTime;//截止时间
	private String searchKey;//关键词
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;
	private String attachment; //附件
	public int getProInvestId() {
		return proInvestId;
	}
	public void setProInvestId(int proInvestId) {
		this.proInvestId = proInvestId;
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
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public float getInvestMoney() {
		return investMoney;
	}
	public void setInvestMoney(float investMoney) {
		this.investMoney = investMoney;
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
	public Invest getInvest() {
		return invest;
	}
	public void setInvest(Invest invest) {
		this.invest = invest;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	
	

}
