package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CityDao;
import com.science.dao.IndustryDao;
import com.science.dao.TecProblemDao;
import com.science.model.City;
import com.science.model.Industry;
import com.science.model.TecProblem;
import com.science.util.PageUtil;

public class TecProblemAction extends ActionSupport{
	private TecProblemDao dao = new TecProblemDao();	
	private IndustryDao industryDao=new IndustryDao();
	private TecProblem tecProblem;
	private PageUtil pageUtil = new PageUtil();
	
	
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TecProblem getTecProblem() {
		return tecProblem;
	}
	public void setTecProblem(TecProblem tTecProblem) {
		this.tecProblem = tecProblem;
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
		tecProblem = dao.inqueryTecProblemById(id);
		/*List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);*/
		List<Industry> industrys=industryDao.searchAllIndustry();
		ActionContext.getContext().put("industrys", industrys);
		
	
		
		return "updateInit";
		//return "success";
	}
	public String update(){
		dao.updateTecProblem(tecProblem);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(10);
		List<TecProblem> result = dao.searchTecProblemByCondition(tecProblem, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countTecProblemByCondition(tecProblem));
		ActionContext.getContext().put("result", result);
		return "list";
	}

}
