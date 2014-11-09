package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.science.dao.FinanceDao;
import com.science.dao.ProFinanceDao;
import com.science.model.Finance;
import com.science.model.City;
import com.science.model.Industry;
import com.science.model.Finance;
import com.science.model.ProFinance;
import com.science.model.Shop;
import com.science.model.User;

public class ProFinanceTest {
	private ProFinanceDao dao;
	@Test
	public void testAddProFinance() {
		dao = new ProFinanceDao();
		for(int i =0;i<10;i++){
			ProFinance proFinance = new ProFinance();
			proFinance.setFinanceMoney(10000);
			proFinance.setEndTime("2014-11-24");
			proFinance.setAttachment("attachment-123");
			proFinance.setSearchKey("ProFinance");
			proFinance.setConsultationNum(123);
			proFinance.setDescri("descri"+i);
			User user = new User();
			Shop shop = new Shop();	
			Industry industry=new Industry();
			City city=new City();
			Finance Finance=new Finance();
			Finance.setFinanceId(1);
			user.setUserId(1);
			shop.setShopId(1);
			industry.setIndustryId(1);
			city.setClassId(1);
			
			proFinance.setUser(user);
			proFinance.setShop(shop);
			proFinance.setIndustry(industry);
			proFinance.setFinance(Finance);
			dao.addProFinance(proFinance);
			
		}
		System.out.println("add successfully!");
	}
	@Test
	public void testUpdateProFinance() {
		dao = new ProFinanceDao();
		ProFinance proFinance = new ProFinance();
		proFinance.setFinanceMoney(55505);
		proFinance.setEndTime("2014-08-09");
		proFinance.setDescri("descri");
		proFinance.setAttachment("attachment-123");
		proFinance.setSearchKey("ProFinance22");
		proFinance.setConsultationNum(123);
		User user = new User();
		Shop shop = new Shop();
		City city=new City();
		Finance Finance=new Finance();
		Industry industry = new Industry();
		user.setUserId(1);
		shop.setShopId(1);
		Finance.setFinanceId(2);
		industry.setIndustryId(1);
		city.setClassId(1);
		 
		proFinance.setUser(user);
		proFinance.setIndustry(industry);
		proFinance.setShop(shop);
		proFinance.setFinance(Finance);
		proFinance.setProFinanceId(9);
		
		boolean result = dao.updateProFinance(proFinance);
		System.out.println("***************update***************");
		System.out.println(result);
	}

	@Test
	public void testDeleteProFinance() {
		dao = new ProFinanceDao();		
		boolean result=dao.deleteProFinance(2);
		System.out.println("***************delete***************");
		System.out.println(result);
	}

	@Test
	public void testInqueryProFinanceById() {
		dao = new ProFinanceDao();
		System.out.println("***************query***************");
		System.out.println(dao.inqueryProFinanceById(1).getDescri());
		System.out.println(dao.inqueryProFinanceById(1).getFinance().getFinanceDesc());
	}

	@Test
	public void testSearchProFinanceByCondition() {
		dao = new ProFinanceDao();
		ProFinance ProFinance = new ProFinance();
		ProFinance.setDescri("de");
		List<ProFinance> result = dao.searchProFinanceByCondition(ProFinance, 0, 10);
		System.out.println(result.size());
		System.out.println("**************search****************");
		for(ProFinance exp:result){
			System.out.print(exp.getProFinanceId()+"\t");
			//System.out.println(exp.getInstitution());
			System.out.println(dao.inqueryProFinanceById(1).getFinance().getFinanceDesc());
			//System.out.println(buy.getPatent().getPatentDesc());
		}
	}
	@Test
	public void inqueryFinanceById(){
		FinanceDao dao = new FinanceDao();
		Finance Finance = dao.inqueryFinanceById(1);
		System.out.println("***************inqueryFinance***************");
		System.out.println(Finance.getFinanceDesc());
	}
	@Test
	public void searchAllFinance(){
		FinanceDao dao = new FinanceDao();
		List<Finance> result = dao.searchAllFinance();
		System.out.println("***************searchAllFinance***************");
		for(Finance Finance:result)
		System.out.println(Finance.getFinanceDesc());
	}

}
