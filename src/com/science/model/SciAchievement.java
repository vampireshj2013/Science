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
	private double transFee;//转让费
	private double expectMoney;//期望金额
	private String searchkey;//关键字
	private int attentionNum;//
	private int consulttationNum;//
	private String descri;
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
	public int getConsulttationNum() {
		return consulttationNum;
	}
	public void setConsulttationNum(int consulttationNum) {
		this.consulttationNum = consulttationNum;
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
