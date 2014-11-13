package com.science.model;

public class TecExpert {
	private int tecExpertId;
	private City city;//购买方式
	private Industry industry;//研究领域
	private User user;
	private Shop shop;
	private String institution;//所属机构
	private String head;//标题
	private String major;//技术专长
	private String title;//职称
	private String duty;//职务
	private String sex;//性别
	private String education;//学历
	private String searchKey;//关键词
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;
	private String attachment; //附件
	public int getTecExpertId() {
		return tecExpertId;
	}
	public void setTecExpertId(int tecExpertId) {
		this.tecExpertId = tecExpertId;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
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
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
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
