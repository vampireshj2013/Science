package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.BuyTypeDao;
import com.science.dao.PatentBuyDao;
import com.science.dao.PatentDao;
import com.science.model.BuyType;
import com.science.model.Patent;
import com.science.model.PatentBuy;
import com.science.util.PageUtil;

public class PatentBuyAction extends ActionSupport{
	private PatentBuyDao dao = new PatentBuyDao();	
	private PatentDao patentDao=new PatentDao();
	private BuyTypeDao buyTypeDao=new BuyTypeDao();
	private PatentBuy patentBuy;
	private PageUtil pageUtil = new PageUtil();
	public PatentBuy getPatentBuy() {
		return patentBuy;
	}
	public void setPatentBuy(PatentBuy patentBuy) {
		this.patentBuy = patentBuy;
	}
	public PageUtil getPageUtil() {
		return pageUtil;
	}
	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
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
		//System.out.println("!!");
		
		return SUCCESS;
	}
	public String updateInit(){
		patentBuy = dao.inquerypatentBuyById(id);
		/*List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);*/
		
		List<BuyType> buys=buyTypeDao.searchAllBuyType();
		ActionContext.getContext().put("buys", buys);		
		List<Patent> patents=patentDao.searchAllPatent();
		ActionContext.getContext().put("patents", patents);
		
		return "updateInit";
		//return "success";
	}
	public String update(){
		dao.updatePatentBuy(patentBuy);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(3);
		List<PatentBuy> result = dao.searchPatentBuyByCondition(patentBuy, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countPatentBuyByCondition(patentBuy));
		ActionContext.getContext().put("result", result);
		return "list";
	}

}
