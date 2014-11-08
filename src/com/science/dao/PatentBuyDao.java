package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.science.model.PatentBuy;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;

public class PatentBuyDao {
	public static Log log=LogFactory.getLog(PatentBuyDao.class);
	private Connection conn;
	public boolean addPatentBuy(PatentBuy patentBuy){
		boolean result=false;
		if(patentBuy == null){
			throw new RuntimeException("PatentBuy 为空！");
			
		}
		try{
			conn=JDBCUtil.getMySqlConnection();
			StringBuffer sql=new StringBuffer();
			sql.append("insert into patentbuy(expectMoney,searchKey,attentionNum,consultationNum"
					+",descri,attachment,userId,shopId,industryId,patentId,buyTypeId) values (?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement=conn.prepareStatement(sql.toString());
			preStatement.setInt(1, patentBuy.getExpectMoney());
			preStatement.setString(2, patentBuy.getSearchKey());
			preStatement.setInt(3, patentBuy.getAttentionNum());
			preStatement.setInt(4, patentBuy.getConsultationNum());
			preStatement.setString(5, patentBuy.getDescri());
			preStatement.setString(6, patentBuy.getAttachment());
			if(patentBuy.getUser()==null){
				preStatement.setSQLXML(7, null);
			}else{
				preStatement.setInt(7, patentBuy.getUser().getUserId());
			}
			if(patentBuy.getShop()==null){
				preStatement.setString(8,null);
			}
			else{
				preStatement.setInt(8, patentBuy.getShop().getShopId());
			}
			if(patentBuy.getIndustry()==null){
				preStatement.setString(9,null);
			}
			else{
				preStatement.setInt(9, patentBuy.getIndustry().getIndustryId());
			}
			
			if(patentBuy.getPatent()==null){
				preStatement.setString(10, null);
			}else{
				preStatement.setInt(10,patentBuy.getPatent().getPatentId());
			}
			if(patentBuy.getBuyType()==null){
				preStatement.setString(11, null);
			}
			else{
				preStatement.setInt(11, patentBuy.getBuyType().getBuyTypeId());
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
	public boolean updatePatentBuy(PatentBuy patentBuy){
		if(patentBuy==null){
			throw new RuntimeException("PatentBuy 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update patentbuy set expectMoney=?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" user_userId=?,");
		sql.append(" buyType_buyTypeId=?,");
		sql.append(" shop_shopId=?,");
		sql.append(" patent_patentId=?,");
		sql.append(" industry_industryId=?");
		
		sql.append(" where patentBuyId = "+patentBuy.getPatentBuyId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1, patentBuy.getExpectMoney());
			preStatement.setString(2, patentBuy.getSearchKey());
			preStatement.setInt(3, patentBuy.getAttentionNum());
			preStatement.setInt(4, patentBuy.getConsultationNum());
			preStatement.setString(5, patentBuy.getDescri());
			preStatement.setString(6, patentBuy.getAttachment());
			if(patentBuy.getUser()==null){
				preStatement.setString(7,null);
			} 
			else{
				preStatement.setInt(7,patentBuy.getUser().getUserId());
			}
			if(patentBuy.getBuyType()==null){
				preStatement.setString(8, null);
			}
			else{
				preStatement.setInt(8, patentBuy.getBuyType().getBuyTypeId());
			}
			if(patentBuy.getShop()==null){
				preStatement.setString(9,null);
			}
			else{
				preStatement.setInt(9, patentBuy.getShop().getShopId());
			}

			if(patentBuy.getPatent()==null){
				preStatement.setString(10, null);
			}else{
				preStatement.setInt(10,patentBuy.getPatent().getPatentId());
			}
			if(patentBuy.getIndustry()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, patentBuy.getIndustry().getIndustryId());
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
	public boolean deletePatentBuy(int id){
		String sql = "delete from patentbuy where patentBuyId = ?";
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
	public PatentBuy inquerypatentBuyById(int id){
		PatentBuy patentBuy =null;
		String sql = "select * from patentbuy where patentBuyId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				patentBuy = new PatentBuy();
				patentBuy.setPatentBuyId(rs.getInt("patentBuyId"));
				patentBuy.setExpectMoney(rs.getInt("expectMoney"));
				patentBuy.setAttachment(rs.getString("attachment"));
				patentBuy.setAttentionNum(rs.getInt("attentionNum"));
				patentBuy.setConsultationNum(rs.getInt("consultationNum"));
				patentBuy.setDescri(rs.getString("descri"));				
				patentBuy.setSearchKey(rs.getString("searchKey"));
			
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				patentBuy.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				PatentDao patentDao = new PatentDao();
				patentBuy.setPatent(patentDao.inqueryPatentById(rs.getInt("patent_patentId")));
				BuyTypeDao buyTypeDao = new BuyTypeDao();
				patentBuy.setBuyType(buyTypeDao.inqueryBuyTypeById(rs.getInt("buyType_buyTypeId")));
				
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
		return patentBuy;
	}
	
	public List<PatentBuy> searchPatentBuyByCondition(PatentBuy condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from patentbuy where 1 = 1");
		List param = new ArrayList();
		 List<PatentBuy> result = new ArrayList<PatentBuy>();
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
				PatentBuy patentBuy = new PatentBuy();
				patentBuy.setPatentBuyId(rs.getInt("patentBuyId"));
				patentBuy.setExpectMoney(rs.getInt("expectMoney"));
				patentBuy.setAttachment(rs.getString("attachment"));
				patentBuy.setAttentionNum(rs.getInt("attentionNum"));
				patentBuy.setConsultationNum(rs.getInt("consultationNum"));
				patentBuy.setDescri(rs.getString("descri"));				
				patentBuy.setSearchKey(rs.getString("searchKey"));
				
				
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				
				result.add(patentBuy);
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
	
	public int  countPatentBuyByCondition(PatentBuy condition){
		int count=0;
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select count(*) from patentbuy where 1 = 1");
		List param = new ArrayList();
		 List<PatentBuy> result = new ArrayList<PatentBuy>();
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
