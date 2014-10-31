package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
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
				+ ",descri,attachment,userId,shopId,industryId,cooperationId,maturityId) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
		if(sciAchievement.getMaturity()==null){
			preStatement.setString(14,null);
		}else{
			preStatement.setInt(14, sciAchievement.getMaturity().getMaturityId());
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
		sql.append(" maturityId=?,");
		sql.append(" industryId=?");
		
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
			if(sciAchievement.getIndustry()==null){
				preStatement.setString(14,null);
			}
			else{
				preStatement.setInt(14, sciAchievement.getIndustry().getIndustryId());
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
	public boolean deleteSciAchievement(int id){
		String sql = "delete from sciAchievement where sciAchievementId = ?";
		int  result = 0;
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			result = preStatement.executeUpdate();
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
		if(result>0)
			return true;
		else
			return false;
		
	}
	public SciAchievement inquirySciAchievementById(int id){
		SciAchievement sciAchievement =null;
		String sql = "select * from sciAchievement where sciAchievementId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				sciAchievement = new SciAchievement();
				sciAchievement.setSciAchievementId(rs.getInt("sciAchievementId"));
				sciAchievement.setAttachment(rs.getString("attachment"));
				sciAchievement.setAttentionNum(rs.getInt("AttentionNum"));
				sciAchievement.setConsulttationNum(rs.getInt("consultationNum"));
				sciAchievement.setDescri(rs.getString("descri"));
				sciAchievement.setExpectMoney(rs.getDouble("expectMoney"));
				sciAchievement.setInternationalTec(rs.getString("internationalTec"));
				sciAchievement.setSearchkey(rs.getString("searchKey"));
				sciAchievement.setTechnologyLevel(rs.getString("technologyLevel"));
				sciAchievement.setTransFee(rs.getDouble("transferFee"));
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inquiryManurityById(rs.getInt("maturityId")));
			}
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
		return sciAchievement;
	}
	public List<SciAchievement> searchSciAchievementByCondition(SciAchievement condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from sciAchievement where 1 = 1");
		List param = new ArrayList();
		 List<SciAchievement> result = new ArrayList<SciAchievement>();
		if(condition!=null&&CommonUtil.NotBlank(condition.getDescri())){
			sql.append(" and descri like ?");
			param.add("%"+condition.getDescri()+"%");
		}
		sql.append( " limit ?,?");
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			for(int i = 0;i<param.size();i++){
				preStatement.setObject(i+1, param.get(i));
			}
			preStatement.setInt(param.size()+1, first);
			preStatement.setInt(param.size()+2, max);
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				SciAchievement sciAchievement = new SciAchievement();
				sciAchievement.setSciAchievementId(rs.getInt("sciAchievementId"));
				sciAchievement.setAttachment(rs.getString("attachment"));
				sciAchievement.setAttentionNum(rs.getInt("AttentionNum"));
				sciAchievement.setConsulttationNum(rs.getInt("consultationNum"));
				sciAchievement.setDescri(rs.getString("descri"));
				sciAchievement.setExpectMoney(rs.getDouble("expectMoney"));
				sciAchievement.setInternationalTec(rs.getString("internationalTec"));
				sciAchievement.setSearchkey(rs.getString("searchKey"));
				sciAchievement.setTechnologyLevel(rs.getString("technologyLevel"));
				sciAchievement.setTransFee(rs.getDouble("transferFee"));
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inquiryManurityById(rs.getInt("maturityId")));
				result.add(sciAchievement);
			}
			
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
