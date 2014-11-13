package com.science.model;

import java.util.Date;

public class TecProblem {
	private int tecProblemId;
	private Industry industry;//研究领域
	private User user;
	private Shop shop;
	private float expectMoney;//预投入资金
	private String head;//标题
	private String endTime;//截止时间
	private String searchKey;//关键词
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;
	private String attachment; //附件
	public int getTecProblemId() {
		return tecProblemId;
	}
	public void setTecProblemId(int tecProblemId) {
		this.tecProblemId = tecProblemId;
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
	public float getExpectMoney() {
		return expectMoney;
	}
	public void setExpectMoney(float expectMoney) {
		this.expectMoney = expectMoney;
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
