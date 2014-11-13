package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CityDao;
import com.science.dao.IndustryDao;
import com.science.dao.InvestDao;
import com.science.dao.ProInvestDao;
import com.science.model.Industry;
import com.science.model.Invest;
import com.science.model.ProInvest;
import com.science.util.PageUtil;

public class ProInvestAction extends ActionSupport{
	private ProInvestDao dao = new ProInvestDao();	
	private IndustryDao industryDao=new IndustryDao();
	private InvestDao investDao=new InvestDao();
	private CityDao cityDao=new CityDao();
	private ProInvest proInvest;
	private PageUtil pageUtil = new PageUtil();
	
	
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProInvest getProInvest() {
		return proInvest;
	}
	public void setProInvest(ProInvest proInvest) {
		this.proInvest = proInvest;
	}
	public PageUtil getPageUtil() {
		return pageUtil;
	}
	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}
	
	
	@Override
	public String execute() throws Exception {
		//System.out.println("!!");
		
		return SUCCESS;
	}
	public String updateInit(){
		proInvest = dao.inqueryProInvestById(id);
		/*List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);*/
		List<Industry> industrys=industryDao.searchAllIndustry();
		ActionContext.getContext().put("industrys", industrys);
		List<Invest> invests=investDao.searchAllInvest();
		ActionContext.getContext().put("invests", invests);
		
		return "updateInit";
		//return "success";
	}
	public String update(){
		dao.updateProInvest(proInvest);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(10);
		List<ProInvest> result = dao.searchProInvestByCondition(proInvest, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countProInvestByCondition(proInvest));
		ActionContext.getContext().put("result", result);
		return "list";
	}

}
