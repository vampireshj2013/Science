package com.science.model;

public class PatentBuy {
	private int patentBuyId;
	private BuyType buyType;//购买方式
	private Industry industry;//所属行业
	private User user;
	private Shop shop;
	private Patent patent;
	private String head;//标题
	private double expectMoney;//预期投资额
	private String searchKey;//关键词
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;
	private String attachment; //附件
	public int getPatentBuyId() {
		return patentBuyId;
	}
	public void setPatentBuyId(int patentBuyId) {
		this.patentBuyId = patentBuyId;
	}
	public BuyType getBuyType() {
		return buyType;
	}
	public void setBuyType(BuyType buyType) {
		this.buyType = buyType;
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
	public Patent getPatent() {
		return patent;
	}
	public void setPatent(Patent patent) {
		this.patent = patent;
	}
	public double getExpectMoney() {
		return expectMoney;
	}
	public void setExpectMoney(double expectMoney) {
		this.expectMoney = expectMoney;
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
