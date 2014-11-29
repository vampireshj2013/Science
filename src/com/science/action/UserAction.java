package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CooperationDao;
import com.science.dao.MaturityDao;
import com.science.dao.SciAchievementDao;
import com.science.model.BuyType;
import com.science.model.Cooperation;
import com.science.model.Maturity;
import com.science.model.Patent;
import com.science.model.SciAchievement;
import com.science.util.PageUtil;

public class UserAction extends ActionSupport {
	private SciAchievementDao dao = new SciAchievementDao();
	private MaturityDao maturityDao = new MaturityDao();
	private CooperationDao cooperationDao=new CooperationDao();
	private SciAchievement sciAchievement;
	private PageUtil pageUtil = new PageUtil();
	
	public PageUtil getPageUtil() {
		return pageUtil;
	}
	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}
	public SciAchievement getSciAchievement() {
		return sciAchievement;
	}
	public void setSciAchievement(SciAchievement sciAchievement) {
		this.sciAchievement = sciAchievement;
	}
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String userInit(){
		ActionContext ctx = ActionContext.getContext();
		int sciCount= dao.countSciAchievementByCondition(null);
		ctx.put("sciCount", sciCount);
		return "userInit";
	}
}
