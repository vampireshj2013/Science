package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.science.model.PatentTran;
import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;

public class PatentTranDao {
	public static Log log=LogFactory.getLog(PatentTranDao.class);
	private Connection conn;
	public boolean addPatentTran(PatentTran patentTran){
		boolean result=false;
		if(patentTran == null){
			throw new RuntimeException("PatentTran 为空！");
			
		}
		try{
			conn= JDBCUtil.getMySqlConnection();
			StringBuffer sql=new StringBuffer();
			sql.append("insert into patenttransfer(patentNum,patentee,lawStatus,transferFee,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,userId,shopId,industryId,cooperationId,patentId) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1, patentTran.getPatentNum());
			preStatement.setString(2, patentTran.getPatentee());
			preStatement.setString(3,patentTran.getLawStatus());
			preStatement.setFloat(4, patentTran.getTransferFee());
			preStatement.setString(5,patentTran.getSearchKey());
			preStatement.setInt(6, patentTran.getAttentionNum());
			preStatement.setInt(7, patentTran.getConsultationNum());
			preStatement.setString(8, patentTran.getDescri());
			preStatement.setString(9, patentTran.getAttachment());
			if(patentTran.getUser()==null){
				preStatement.setSQLXML(10, null);
			}else{
				preStatement.setInt(10, patentTran.getUser().getUserId());
			}
			if(patentTran.getShop()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, patentTran.getShop().getShopId());
			}
			if(patentTran.getIndustry()==null){
				preStatement.setString(12,null);
			}
			else{
				preStatement.setInt(12, patentTran.getIndustry().getIndustryId());
			}
			if(patentTran.getCooperation()==null){
				preStatement.setString(13,null);
			}
			else{
				preStatement.setInt(13, patentTran.getCooperation().getCooperationId());
			}
			if(patentTran.getPatent()==null){
				preStatement.setString(14, null);
			}else{
				preStatement.setInt(14,patentTran.getPatent().getPatentId());
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
	
	public boolean updatePatentTran(PatentTran patentTran){
		if(patentTran==null){
			throw new RuntimeException("patentTran 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update patenttransfer set patentNum=?,");
		sql.append(" patentee = ?,");
		sql.append(" lawStatus = ?,");
		sql.append(" transferFee = ?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" userId=?,");
		sql.append(" cooperation_cooperationId=?,");
		sql.append(" shopId=?,");
		sql.append(" patent_patentId=?,");
		sql.append(" industry_industryId=?");
		
		sql.append(" where patentTransferId = "+patentTran.getPatentTransferId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1, patentTran.getPatentNum());
			preStatement.setString(2, patentTran.getPatentee());
			preStatement.setString(3, patentTran.getLawStatus());
			preStatement.setDouble(4, patentTran.getTransferFee());
			preStatement.setString(5, patentTran.getSearchKey());
			preStatement.setInt(6, patentTran.getAttentionNum());
			preStatement.setInt(7, patentTran.getConsultationNum());
			preStatement.setString(8, patentTran.getDescri());
			preStatement.setString(9, patentTran.getAttachment());
			if(patentTran.getUser()==null){
				preStatement.setString(10,null);
			} 
			else{
				preStatement.setInt(10,patentTran.getUser().getUserId());
			}
			if(patentTran.getCooperation()==null){
				preStatement.setString(11,null);
			}
			else{
				preStatement.setInt(11, patentTran.getCooperation().getCooperationId());
			}
			if(patentTran.getShop()==null){
				preStatement.setString(12,null);
			}
			else{
				preStatement.setInt(12, patentTran.getShop().getShopId());
			}
			
			if(patentTran.getPatent()==null){
				preStatement.setString(13,null);
			}
			else{
				preStatement.setInt(13, patentTran.getPatent().getPatentId());
			}
			if(patentTran.getIndustry()==null){
				preStatement.setString(14,null);
			}
			else{
				preStatement.setInt(14, patentTran.getIndustry().getIndustryId());
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
	public boolean deletePatentTran(int id){
		String sql = "delete from patenttransfer where patentTransferId = ?";
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
	public PatentTran inqueryPatentTranById(int id){
		PatentTran patentTran =null;
		String sql = "select * from patenttransfer where patentTransferId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				patentTran = new PatentTran();
				patentTran.setPatentTransferId(rs.getInt("patentTransferId"));
				patentTran.setPatentNum(rs.getInt("patentNum"));
				patentTran.setPatentee(rs.getString("patentee"));
				patentTran.setLawStatus(rs.getString("lawStatus"));
				patentTran.setTransferFee(rs.getFloat("transferFee"));
				patentTran.setAttachment(rs.getString("attachment"));
				patentTran.setAttentionNum(rs.getInt("attentionNum"));
				patentTran.setConsultationNum(rs.getInt("consultationNum"));
				patentTran.setDescri(rs.getString("descri"));				
				patentTran.setSearchKey(rs.getString("searchKey"));
			
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				patentTran.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				CooperationDao cooperationDao = new CooperationDao();
				patentTran.setCooperation(cooperationDao.inqueryCooperationById(rs.getInt("cooperation_cooperationId")));
				PatentDao patentDao = new PatentDao();
				patentTran.setPatent(patentDao.inqueryPatentById(rs.getInt("patent_patentId")));
				
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
		return patentTran;
	}
	
	public List<PatentTran> searchPatentTranByCondition(PatentTran condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from patenttransfer where 1 = 1");
		List param = new ArrayList();
		 List<PatentTran> result = new ArrayList<PatentTran>();
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
				PatentTran patentTran = new PatentTran();
				patentTran.setPatentTransferId(rs.getInt("patentTransferId"));
				patentTran.setPatentNum(rs.getInt("patentNum"));
				patentTran.setPatentee(rs.getString("patentee"));
				patentTran.setLawStatus(rs.getString("lawStatus"));
				patentTran.setTransferFee(rs.getFloat("transferFee"));
				patentTran.setAttachment(rs.getString("attachment"));
				patentTran.setAttentionNum(rs.getInt("attentionNum"));
				patentTran.setConsultationNum(rs.getInt("consultationNum"));
				patentTran.setDescri(rs.getString("descri"));				
				patentTran.setSearchKey(rs.getString("searchKey"));
				
				
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				
				result.add(patentTran);
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
	
	public int  countPatentTranByCondition(PatentTran condition){
		int count=0;
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select count(*) from patenttransfer where 1 = 1");
		List param = new ArrayList();
		 List<PatentTran> result = new ArrayList<PatentTran>();
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
