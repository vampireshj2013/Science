package com.jdbc.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.science.dao.CooperationDao;
import com.science.dao.PatentDao;
import com.science.dao.PatentTranDao;
import com.science.dao.PatentTranDao;
import com.science.dao.PatentTranDao;
import com.science.dao.PatentTranDao;
import com.science.model.Cooperation;
import com.science.model.Industry;
import com.science.model.Patent;
import com.science.model.Patent;
import com.science.model.PatentTran;
import com.science.model.PatentTran;
import com.science.model.PatentTran;
import com.science.model.Shop;
import com.science.model.User;

public class PatentTranDaoTest {
	private PatentTranDao dao ;
	
	@Test
	public void testAddPatentTran() {
		dao = new PatentTranDao();
		for(int i =0;i<10;i++){
			PatentTran patentTran = new PatentTran();
			patentTran.setLawStatus("有效专利");
			patentTran.setPatentee("wang");
			patentTran.setPatentNum(12345678);
			patentTran.setAttachment("attachment-123");
			patentTran.setSearchKey("science");
			patentTran.setConsultationNum(123);
			patentTran.setTransferFee(123.45678);
			patentTran.setDescri("descri"+i);
			User user = new User();
			Shop shop = new Shop();
			Cooperation cooperation =new Cooperation();
			Industry industry = new Industry();
			Patent patent=new Patent();
			user.setUserId(1);
			shop.setShopId(1);
			cooperation.setCooperationId(1);
			industry.setIndustryId(1);
			patent.setPatentId(1);
			 
			patentTran.setUser(user);
			patentTran.setIndustry(industry);
			patentTran.setCooperation(cooperation);
			patentTran.setShop(shop);
			patentTran.setPatent(patent);
			dao.addPatentTran(patentTran);
			
		}
		System.out.println("add successfully!");
	}

	@Test
	public void testUpdatePatentTran() {
		dao = new PatentTranDao();
		PatentTran patentTran = new PatentTran();
		patentTran.setPatentee("张");
		patentTran.setPatentNum(987654321);
		patentTran.setLawStatus("有效专利");
		patentTran.setDescri("descri");
		patentTran.setAttachment("attachment-123");
		patentTran.setSearchKey("patentTransfer");
		patentTran.setConsultationNum(123);
		patentTran.setTransferFee(123.45678);
		User user = new User();
		Patent patent=new Patent();
		Shop shop = new Shop();
		Cooperation cooperation =new Cooperation();
		Industry industry = new Industry();
		user.setUserId(1);
		patent.setPatentId(1);
		shop.setShopId(1);
		cooperation.setCooperationId(1);
		industry.setIndustryId(1);
		 
		patentTran.setUser(user);
		patentTran.setIndustry(industry);
		patentTran.setCooperation(cooperation);
		patentTran.setShop(shop);
		patentTran.setPatent(patent);
		patentTran.setPatentTransferId(8);
		
		boolean result = dao.updatePatentTran(patentTran);
		System.out.println("***************update***************");
		System.out.println(result);
	}

	@Test
	public void testDeletePatentTran() {
		dao = new PatentTranDao();		
		boolean result=dao.deletePatentTran(2);
		System.out.println("***************delete***************");
		System.out.println(result);
	}

	@Test
	public void testInqueryPatentTranById() {
		dao = new PatentTranDao();
		System.out.println("***************query***************");
		System.out.println(dao.inqueryPatentTranById(2).getDescri());
		System.out.println(dao.inqueryPatentTranById(2).getPatent().getPatentDesc());
	}

	@Test
	public void testSearchPatentTranByCondition() {
		dao = new PatentTranDao();
		PatentTran patentTran = new PatentTran();
		patentTran.setDescri("de");
		List<PatentTran> result = dao.searchPatentTranByCondition(patentTran, 0, 10);
		System.out.println(result.size());
		System.out.println("**************search****************");
		for(PatentTran tran:result){
			System.out.print(tran.getPatentTransferId()+"\t");
			System.out.println(tran.getPatent().getPatentDesc());
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
	public void inqueryCooperationById(){
		CooperationDao dao = new CooperationDao();
		Cooperation Cooperation = dao.inqueryCooperationById(1);
		System.out.println("***************inqueryCooperation***************");
		System.out.println(Cooperation.getCooperationDesc());
	}
	@Test
	public void searchAllCooperation(){
		CooperationDao dao = new CooperationDao();
		List<Cooperation> result = dao.searchAllCooperation();
		System.out.println("***************searchAllCooperation***************");
		for(Cooperation Cooperation:result)
		System.out.println(Cooperation.getCooperationDesc());
	}
}
