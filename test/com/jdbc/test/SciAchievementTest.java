package com.jdbc.test;

import org.junit.Test;

import com.opensymphony.xwork2.interceptor.annotations.Before;
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
//		dao = new SciAchievementDao();
//		SciAchievement sciAchievement = new SciAchievement();
//		sciAchievement.setAttachment("attachment");
//		sciAchievement.setKey("key");
//		sciAchievement.setConsulttationNum("123");
//		User user = new User();
//		user.setUserId(1);
//		sciAchievement.setUser(user);
//		dao.addSciAchievement(sciAchievement);
	}
	@Test
	public void updateSciA1chievement(){
		dao = new SciAchievementDao();
		SciAchievement sciAchievement = new SciAchievement();
		sciAchievement.setAttachment("attachment-123");
		sciAchievement.setSearchkey("searchKey22whj");
		sciAchievement.setConsulttationNum(123);
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

}
