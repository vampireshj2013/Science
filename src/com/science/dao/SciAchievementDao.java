package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.science.model.SciAchievement;
import com.science.util.JDBCUtil;
/**
 * SciAchievement dao层
 * @author WHJ
 *
 */
public class SciAchievementDao {
	private Connection conn;
	public boolean addSciAchievement(SciAchievement  sAchievement){
		boolean result =false;
		if(sAchievement ==null){
			throw new RuntimeException("SciAchievement 为空！");
		}
		
		try {
			conn = JDBCUtil.getMySqlConnection();
	
		StringBuffer sql = new StringBuffer();
		sql.append("insert into sciAchievement (internationalTec,technologyLevel,transferFee,expectMoney,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,user_userId,shop_shopId,industryId,maturityId) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
		PreparedStatement preStatement = conn.prepareStatement(sql.toString());
		
		preStatement.setString(1, sAchievement.getInternationalTec());
		preStatement.setString(2, sAchievement.getTechnologyLevel());
		preStatement.setString(3, sAchievement.getTransFee());
		preStatement.setString(4, sAchievement.getExpectMoney());
		preStatement.setString(5, sAchievement.getKey());
		preStatement.setString(6, sAchievement.getAttentionNum());
		preStatement.setString(7, sAchievement.getConsulttationNum());
		preStatement.setString(8, sAchievement.getDesc());
		preStatement.setString(9, sAchievement.getAttachment());
		//
		if(sAchievement.getUser()==null){
			preStatement.setString(10,null);
		}
		else{
			preStatement.setInt(10,sAchievement.getUser().getUserId());
		}
		if(sAchievement.getShop()==null){
			preStatement.setString(11,null);
		}
		else{
			preStatement.setInt(11, sAchievement.getShop().getShopId());
		}
		if(sAchievement.getIndustry()==null){
			preStatement.setString(12,null);
		}
		else{
			preStatement.setInt(12, sAchievement.getIndustry().getIndustryId());
		}
		if(sAchievement.getCooperation()==null){
			preStatement.setString(13,null);
		}
		else{
			preStatement.setInt(13, sAchievement.getCooperation().getCooperationId());
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
		boolean result = false;
		if(sciAchievement==null){
			throw new RuntimeException("SciAchievement 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update sciAchievement");
		sql.append(" set internationalTec = '"+sciAchievement.getInternationalTec());
		sql.append("' ,technologyLevel = '"+sciAchievement.getTechnologyLevel());
		sql.append("' ,transferFee = "+sciAchievement.getTransFee());
		sql.append(" ,expectMoney = "+sciAchievement.getExpectMoney());
		sql.append(" ,searchKey ='"+sciAchievement.getKey());
		sql.append("' ,attentionNum ="+sciAchievement.getAttentionNum());
		sql.append(" ,consultationNum ="+sciAchievement.getConsulttationNum());
		sql.append(" ,descri ='"+sciAchievement.getDesc());
		sql.append("' ,attachment='"+sciAchievement.getAttachment());
		if(sciAchievement.getUser()==null){
			sql.append("' ,user_userId = null");
		}else{
			sql.append("' ,user_userId = "+sciAchievement.getUser().getUserId());
		}
		if(sciAchievement.getCooperation()==null){
			sql.append(" ,cooperation_cooperationid = null");
		}else{
			sql.append(" ,cooperation_cooperationid = "+sciAchievement.getCooperation().getCooperationId());
		}
		if(sciAchievement.getShop()==null){
			sql.append(" ,shop_shopId = null");
		}else{
			sql.append(" ,shop_shopId = "+sciAchievement.getShop().getShopId());
		}
		if(sciAchievement.getMaturity()==null){
			sql.append(" ,maturityId = null");
		}else{
			sql.append(" ,maturityId = "+sciAchievement.getMaturity().getMaturityId());
		}
		sql.append(" where sciAchievementId = "+sciAchievement.getSciAchievementId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			System.out.println(sql.toString());
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
}
