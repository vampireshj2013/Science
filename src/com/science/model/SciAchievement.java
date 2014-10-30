package com.science.model;
/**
 * 科技成果模型
 * @author WHJ
 *
 */
public class SciAchievement {
	private int SciAchievementId;
	private String internationalTec;
	private String technologyLevel;
	private String transFee;//转让费
	private String expectMoney;//期望金额
	private String key;//关键字
	private String attentionNum;//
	private String consulttationNum;//
	private String desc;
	private String attachment;
	private Maturity maturity;
	private Cooperation cooperation;
	private Industry industry;
	private User user;
	private Shop shop;
	public int getSciAchievementId() {
		return SciAchievementId;
	}
	public void setSciAchievementId(int sciAchievementId) {
		SciAchievementId = sciAchievementId;
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
	public String getTransFee() {
		return transFee;
	}
	public void setTransFee(String transFee) {
		this.transFee = transFee;
	}
	public String getExpectMoney() {
		return expectMoney;
	}
	public void setExpectMoney(String expectMoney) {
		this.expectMoney = expectMoney;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getAttentionNum() {
		return attentionNum;
	}
	public void setAttentionNum(String attentionNum) {
		this.attentionNum = attentionNum;
	}
	public String getConsulttationNum() {
		return consulttationNum;
	}
	public void setConsulttationNum(String consulttationNum) {
		this.consulttationNum = consulttationNum;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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
