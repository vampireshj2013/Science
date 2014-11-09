package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.science.dao.TecProblemDao;
import com.science.model.Industry;
import com.science.model.TecProblem;
import com.science.model.Shop;
import com.science.model.User;

public class TecProblemTest {
	private TecProblemDao dao;
	@Test
	public void testAddTecProblem() {
		dao = new TecProblemDao();
		for(int i =0;i<10;i++){
			TecProblem tecProblem = new TecProblem();
			tecProblem.setExpectMoney(10000);
			tecProblem.setEndTime("2014-11-24");
			tecProblem.setAttachment("attachment-123");
			tecProblem.setSearchKey("TecProblem");
			tecProblem.setConsultationNum(123);
			tecProblem.setDescri("descri"+i);
			User user = new User();
			Shop shop = new Shop();	
			Industry industry=new Industry();
			user.setUserId(1);
			shop.setShopId(1);
			industry.setIndustryId(1);
			
			tecProblem.setUser(user);
			tecProblem.setShop(shop);
			tecProblem.setIndustry(industry);
			dao.addTecProblem(tecProblem);
			
		}
		System.out.println("add successfully!");
	}
	@Test
	public void testUpdateTecProblem() {
		dao = new TecProblemDao();
		TecProblem tecProblem = new TecProblem();
		tecProblem.setDescri("descri");
		tecProblem.setAttachment("attachment-123");
		tecProblem.setSearchKey("TecProblem22");
		tecProblem.setConsultationNum(123);
		User user = new User();
		Shop shop = new Shop();
		Industry industry = new Industry();
		user.setUserId(1);
		shop.setShopId(1);
		industry.setIndustryId(1);
		 
		tecProblem.setUser(user);
		tecProblem.setIndustry(industry);
		tecProblem.setShop(shop);
		tecProblem.setTecProblemId(9);
		
		boolean result = dao.updateTecProblem(tecProblem);
		System.out.println("***************update***************");
		System.out.println(result);
	}

	@Test
	public void testDeleteTecProblem() {
		dao = new TecProblemDao();		
		boolean result=dao.deleteTecProblem(2);
		System.out.println("***************delete***************");
		System.out.println(result);
	}

	@Test
	public void testInqueryTecProblemById() {
		dao = new TecProblemDao();
		System.out.println("***************query***************");
		System.out.println(dao.inqueryTecProblemById(1).getDescri());
		//System.out.println(dao.inqueryTecProblemById(2).getPatent().getPatentDesc());
	}

	@Test
	public void testSearchTecProblemByCondition() {
		dao = new TecProblemDao();
		TecProblem TecProblem = new TecProblem();
		TecProblem.setDescri("de");
		List<TecProblem> result = dao.searchTecProblemByCondition(TecProblem, 0, 10);
		System.out.println(result.size());
		System.out.println("**************search****************");
		for(TecProblem exp:result){
			System.out.print(exp.getTecProblemId()+"\t");
			//System.out.println(exp.getInstitution());
			//System.out.print(buy.getBuyType().getBuyTypeDesc()+"\t");
			//System.out.println(buy.getPatent().getPatentDesc());
		}
	}

}
