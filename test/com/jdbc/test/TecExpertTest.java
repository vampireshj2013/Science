package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.science.dao.TecExpertDao;
import com.science.model.BuyType;
import com.science.model.City;
import com.science.model.Industry;
import com.science.model.Patent;
import com.science.model.TecExpert;
import com.science.model.Shop;
import com.science.model.User;

public class TecExpertTest {
	private TecExpertDao dao;
	@Test
	public void testAddTecExpert() {
		dao = new TecExpertDao();
		for(int i =0;i<10;i++){
			TecExpert tecExpert = new TecExpert();
			tecExpert.setInstitution("abcdefg");
			tecExpert.setMajor("数学");
			tecExpert.setTitle("教授");
			tecExpert.setSex("女");
			tecExpert.setDuty("主任");
			tecExpert.setEducation("博士");
			tecExpert.setAttachment("attachment-123");
			tecExpert.setSearchKey("TecExpert");
			tecExpert.setConsultationNum(123);
			tecExpert.setDescri("descri"+i);
			User user = new User();
			Shop shop = new Shop();
			Patent patent=new Patent();
			BuyType buy =new BuyType();
			City city=new City();
			Industry industry=new Industry();
			user.setUserId(1);
			shop.setShopId(1);
			industry.setIndustryId(1);
			city.setClassId(1);
			
			tecExpert.setUser(user);
			tecExpert.setCity(city);
			tecExpert.setShop(shop);
			tecExpert.setIndustry(industry);
			dao.addTecExpert(tecExpert);
			
		}
		System.out.println("add successfully!");
	}
	@Test
	public void testUpdateTecExpert() {
		dao = new TecExpertDao();
		TecExpert tecExpert = new TecExpert();
		tecExpert.setInstitution("yangzhou");
		tecExpert.setMajor("社会科学");
		tecExpert.setTitle("教授");
		tecExpert.setSex("女");
		tecExpert.setDuty("主任");
		tecExpert.setEducation("博士");
		tecExpert.setDescri("descri");
		tecExpert.setAttachment("attachment-123");
		tecExpert.setSearchKey("TecExpert22");
		tecExpert.setConsultationNum(123);
		User user = new User();
		Shop shop = new Shop();
		City city=new City();
		Industry industry = new Industry();
		user.setUserId(1);
		shop.setShopId(1);
		industry.setIndustryId(1);
		city.setClassId(1);
		 
		tecExpert.setUser(user);
		tecExpert.setIndustry(industry);
		tecExpert.setShop(shop);
		tecExpert.setCity(city);
		tecExpert.setTecExpertId(9);
		
		boolean result = dao.updateTecExpert(tecExpert);
		System.out.println("***************update***************");
		System.out.println(result);
	}

	@Test
	public void testDeleteTecExpert() {
		dao = new TecExpertDao();		
		boolean result=dao.deleteTecExpert(2);
		System.out.println("***************delete***************");
		System.out.println(result);
	}

	@Test
	public void testInqueryTecExpertById() {
		dao = new TecExpertDao();
		System.out.println("***************query***************");
		System.out.println(dao.inqueryTecExpertById(2).getDescri());
		//System.out.println(dao.inqueryTecExpertById(2).getPatent().getPatentDesc());
	}

	@Test
	public void testSearchTecExpertByCondition() {
		dao = new TecExpertDao();
		TecExpert TecExpert = new TecExpert();
		TecExpert.setDescri("de");
		List<TecExpert> result = dao.searchTecExpertByCondition(TecExpert, 0, 10);
		System.out.println(result.size());
		System.out.println("**************search****************");
		for(TecExpert exp:result){
			System.out.print(exp.getTecExpertId()+"\t");
			System.out.println(exp.getInstitution());
			//System.out.print(buy.getBuyType().getBuyTypeDesc()+"\t");
			//System.out.println(buy.getPatent().getPatentDesc());
		}
	}

}
