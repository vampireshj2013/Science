package com.jdbc.test;

import org.junit.Test;

import com.opensymphony.xwork2.interceptor.annotations.Before;
import com.science.dao.SciAchievementDao;
import com.science.model.SciAchievement;
import com.science.model.User;

public class SciAchievementTest {
	private SciAchievementDao dao ;
	@Test
	public void addSciAchievement(){
		dao = new SciAchievementDao();
		SciAchievement sciAchievement = new SciAchievement();
		sciAchievement.setAttachment("attachment");
		sciAchievement.setKey("key");
		sciAchievement.setConsulttationNum("123");
		User user = new User();
		user.setUserId(1);
		sciAchievement.setUser(user);
		dao.addSciAchievement(sciAchievement);
	}
	@Test
	public void updateSciA1chievement(){
		dao = new SciAchievementDao();
		SciAchievement sciAchievement = new SciAchievement();
		sciAchievement.setAttachment("attachment-123");
		sciAchievement.setKey("s");
		sciAchievement.setConsulttationNum("123321");
		sciAchievement.setSciAchievementId(1);
		User user = new User();
		user.setUserId(1);
		sciAchievement.setUser(user);
		dao.updateSciAchievement(sciAchievement);
	}

}
