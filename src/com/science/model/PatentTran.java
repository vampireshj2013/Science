package com.science.model;

public class PatentTran {
	private int patentTransferId;
	private Cooperation cooperation;//合作方式
	private Industry industry;//所属行业
	private User user;
	private Shop shop;
	private Patent patent;
	private int patentNum;//专利号
	private String patentee;//专利所有人
	private String lawStatus;//法律状态
	private float transferFee;//转让费
	private String searchKey;//关键词
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;
	private String attachment; //附件
	
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public int getPatentTransferId() {
		return patentTransferId;
	}
	public void setPatentTransferId(int patentTransferId) {
		this.patentTransferId = patentTransferId;
	}
	public Cooperation getCooperation() {
		return cooperation;
	}
	public void setCooperation(Cooperation cooperation) {
		this.cooperation = cooperation;
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
	public int getPatentNum() {
		return patentNum;
	}
	public void setPatentNum(int patentNum) {
		this.patentNum = patentNum;
	}
	public String getPatentee() {
		return patentee;
	}
	public void setPatentee(String patentee) {
		this.patentee = patentee;
	}
	
	public String getLawStatus() {
		return lawStatus;
	}
	public void setLawStatus(String lawStatus) {
		this.lawStatus = lawStatus;
	}
	public float getTransferFee() {
		return transferFee;
	}
	public void setTransferFee(float transferFee) {
		this.transferFee = transferFee;
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
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	

}
