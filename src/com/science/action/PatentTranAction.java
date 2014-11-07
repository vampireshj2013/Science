package com.science.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CooperationDao;
import com.science.dao.PatentDao;
import com.science.dao.PatentTranDao;
import com.science.model.Cooperation;
import com.science.model.Patent;
import com.science.model.PatentTran;
import com.science.util.PageUtil;

public class PatentTranAction extends ActionSupport {
	private PatentTranDao dao = new PatentTranDao();	
	private CooperationDao cooperationDao=new CooperationDao();
	private PatentDao patentDao=new PatentDao();	
	private PatentTran patentTran;
	private PageUtil pageUtil = new PageUtil();
	
	public PageUtil getPageUtil() {
		return pageUtil;
	}
	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}
	
	public PatentTran getPatentTran() {
		return patentTran;
	}
	public void setPatentTran(PatentTran patentTran) {
		this.patentTran = patentTran;
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
		patentTran = dao.inqueryPatentTranById(id);
		/*List<Maturity> maturitys=maturityDao.searchAllMaturity();
		ActionContext.getContext().put("maturitys", maturitys);*/
		List<Cooperation> cooperations=cooperationDao.searchAllCooperation();
		ActionContext.getContext().put("cooperations", cooperations);
		
		List<Patent> patents=patentDao.searchAllPatent();
		ActionContext.getContext().put("patents", patents);
		
		return "updateInit";
		//return "success";
	}
	public String update(){
		dao.updatePatentTran(patentTran);
		return NONE;
	}
	public String list(){
		//设置每页显示的行数
		pageUtil.setPageSize(3);
		List<PatentTran> result = dao.searchPatentTranByCondition(patentTran, pageUtil.getIndex(), pageUtil.getPageSize());
		//设置总共有多少条记录
		pageUtil.setRecordCount(dao.countPatentTranByCondition(patentTran));
		ActionContext.getContext().put("result", result);
		return "list";
	}
	

}
