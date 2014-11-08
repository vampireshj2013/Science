package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.science.model.ProInvest;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;

public class ProInvestDao {
	public static Log log=LogFactory.getLog(ProInvestDao.class);
	private Connection conn;
	public boolean addProInvest(ProInvest proInvest){
		boolean result=false;
		if(proInvest == null){
			throw new RuntimeException("ProInvest 为空！");
			
		}
		try{
			conn= JDBCUtil.getMySqlConnection();
			StringBuffer sql=new StringBuffer();
			sql.append("insert into proInvest(investMoney,endTime,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,user_userId,shop_shopId,industry_industryId,city_classId,invest_investId) values (?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setFloat(1, proInvest.getInvestMoney());
			preStatement.setString(2, proInvest.getEndTime());
			preStatement.setString(3,proInvest.getSearchKey());
			preStatement.setInt(4, proInvest.getAttentionNum());
			preStatement.setInt(5, proInvest.getConsultationNum());
			preStatement.setString(6, proInvest.getDescri());
			preStatement.setString(7, proInvest.getAttachment());
			if(proInvest.getUser()==null){
				preStatement.setSQLXML(8, null);
			}else{
				preStatement.setInt(8, proInvest.getUser().getUserId());
			}
			if(proInvest.getShop()==null){
				preStatement.setString(9,null);
			}
			else{
				preStatement.setInt(9, proInvest.getShop().getShopId());
			}
			if(proInvest.getIndustry()==null){
				preStatement.setString(10,null);
			}
			else{
				preStatement.setInt(10, proInvest.getIndustry().getIndustryId());
			}
			if(proInvest.getCity()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, proInvest.getCity().getClassId());
			}
			if(proInvest.getInvest()==null){
				preStatement.setString(12,null);
			}
			else{
				preStatement.setInt(12, proInvest.getInvest().getInvestId());
			}
			
		}catch (SQLException e) {
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
	public boolean updateProInvest(ProInvest proInvest){
		if(proInvest==null){
			throw new RuntimeException("ProInvest 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update proInvest set investMoney=?,");
		sql.append(" endTime =?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" user_userId=?,");
		sql.append(" shop_shopId=?,");
		sql.append(" industry_industryId=?");
		sql.append(" city_classId=?");
		sql.append(" invest_investId=?");
		sql.append(" where proInvestId = "+proInvest.getProInvestId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setFloat(1, proInvest.getInvestMoney());
			preStatement.setString(2, proInvest.getEndTime());
			preStatement.setString(3,proInvest.getSearchKey());
			preStatement.setInt(4, proInvest.getAttentionNum());
			preStatement.setInt(5, proInvest.getConsultationNum());
			preStatement.setString(6, proInvest.getDescri());
			preStatement.setString(7, proInvest.getAttachment());
			if(proInvest.getUser()==null){
				preStatement.setSQLXML(8, null);
			}else{
				preStatement.setInt(8, proInvest.getUser().getUserId());
			}
			if(proInvest.getShop()==null){
				preStatement.setString(9,null);
			}
			else{
				preStatement.setInt(9, proInvest.getShop().getShopId());
			}
			if(proInvest.getIndustry()==null){
				preStatement.setString(10,null);
			}
			else{
				preStatement.setInt(10, proInvest.getIndustry().getIndustryId());
			}
			if(proInvest.getCity()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, proInvest.getCity().getClassId());
			}
			if(proInvest.getInvest()==null){
				preStatement.setString(12,null);
			}
			else{
				preStatement.setInt(12, proInvest.getInvest().getInvestId());
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
	public boolean deleteProInvest(int id){
		String sql = "delete from proInvest where proInvestId = ?";
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
	public ProInvest inqueryProInvestById(int id){
		ProInvest proInvest =null;
		String sql = "select * from proInvest where proInvestId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				proInvest = new ProInvest ();
				proInvest .setProInvestId(rs.getInt("proInvestId"));
				proInvest .setInvestMoney(rs.getFloat("investMoney"));
				proInvest .setEndTime(rs.getString("endTime"));
				proInvest .setAttachment(rs.getString("attachment"));
				proInvest .setAttentionNum(rs.getInt("attentionNum"));
				proInvest .setConsultationNum(rs.getInt("consultationNum"));
				proInvest .setDescri(rs.getString("descri"));				
				proInvest .setSearchKey(rs.getString("searchKey"));
				
			
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				patentTran.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				InvestDao investDao=new InvestDao();
				proInvest.setInvest(investDao.inqueryInvestById(rs.getInt("invest_investId")));
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
		return proInvest;
	}
	public List<ProInvest> searchProInvestByCondition(ProInvest condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from proInvest where 1 = 1");
		List param = new ArrayList();
		 List<ProInvest> result = new ArrayList<ProInvest>();
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
				ProInvest proInvest = new ProInvest();
				proInvest .setProInvestId(rs.getInt("proInvestId"));
				proInvest .setInvestMoney(rs.getFloat("investMoney"));
				proInvest .setEndTime(rs.getString("endTime"));
				proInvest .setAttachment(rs.getString("attachment"));
				proInvest .setAttentionNum(rs.getInt("attentionNum"));
				proInvest .setConsultationNum(rs.getInt("consultationNum"));
				proInvest .setDescri(rs.getString("descri"));				
				proInvest .setSearchKey(rs.getString("searchKey"));
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				InvestDao investDao=new InvestDao();
				proInvest.setInvest(investDao.inqueryInvestById(rs.getInt("invest_investId")));
				
				result.add(proInvest);
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
	
	public int  countProInvestByCondition(ProInvest condition){
		int count=0;
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select count(*) from proInvest where 1 = 1");
		List param = new ArrayList();
		 List<ProInvest> result = new ArrayList<ProInvest>();
		if(condition!=null&&CommonUtil.NotBlank(condition.getDescri())){
			sql.append(" and descri like ?");
			param.add("%"+condition.getDescri()+"%");
		}
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			for(int i = 0;i<param.size();i++){
				preStatement.setObject(i+1, param.get(i));
			}
			ResultSet rs =  preStatement.executeQuery();
			if(rs.next()){
				count = rs.getInt("count(*)");
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
		return count;
	}

}
