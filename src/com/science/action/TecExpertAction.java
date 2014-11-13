package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CityDao;
import com.science.dao.IndustryDao;
import com.science.dao.TecExpertDao;
import com.science.model.City;
import com.science.model.Industry;
import com.science.model.TecExpert;
import com.science.util.PageUtil;

public class TecExpertAction extends ActionSupport{
	private TecExpertDao dao = new TecExpertDao();	
	private IndustryDao industryDao=new IndustryDao();
	private CityDao cityDao=new CityDao();	
	private TecExpert tecExpert;
	private PageUtil pageUtil = new PageUtil();
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TecExpert getTecExpert() {
		return tecExpert;
	}
	public void setTecExpert(TecExpert tecExpert) {
		this.tecExpert = tecExpert;
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
		tecExpert = dao.inqueryTecExpertById(id);
		/*List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);*/
		List<Industry> industrys=industryDao.searchAllIndustry();
		ActionContext.getContext().put("industrys", industrys);
		
		List<City> citys=cityDao.searchAllCity();
		ActionContext.getContext().put("citys", citys);
		
		return "updateInit";
		//return "success";
	}
	public String update(){
		dao.updateTecExpert(tecExpert);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(10);
		List<TecExpert> result = dao.searchTecExpertByCondition(tecExpert, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countTecExpertByCondition(tecExpert));
		ActionContext.getContext().put("result", result);
		return "list";
	}

}
