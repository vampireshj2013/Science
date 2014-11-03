package com.science.model;
/**
 * 科技成果模型
 * @author WHJ
 *
 */
public class SciAchievement {
	private int sciAchievementId;
	private String internationalTec;//国际技术
	private String technologyLevel;//技术水平
	private double transFee;//转让费
	private double expectMoney;//预期投资额
	private String searchkey;//关键字
	private int attentionNum;//关注数
	private int consultationNum;//咨询数
	private String descri;//成果介绍
	private Maturity maturity;//成熟度
	private Cooperation cooperation;//合作方式
	private Industry industry;//所属行业
	private String attachment; //附件
	private User user;
	private Shop shop;
	
	public int getSciAchievementId() {
		return sciAchievementId;
	}
	public void setSciAchievementId(int sciAchievementId) {
		this.sciAchievementId = sciAchievementId;
	}
	public String getInternationalTec() {
		return internationalTec;
	}
	public void setInternationalTec(String internationalTec) {
		this.internationalTec = internationalTec;
	}
	public String getTechnologyLevel() {
		return technologyLevel;
	}
	public void setTechnologyLevel(String technologyLevel) {
		this.technologyLevel = technologyLevel;
	}
	public double getTransFee() {
		return transFee;
	}
	public void setTransFee(double transFee) {
		this.transFee = transFee;
	}
	public double getExpectMoney() {
		return expectMoney;
	}
	public void setExpectMoney(double expectMoney) {
		this.expectMoney = expectMoney;
	}
	public String getSearchkey() {
		return searchkey;
	}
	public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
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
	public Maturity getMaturity() {
		return maturity;
	}
	public void setMaturity(Maturity maturity) {
		this.maturity = maturity;
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
	
	
}
