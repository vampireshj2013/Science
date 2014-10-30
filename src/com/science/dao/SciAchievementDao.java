package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.science.model.SciAchievement;
import com.science.util.JDBCUtil;
/**
 * SciAchievement dao层
 * @author WHJ
 *
 */
public class SciAchievementDao {
	public static Log log=LogFactory.getLog(SciAchievementDao.class);
	private Connection conn;
	public boolean addSciAchievement(SciAchievement  sciAchievement){
		boolean result =false;
		if(sciAchievement ==null){
			throw new RuntimeException("SciAchievement 为空！");
		}
		
		try {
			conn = JDBCUtil.getMySqlConnection();
	
		StringBuffer sql = new StringBuffer();
		sql.append("insert into sciAchievement (internationalTec,technologyLevel,transferFee,expectMoney,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,user_userId,shop_shopId,industryId,maturityId) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
		PreparedStatement preStatement = conn.prepareStatement(sql.toString());
		
		preStatement.setString(1, sciAchievement.getInternationalTec());
		preStatement.setString(2, sciAchievement.getTechnologyLevel());
		preStatement.setDouble(3, sciAchievement.getTransFee());
		preStatement.setDouble(4, sciAchievement.getExpectMoney());
		preStatement.setString(5, sciAchievement.getSearchkey());
		preStatement.setInt(6, sciAchievement.getAttentionNum());
		preStatement.setInt(7, sciAchievement.getConsulttationNum());
		preStatement.setString(8, sciAchievement.getDescri());
		preStatement.setString(9, sciAchievement.getAttachment());
		if(sciAchievement.getUser()==null){
			preStatement.setString(10,null);
		} 
		else{
			preStatement.setInt(10,sciAchievement.getUser().getUserId());
		}
		if(sciAchievement.getShop()==null){
			preStatement.setString(11,null);
		}
		else{
			preStatement.setInt(11, sciAchievement.getShop().getShopId());
		}
		if(sciAchievement.getIndustry()==null){
			preStatement.setString(12,null);
		}
		else{
			preStatement.setInt(12, sciAchievement.getIndustry().getIndustryId());
		}
		if(sciAchievement.getCooperation()==null){
			preStatement.setString(13,null);
		}
		else{
			preStatement.setInt(13, sciAchievement.getCooperation().getCooperationId());
		}
		result = preStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}
	public boolean updateSciAchievement(SciAchievement sciAchievement){
		if(sciAchievement==null){
			throw new RuntimeException("SciAchievement 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update sciAchievement set internationalTec=?,");
		sql.append(" technologyLevel = ?,");
		sql.append(" transferFee = ?,");
		sql.append(" expectMoney = ?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" userId=?,");
		sql.append(" cooperationId=?,");
		sql.append(" shopId=?,");
		sql.append(" maturityId=?");
		
		sql.append(" where sciAchievementId = "+sciAchievement.getSciAchievementId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setString(1, sciAchievement.getInternationalTec());
			preStatement.setString(2, sciAchievement.getTechnologyLevel());
			preStatement.setDouble(3, sciAchievement.getTransFee());
			preStatement.setDouble(4, sciAchievement.getExpectMoney());
			preStatement.setString(5, sciAchievement.getSearchkey());
			preStatement.setInt(6, sciAchievement.getAttentionNum());
			preStatement.setInt(7, sciAchievement.getConsulttationNum());
			preStatement.setString(8, sciAchievement.getDescri());
			preStatement.setString(9, sciAchievement.getAttachment());
			if(sciAchievement.getUser()==null){
				preStatement.setString(10,null);
			} 
			else{
				preStatement.setInt(10,sciAchievement.getUser().getUserId());
			}
			if(sciAchievement.getShop()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, sciAchievement.getShop().getShopId());
			}
			if(sciAchievement.getIndustry()==null){
				preStatement.setString(12,null);
			}
			else{
				preStatement.setInt(12, sciAchievement.getIndustry().getIndustryId());
			}
			if(sciAchievement.getCooperation()==null){
				preStatement.setString(13,null);
			}
			else{
				preStatement.setInt(13, sciAchievement.getCooperation().getCooperationId());
			}
			//Log4j打印日志
			log.debug("\nSQL语句：\n");
			System.out.println(sql.toString());
			preStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				JDBCUtil.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
