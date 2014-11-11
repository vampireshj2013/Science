package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CityDao;
import com.science.dao.FinanceDao;
import com.science.dao.IndustryDao;
import com.science.dao.InvestDao;
import com.science.dao.ProFinanceDao;
import com.science.dao.ProInvestDao;
import com.science.model.Finance;
import com.science.model.Industry;
import com.science.model.Invest;
import com.science.model.ProFinance;
import com.science.model.ProInvest;
import com.science.util.PageUtil;

public class ProFinanceAction extends ActionSupport{
	private ProFinanceDao dao = new ProFinanceDao();	
	private IndustryDao industryDao=new IndustryDao();
	private FinanceDao financeDao=new FinanceDao();
	private ProFinance proFinance;
	private PageUtil pageUtil = new PageUtil();
	
	
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ProFinance getProFinance() {
		return proFinance;
	}
	public void setProFinance(ProFinance proFinance) {
		this.proFinance = proFinance;
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
		proFinance= dao.inqueryProFinanceById(id);
		/*List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);*/
		List<Industry> industrys=industryDao.searchAllIndustry();
		ActionContext.getContext().put("industrys", industrys);
		List<Finance> finances=financeDao.searchAllFinance();
		ActionContext.getContext().put("finances", finances);
		
		return "updateInit";
		
		//return "success";
	}
	public String update(){
		dao.updateProFinance(proFinance);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(3);
		List<ProFinance> result = dao.searchProFinanceByCondition(proFinance, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countProFinanceByCondition(proFinance));
		ActionContext.getContext().put("result", result);
		return "list";
	}

}
