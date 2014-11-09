package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.science.dao.InvestDao;
import com.science.dao.ProInvestDao;
import com.science.model.Invest;
import com.science.model.City;
import com.science.model.Industry;
import com.science.model.Invest;
import com.science.model.ProInvest;
import com.science.model.Shop;
import com.science.model.User;

public class ProInvestTest {
	private ProInvestDao dao;
	@Test
	public void testAddProInvest() {
		dao = new ProInvestDao();
		for(int i =0;i<10;i++){
			ProInvest proInvest = new ProInvest();
			proInvest.setInvestMoney(10000);
			proInvest.setEndTime("2014-11-24");
			proInvest.setAttachment("attachment-123");
			proInvest.setSearchKey("ProInvest");
			proInvest.setConsultationNum(123);
			proInvest.setDescri("descri"+i);
			User user = new User();
			Shop shop = new Shop();	
			Industry industry=new Industry();
			City city=new City();
			Invest invest=new Invest();
			invest.setInvestId(1);
			user.setUserId(1);
			shop.setShopId(1);
			industry.setIndustryId(1);
			city.setClassId(1);
			
			proInvest.setUser(user);
			proInvest.setShop(shop);
			proInvest.setIndustry(industry);
			proInvest.setCity(city);
			proInvest.setInvest(invest);
			dao.addProInvest(proInvest);
			
		}
		System.out.println("add successfully!");
	}
	@Test
	public void testUpdateProInvest() {
		dao = new ProInvestDao();
		ProInvest proInvest = new ProInvest();
		proInvest.setInvestMoney(55505);
		proInvest.setEndTime("2014-08-09");
		proInvest.setDescri("descri");
		proInvest.setAttachment("attachment-123");
		proInvest.setSearchKey("ProInvest22");
		proInvest.setConsultationNum(123);
		User user = new User();
		Shop shop = new Shop();
		City city=new City();
		Invest invest=new Invest();
		Industry industry = new Industry();
		user.setUserId(1);
		shop.setShopId(1);
		invest.setInvestId(2);
		industry.setIndustryId(1);
		city.setClassId(1);
		 
		proInvest.setUser(user);
		proInvest.setIndustry(industry);
		proInvest.setShop(shop);
		proInvest.setInvest(invest);
		proInvest.setCity(city);
		proInvest.setProInvestId(9);
		
		boolean result = dao.updateProInvest(proInvest);
		System.out.println("***************update***************");
		System.out.println(result);
	}

	@Test
	public void testDeleteProInvest() {
		dao = new ProInvestDao();		
		boolean result=dao.deleteProInvest(2);
		System.out.println("***************delete***************");
		System.out.println(result);
	}

	@Test
	public void testInqueryProInvestById() {
		dao = new ProInvestDao();
		System.out.println("***************query***************");
		System.out.println(dao.inqueryProInvestById(1).getDescri());
		System.out.println(dao.inqueryProInvestById(1).getInvest().getInvestDesc());
	}

	@Test
	public void testSearchProInvestByCondition() {
		dao = new ProInvestDao();
		ProInvest ProInvest = new ProInvest();
		ProInvest.setDescri("de");
		List<ProInvest> result = dao.searchProInvestByCondition(ProInvest, 0, 10);
		System.out.println(result.size());
		System.out.println("**************search****************");
		for(ProInvest exp:result){
			System.out.print(exp.getProInvestId()+"\t");
			//System.out.println(exp.getInstitution());
			System.out.println(dao.inqueryProInvestById(1).getInvest().getInvestDesc());
			//System.out.println(buy.getPatent().getPatentDesc());
		}
	}
	@Test
	public void inqueryInvestById(){
		InvestDao dao = new InvestDao();
		Invest Invest = dao.inqueryInvestById(1);
		System.out.println("***************inqueryInvest***************");
		System.out.println(Invest.getInvestDesc());
	}
	@Test
	public void searchAllInvest(){
		InvestDao dao = new InvestDao();
		List<Invest> result = dao.searchAllInvest();
		System.out.println("***************searchAllInvest***************");
		for(Invest Invest:result)
		System.out.println(Invest.getInvestDesc());
	}

}
