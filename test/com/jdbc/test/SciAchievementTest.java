package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.science.dao.MaturityDao;
import com.science.dao.SciAchievementDao;
import com.science.model.Cooperation;
import com.science.model.Industry;
import com.science.model.Maturity;
import com.science.model.SciAchievement;
import com.science.model.Shop;
import com.science.model.User;

public class SciAchievementTest {
	private SciAchievementDao dao ;
	@Test
	public void addSciAchievement(){
		dao = new SciAchievementDao();
		for(int i =0;i<10;i++){
			SciAchievement sciAchievement = new SciAchievement();
			sciAchievement.setAttachment("attachment-123");
			sciAchievement.setSearchKey("searchKey22whj");
			sciAchievement.setConsultationNum(123);
			sciAchievement.setTransFee(123.45678);
			sciAchievement.setDescri("descri"+i);
			User user = new User();
			Maturity maturity = new Maturity();
			Shop shop = new Shop();
			Cooperation cooperation =new Cooperation();
			Industry industry = new Industry();
			user.setUserId(1);
			maturity.setMaturityId(1);
			shop.setShopId(1);
			cooperation.setCooperationId(1);
			industry.setIndustryId(1);
			 
			sciAchievement.setUser(user);
			sciAchievement.setIndustry(industry);
			sciAchievement.setCooperation(cooperation);
			sciAchievement.setShop(shop);
			sciAchievement.setMaturity(maturity);
			dao.addSciAchievement(sciAchievement);
		}
		
	}
	@Test
	public void updateSciA1chievement(){
		dao = new SciAchievementDao();
		SciAchievement sciAchievement = new SciAchievement();
		sciAchievement.setAttachment("attachment-123");
		sciAchievement.setSearchKey("searchKey22whj");
		sciAchievement.setConsultationNum(123);
		sciAchievement.setTransFee(123.45678);
		User user = new User();
		Maturity maturity = new Maturity();
		Shop shop = new Shop();
		Cooperation cooperation =new Cooperation();
		Industry industry = new Industry();
		user.setUserId(1);
		maturity.setMaturityId(1);
		shop.setShopId(1);
		cooperation.setCooperationId(1);
		industry.setIndustryId(1);
		 
		sciAchievement.setUser(user);
		sciAchievement.setIndustry(industry);
		sciAchievement.setCooperation(cooperation);
		sciAchievement.setShop(shop);
		sciAchievement.setMaturity(maturity);
		sciAchievement.setSciAchievementId(1);
		
		boolean result = dao.updateSciAchievement(sciAchievement);
		System.out.println(result);
	}
	@Test
	public void querySciAchievement(){
		dao = new SciAchievementDao();
		System.out.println(dao.inquerySciAchievementById(1).getDescri());
		System.out.println(dao.inquerySciAchievementById(1).getMaturity().getMaturityDesc());
	}
	@Test
	public void searchSciAchievementByCondition(){
		dao = new SciAchievementDao();
		SciAchievement sciAchievement = new SciAchievement();
		sciAchievement.setDescri("de");
		List<SciAchievement> result = dao.searchSciAchievementByCondition(sciAchievement, 0, 10);
		System.out.println(result.size());
		for(SciAchievement sci:result){
			System.out.print(sci.getSciAchievementId()+"\t");
			System.out.println(sci.getMaturity().getMaturityDesc());
		}
	}
	@Test
	public void inqueryMaturityById(){
		MaturityDao dao = new MaturityDao();
		Maturity maturity = dao.inqueryMaturityById(1);
		System.out.println(maturity.getMaturityDesc());
	}
	@Test
	public void searchAllMaturity(){
		MaturityDao dao = new MaturityDao();
		List<Maturity> result = dao.searchAllMaturity();
		for(Maturity maturity:result)
		System.out.println(maturity.getMaturityDesc());
	}
}
