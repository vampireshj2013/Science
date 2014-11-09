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

import com.science.model.ProFinance;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;

public class ProFinanceDao {
	public static Log log=LogFactory.getLog(ProFinanceDao.class);
	private Connection conn;
	public boolean addProFinance(ProFinance proFinance){
		boolean result=false;
		if(proFinance == null){
			throw new RuntimeException("ProFinance 为空！");
			
		}
		try{
			conn= JDBCUtil.getMySqlConnection();
			StringBuffer sql=new StringBuffer();
			sql.append("insert into proFinance(financeMoney,endTime,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,userId,shopId,industry_industryId,finance_financeId) values (?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setFloat(1, proFinance.getFinanceMoney());
			preStatement.setString(2, proFinance.getEndTime());
			preStatement.setString(3,proFinance.getSearchKey());
			preStatement.setInt(4, proFinance.getAttentionNum());
			preStatement.setInt(5, proFinance.getConsultationNum());
			preStatement.setString(6, proFinance.getDescri());
			preStatement.setString(7, proFinance.getAttachment());
			if(proFinance.getUser()==null){
				preStatement.setSQLXML(8, null);
			}else{
				preStatement.setInt(8, proFinance.getUser().getUserId());
			}
			if(proFinance.getShop()==null){
				preStatement.setString(9,null);
			}
			else{
				preStatement.setInt(9, proFinance.getShop().getShopId());
			}
			if(proFinance.getIndustry()==null){
				preStatement.setString(10,null);
			}
			else{
				preStatement.setInt(10, proFinance.getIndustry().getIndustryId());
			}
			
			if(proFinance.getFinance()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, proFinance.getFinance().getFinanceId());
			}
			result=preStatement.execute();
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
	public boolean updateProFinance(ProFinance proFinance){
		if(proFinance==null){
			throw new RuntimeException("ProFinance 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update proFinance set financeMoney=?,");
		sql.append(" endTime =?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" userId=?,");
		sql.append(" shopId=?,");
		sql.append(" industry_industryId=?,");
		sql.append(" finance_financeId=?");
		sql.append(" where ProFinanceId = "+proFinance.getProFinanceId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setFloat(1, proFinance.getFinanceMoney());
			preStatement.setString(2, proFinance.getEndTime());
			preStatement.setString(3,proFinance.getSearchKey());
			preStatement.setInt(4, proFinance.getAttentionNum());
			preStatement.setInt(5, proFinance.getConsultationNum());
			preStatement.setString(6, proFinance.getDescri());
			preStatement.setString(7, proFinance.getAttachment());
			if(proFinance.getUser()==null){
				preStatement.setSQLXML(8, null);
			}else{
				preStatement.setInt(8, proFinance.getUser().getUserId());
			}
			if(proFinance.getShop()==null){
				preStatement.setString(9,null);
			}
			else{
				preStatement.setInt(9, proFinance.getShop().getShopId());
			}
			if(proFinance.getIndustry()==null){
				preStatement.setString(10,null);
			}
			else{
				preStatement.setInt(10, proFinance.getIndustry().getIndustryId());
			}
			
			if(proFinance.getFinance()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, proFinance.getFinance().getFinanceId());
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
	public boolean deleteProFinance(int id){
		String sql = "delete from ProFinance where proFinanceId = ?";
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
	public ProFinance inqueryProFinanceById(int id){
		ProFinance proFinance =null;
		String sql = "select * from ProFinance where proFinanceId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				proFinance = new ProFinance ();
				proFinance .setProFinanceId(rs.getInt("proFinanceId"));
				proFinance .setFinanceMoney(rs.getFloat("financeMoney"));
				proFinance .setEndTime(rs.getString("endTime"));
				proFinance .setAttachment(rs.getString("attachment"));
				proFinance .setAttentionNum(rs.getInt("attentionNum"));
				proFinance .setConsultationNum(rs.getInt("consultationNum"));
				proFinance .setDescri(rs.getString("descri"));				
				proFinance .setSearchKey(rs.getString("searchKey"));
				
			
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				patentTran.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				FinanceDao financeDao=new FinanceDao();
				proFinance.setFinance(financeDao.inqueryFinanceById(rs.getInt("finance_financeId")));
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
		return proFinance;
	}
	public List<ProFinance> searchProFinanceByCondition(ProFinance condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from ProFinance where 1 = 1");
		List param = new ArrayList();
		 List<ProFinance> result = new ArrayList<ProFinance>();
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
				ProFinance proFinance = new ProFinance();
				proFinance .setProFinanceId(rs.getInt("proFinanceId"));
				proFinance .setFinanceMoney(rs.getFloat("financeMoney"));
				proFinance .setEndTime(rs.getString("endTime"));
				proFinance .setAttachment(rs.getString("attachment"));
				proFinance .setAttentionNum(rs.getInt("attentionNum"));
				proFinance .setConsultationNum(rs.getInt("consultationNum"));
				proFinance .setDescri(rs.getString("descri"));				
				proFinance .setSearchKey(rs.getString("searchKey"));
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				FinanceDao financeDao=new FinanceDao();
				proFinance.setFinance(financeDao.inqueryFinanceById(rs.getInt("finance_financeId")));
				result.add(proFinance);
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
	
	public int  countProFinanceByCondition(ProFinance condition){
		int count=0;
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select count(*) from ProFinance where 1 = 1");
		List param = new ArrayList();
		 List<ProFinance> result = new ArrayList<ProFinance>();
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
