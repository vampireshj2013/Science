package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CooperationDao;
import com.science.dao.MaturityDao;
import com.science.dao.SciAchievementDao;
import com.science.model.Cooperation;
import com.science.model.Maturity;
import com.science.model.SciAchievement;
import com.science.util.PageUtil;

public class SciAchievementAction extends ActionSupport {
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
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	public String updateInit(){
		sciAchievement = dao.inquerySciAchievementById(id);
		List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);
		List<Cooperation> cooperations=cooperationDao.searchAllCooperation();
		ActionContext.getContext().put("cooperations", cooperations);
		
		return "updateInit";
	}
	public String update(){
		dao.updateSciAchievement(sciAchievement);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(3);
		List<SciAchievement> result = dao.searchSciAchievementByCondition(sciAchievement, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countSciAchievementByCondition(sciAchievement));
		ActionContext.getContext().put("result", result);
		return "list";
	}
}
