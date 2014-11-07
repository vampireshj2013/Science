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
import com.science.model.TecExpert;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;

public class TecExpertDao {
	public static Log log=LogFactory.getLog(TecExpertDao.class);
	private Connection conn;
	public boolean addTecExpert(TecExpert tecExpert){
		boolean result=false;
		if(tecExpert == null){
			throw new RuntimeException("tecExpert 为空！");
			
		}
		try{
			conn= JDBCUtil.getMySqlConnection();
			StringBuffer sql=new StringBuffer();
			sql.append("insert into tecExpert(institution,major,title,sex,duty,education,searchKey,attentionNum,consultationNum"
				+ ",descri,attachment,userId,shopId,industryId,classId) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setString(1, tecExpert.getInstitution());
			preStatement.setString(2, tecExpert.getMajor());
			preStatement.setString(3,tecExpert.getTitle());
			preStatement.setString(4, tecExpert.getSex());
			preStatement.setString(5, tecExpert.getDuty());
			preStatement.setString(6, tecExpert.getEducation());
			preStatement.setString(7,tecExpert.getSearchKey());
			preStatement.setInt(8, tecExpert.getAttentionNum());
			preStatement.setInt(9, tecExpert.getConsultationNum());
			preStatement.setString(10, tecExpert.getDescri());
			preStatement.setString(11, tecExpert.getAttachment());
			if(tecExpert.getUser()==null){
				preStatement.setSQLXML(12, null);
			}else{
				preStatement.setInt(12, tecExpert.getUser().getUserId());
			}
			if(tecExpert.getShop()==null){
				preStatement.setString(13,null);
			}
			else{
				preStatement.setInt(13, tecExpert.getShop().getShopId());
			}
			if(tecExpert.getIndustry()==null){
				preStatement.setString(14,null);
			}
			else{
				preStatement.setInt(14, tecExpert.getIndustry().getIndustryId());
			}
			if(tecExpert.getCity()==null){
				preStatement.setString(15,null);
			}
			else{
				preStatement.setInt(15, tecExpert.getCity().getClassId());
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
	public boolean updateTecExpert(TecExpert tecExpert){
		if(tecExpert==null){
			throw new RuntimeException("tecExpert 为空！");
		}
		StringBuffer sql = new StringBuffer();
		sql.append("update tecExpert set institution=?,");
		sql.append(" major = ?,");
		sql.append(" title = ?,");
		sql.append(" sex = ?,");
		sql.append(" duty = ?,");
		sql.append(" education = ?,");
		sql.append(" searchKey =?,");
		sql.append(" attentionNum =?,");
		sql.append(" consultationNum =?,");
		sql.append(" descri =?,");
		sql.append(" attachment=?,");
		sql.append(" user_userId=?,");
		sql.append(" shop_shopId=?,");
		sql.append(" industry_industryId=?");
		sql.append(" classId=?,");
		
		sql.append(" where tecExpertId = "+tecExpert.getTecExpertId());
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setString(1, tecExpert.getInstitution());
			preStatement.setString(2, tecExpert.getMajor());
			preStatement.setString(3,tecExpert.getTitle());
			preStatement.setString(4, tecExpert.getSex());
			preStatement.setString(5, tecExpert.getDuty());
			preStatement.setString(6, tecExpert.getEducation());
			preStatement.setString(7,tecExpert.getSearchKey());
			preStatement.setInt(8, tecExpert.getAttentionNum());
			preStatement.setInt(9, tecExpert.getConsultationNum());
			preStatement.setString(10, tecExpert.getDescri());
			preStatement.setString(11, tecExpert.getAttachment());
			if(tecExpert.getUser()==null){
				preStatement.setSQLXML(12, null);
			}else{
				preStatement.setInt(12, tecExpert.getUser().getUserId());
			}
			if(tecExpert.getShop()==null){
				preStatement.setString(13,null);
			}
			else{
				preStatement.setInt(13, tecExpert.getShop().getShopId());
			}
			if(tecExpert.getIndustry()==null){
				preStatement.setString(14,null);
			}
			else{
				preStatement.setInt(14, tecExpert.getIndustry().getIndustryId());
			}
			if(tecExpert.getCity()==null){
				preStatement.setString(15,null);
			}
			else{
				preStatement.setInt(15, tecExpert.getCity().getClassId());
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
	public boolean deleteTecExpert(int id){
		String sql = "delete from tecExpert where tecExpertId = ?";
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
	public TecExpert inqueryTecExpertById(int id){
		TecExpert tecExpert =null;
		String sql = "select * from tecExpert where tecExpertId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				tecExpert = new TecExpert ();
				tecExpert .setTecExpertId(rs.getInt("tecExpertId"));
				tecExpert .setInstitution(rs.getString("institution"));
				tecExpert .setMajor(rs.getString("major"));
				tecExpert .setTitle(rs.getString("title"));
				tecExpert .setSex(rs.getString("sex"));
				tecExpert .setDuty(rs.getString("duty"));
				tecExpert .setEducation(rs.getString("education"));
				tecExpert .setAttachment(rs.getString("attachment"));
				tecExpert .setAttentionNum(rs.getInt("AttentionNum"));
				tecExpert .setConsultationNum(rs.getInt("consultationNum"));
				tecExpert .setDescri(rs.getString("descri"));				
				tecExpert .setSearchKey(rs.getString("searchKey"));
			
				
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
		return tecExpert;
	}
	public List<TecExpert> searchTecExpertByCondition(TecExpert condition,int first,int max){
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select * from tecExpert where 1 = 1");
		List param = new ArrayList();
		 List<TecExpert> result = new ArrayList<TecExpert>();
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
				TecExpert tecExpert = new TecExpert();
				tecExpert .setTecExpertId(rs.getInt("tecExpertId"));
				tecExpert .setInstitution(rs.getString("institution"));
				tecExpert .setMajor(rs.getString("major"));
				tecExpert .setTitle(rs.getString("title"));
				tecExpert .setSex(rs.getString("sex"));
				tecExpert .setDuty(rs.getString("duty"));
				tecExpert .setEducation(rs.getString("education"));
				tecExpert .setAttachment(rs.getString("attachment"));
				tecExpert .setAttentionNum(rs.getInt("AttentionNum"));
				tecExpert .setConsultationNum(rs.getInt("consultationNum"));
				tecExpert .setDescri(rs.getString("descri"));				
				tecExpert .setSearchKey(rs.getString("searchKey"));
				
				/**
				 * 省略了级联查询的方法，待后面所有的查询方法都写好之后再填上
				 */
				/*MaturityDao maturityDao = new MaturityDao();
				sciAchievement.setMaturity(maturityDao.inqueryManurityById(rs.getInt("maturityId")));*/
				
				result.add(tecExpert);
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
	
	public int  countTecExpertByCondition(TecExpert condition){
		int count=0;
		/**
		 * 做为示例，现只用descri作为查看条件
		 * 使用MYSQL数据库语句limit ?,?做分页查询，所以该项目不支持mysql以外的数据库
		 */
		StringBuilder sql = new StringBuilder("select count(*) from tecExpert where 1 = 1");
		List param = new ArrayList();
		 List<TecExpert> result = new ArrayList<TecExpert>();
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
