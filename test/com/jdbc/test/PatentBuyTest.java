package com.jdbc.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.science.dao.BuyTypeDao;
import com.science.dao.PatentBuyDao;
import com.science.dao.PatentDao;
import com.science.dao.PatentBuyDao;
import com.science.model.BuyType;
import com.science.model.BuyType;
import com.science.model.Industry;
import com.science.model.Patent;
import com.science.model.PatentBuy;
import com.science.model.PatentBuy;
import com.science.model.Shop;
import com.science.model.User;

public class PatentBuyTest {

	private PatentBuyDao dao;
	@Test
	public void testAddPatentBuy() {
		dao = new PatentBuyDao();
		for(int i =0;i<10;i++){
			PatentBuy patentBuy = new PatentBuy();
			patentBuy.setExpectMoney(1234.5678);
			patentBuy.setAttachment("attachment-123");
			patentBuy.setSearchKey("patentBuy");
			patentBuy.setConsultationNum(123);
			patentBuy.setDescri("descri"+i);
			User user = new User();
			Shop shop = new Shop();
			Patent patent=new Patent();
			BuyType buy =new BuyType();
			Industry industry=new Industry();
			user.setUserId(1);
			shop.setShopId(1);
			patent.setPatentId(1);
			buy.setBuyTypeId(1);
			industry.setIndustryId(1);
			 
			patentBuy.setUser(user);
			patentBuy.setBuyType(buy);
			patentBuy.setShop(shop);
			patentBuy.setPatent(patent);
			patentBuy.setIndustry(industry);
			dao.addPatentBuy(patentBuy);
			
		}
		System.out.println("add successfully!");
	}
	@Test
	public void testUpdatePatentBuy() {
		dao = new PatentBuyDao();
		PatentBuy patentBuy = new PatentBuy();
		patentBuy.setDescri("descri");
		patentBuy.setAttachment("attachment-123");
		patentBuy.setSearchKey("patentBuy22");
		patentBuy.setConsultationNum(123);
		patentBuy.setExpectMoney(5555555);
		User user = new User();
		Patent patent=new Patent();
		Shop shop = new Shop();
		BuyType buy=new BuyType();
		Industry industry = new Industry();
		user.setUserId(1);
		patent.setPatentId(1);
		shop.setShopId(1);
		buy.setBuyTypeId(1);
		industry.setIndustryId(1);
		 
		patentBuy.setUser(user);
		patentBuy.setIndustry(industry);
		patentBuy.setShop(shop);
		patentBuy.setPatent(patent);
		patentBuy.setPatentBuyId(8);
		
		boolean result = dao.updatePatentBuy(patentBuy);
		System.out.println("***************update***************");
		System.out.println(result);
	}

	@Test
	public void testDeletePatentBuy() {
		dao = new PatentBuyDao();		
		boolean result=dao.deletePatentBuy(2);
		System.out.println("***************delete***************");
		System.out.println(result);
	}

	@Test
	public void testInqueryPatentBuyById() {
		dao = new PatentBuyDao();
		System.out.println("***************query***************");
		System.out.println(dao.inqueryPatentBuyById(2).getDescri());
		System.out.println(dao.inqueryPatentBuyById(2).getPatent().getPatentDesc());
	}

	@Test
	public void testSearchPatentBuyByCondition() {
		dao = new PatentBuyDao();
		PatentBuy PatentBuy = new PatentBuy();
		PatentBuy.setDescri("de");
		List<PatentBuy> result = dao.searchPatentBuyByCondition(PatentBuy, 0, 10);
		System.out.println(result.size());
		System.out.println("**************search****************");
		for(PatentBuy buy:result){
			System.out.print(buy.getPatentBuyId()+"\t");
			System.out.print(buy.getBuyType().getBuyTypeDesc()+"\t");
			System.out.println(buy.getPatent().getPatentDesc());
		}
	}

	@Test
	public void inqueryPatentById(){
		PatentDao dao = new PatentDao();
		Patent Patent = dao.inqueryPatentById(1);
		System.out.println("***************inqueryPatent***************");
		System.out.println(Patent.getPatentDesc());
	}
	@Test
	public void searchAllPatent(){
		PatentDao dao = new PatentDao();
		List<Patent> result = dao.searchAllPatent();
		System.out.println("***************searchAllPatent***************");
		for(Patent Patent:result)
		System.out.println(Patent.getPatentDesc());
	}

	@Test
	public void inqueryBuyTypeById(){
		BuyTypeDao dao = new BuyTypeDao();
		BuyType BuyType = dao.inqueryBuyTypeById(1);
		System.out.println("***************inqueryBuyType***************");
		System.out.println(BuyType.getBuyTypeDesc());
	}
	@Test
	public void searchAllBuyType(){
		BuyTypeDao dao = new BuyTypeDao();
		List<BuyType> result = dao.searchAllBuyType();
		System.out.println("***************searchAllBuyType***************");
		for(BuyType BuyType:result)
		System.out.println(BuyType.getBuyTypeDesc());
	}
}
