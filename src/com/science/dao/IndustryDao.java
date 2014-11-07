package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.Industry;
import com.science.model.Maturity;
import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;
/**
 * 所属行业 dao层
 * @author WHJ
 *
 */
public class IndustryDao {
	private Connection conn;

	private boolean addIndustry(Industry industry){
//		String sql = "insert into "
		return true;
	}
	private boolean updateIndustry(Industry industry){
		
		return true;
	}
	private boolean deleteIndustry(int id){
		return true;
	}
	public Industry inqueryIndustryById(int id){
		Industry industry =null;
		String sql = "select * from industry where industryId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				industry = new Industry();
				industry.setIndustryId(rs.getInt("industryId"));
				
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
		return industry;
	}
	public void findByParent(int parentId){
		
	}
	public List<Industry> searchAllIndustry(){
		StringBuilder sql = new StringBuilder("select * from Industry");
		 List<Industry> result = new ArrayList<Industry>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				Industry industry = new Industry();
				industry.setIndustryId(rs.getInt("industryId"));
				//Industry.setIndustryDesc(rs.getString("IndustryDesc"));
				result.add(industry);
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
