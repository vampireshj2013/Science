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

import com.science.model.PatentTran;
import com.science.model.TecProblem;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;

public class TecProblemDao {
	public static Log log=LogFactory.getLog(TecProblemDao.class);
	private Connection conn;
	public boolean addTecProblem(TecProblem tecProblem){
		boolean result=false;
		if(tecProblem == null){
			throw new RuntimeException("TecProblem 为空！");
			
		}
		try{
			conn= JDBCUtil.getMySqlConnection();
			StringBuffer sql=new StringBuffer();
			sql.append("insert into tecProblem(head,expectMoney,endTime,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,user_userId,shop_shopId,industry_industryId) values (?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setString(1, tecProblem.getHead());
			preStatement.setFloat(2, tecProblem.getExpectMoney());
			preStatement.setString(3, tecProblem.getEndTime());
			preStatement.setString(4,tecProblem.getSearchKey());
			preStatement.setInt(5, tecProblem.getAttentionNum());
			preStatement.setInt(6, tecProblem.getConsultationNum());
			preStatement.setString(7, tecProblem.getDescri());
			preStatement.setString(8, tecProblem.getAttachment());
			if(tecProblem.getUser()==null){
				preStatement.setSQLXML(9, null);
			}else{
				preStatement.setInt(9, tecProblem.getUser().getUserId());
			}
			if(tecProblem.getShop()==null){
				preStatement.setString(10,null);
			}
			else{
				preStatement.setInt(10, tecProblem.getShop().getShopId());
			}
			if(tecProblem.getIndustry()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, tecProblem.getIndustry().getIndustryId());
			}
		
			result = preStatement.execute();
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
	public boolean updateTecProblem(TecProblem tecProblem){
		if(tecProblem==null){
			throw new RuntimeException("TecProblem 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update tecProblem set expectMoney=?,");
		sql.append(" head=?,");
		sql.append(" endTime =?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" user_userId=?,");
		sql.append(" shop_shopId=?,");
		sql.append(" industry_industryId=?");
		
		sql.append(" where TecProblemId = "+tecProblem.getTecProblemId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setString(1, tecProblem.getHead());
			preStatement.setFloat(2, tecProblem.getExpectMoney());
			preStatement.setString(3, tecProblem.getEndTime());
			preStatement.setString(4,tecProblem.getSearchKey());
			preStatement.setInt(5, tecProblem.getAttentionNum());
			preStatement.setInt(6, tecProblem.getConsultationNum());
			preStatement.setString(7, tecProblem.getDescri());
			preStatement.setString(8, tecProblem.getAttachment());
			if(tecProblem.getUser()==null){
				preStatement.setSQLXML(9, null);
			}else{
				preStatement.setInt(9, tecProblem.getUser().getUserId());
			}
			if(tecProblem.getShop()==null){
				preStatement.setString(10,null);
			}
			else{
				preStatement.setInt(10, tecProblem.getShop().getShopId());
			}
			if(tecProblem.getIndustry()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, tecProblem.getIndustry().getIndustryId());
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
	public boolean deleteTecProblem(int id){
		String sql = "delete from tecProblem where tecProblemId = ?";
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
	public TecProblem inqueryTecProblemById(int id){
		TecProblem tecProblem =null;
		String sql = "select * from tecProblem where tecProblemId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				tecProblem = new TecProblem ();
				tecProblem .setTecProblemId(rs.getInt("tecProblemId"));
				tecProblem.setHead(rs.getString("head"));
				tecProblem .setExpectMoney(rs.getFloat("expectMoney"));
				tecProblem .setEndTime(rs.getString("endTime"));
				tecProblem .setAttachment(rs.getString("attachment"));
				tecProblem .setAttentionNum(rs.getInt("attentionNum"));
				tecProblem .setConsultationNum(rs.getInt("consultationNum"));
				tecProblem .setDescri(rs.getString("descri"));				
				tecProblem .setSearchKey(rs.getString("searchKey"));
			
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				patentTran.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
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
		return tecProblem;
	}
	public List<TecProblem> searchTecProblemByCondition(TecProblem condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from tecProblem where 1 = 1");
		List param = new ArrayList();
		 List<TecProblem> result = new ArrayList<TecProblem>();
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
				TecProblem tecProblem = new TecProblem();
				tecProblem .setTecProblemId(rs.getInt("tecProblemId"));
				tecProblem.setHead(rs.getString("head"));
				tecProblem .setExpectMoney(rs.getFloat("expectMoney"));
				tecProblem .setEndTime(rs.getString("endTime"));
				tecProblem .setAttachment(rs.getString("attachment"));
				tecProblem .setAttentionNum(rs.getInt("attentionNum"));
				tecProblem .setConsultationNum(rs.getInt("consultationNum"));
				tecProblem .setDescri(rs.getString("descri"));				
				tecProblem .setSearchKey(rs.getString("searchKey"));
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				result.add(tecProblem);
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
	
	public int  countTecProblemByCondition(TecProblem condition){
		int count=0;
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select count(*) from tecProblem where 1 = 1");
		List param = new ArrayList();
		 List<TecProblem> result = new ArrayList<TecProblem>();
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
