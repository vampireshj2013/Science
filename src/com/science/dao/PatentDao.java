package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.Patent;
import com.science.util.JDBCUtil;

public class PatentDao {
	private Connection conn;
	private boolean addPatent(Patent patent){
//		String sql = "insert into "
		return true;
	}
	private boolean updatePatent(Patent patent){
		
		return true;
	}
	private boolean deletePatent(int id){
		return true;
	}
	public Patent inqueryPatentById(int id){
		Patent patent =null;
		String sql = "select * from patent where patentId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				patent = new Patent();
				patent.setPatentId(rs.getInt("patentId"));
				patent.setPatentDesc(rs.getString("patentDesc"));
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
		return patent;
	}
	public List<Patent> searchAllPatent(){
		StringBuilder sql = new StringBuilder("select * from patent");
		 List<Patent> result = new ArrayList<Patent>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				Patent patent = new Patent();
				patent.setPatentId(rs.getInt("patentId"));
				patent.setPatentDesc(rs.getString("patentDesc"));
				result.add(patent);
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
