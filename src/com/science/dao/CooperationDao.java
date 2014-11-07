package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.Cooperation;
import com.science.model.Maturity;
import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;
/**
 * 合作方式 dao层
 * @author WHJ
 *
 */
public class CooperationDao {
	private Connection conn;
	private boolean addCooperation(Cooperation cooperation){
//		String sql = "insert into "
		return true;
	}
	private boolean updateCooperation(Cooperation cooperation){
		
		return true;
	}
	private boolean deleteCooperation(int id){
		return true;
	}
	public Cooperation inqueryCooperationById(int id){
		Cooperation cooperation =null;
		String sql = "select * from cooperation where cooperationId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				cooperation = new Cooperation();
				cooperation.setCooperationId(rs.getInt("cooperationId"));
				cooperation.setCooperationDesc(rs.getString("cooperationDesc"));
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
		return cooperation;
	}
	public List<Cooperation> searchAllCooperation(){
		StringBuilder sql = new StringBuilder("select * from cooperation");
		 List<Cooperation> result = new ArrayList<Cooperation>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				Cooperation cooperation = new Cooperation();
				cooperation.setCooperationId(rs.getInt("cooperationId"));
				cooperation.setCooperationDesc(rs.getString("cooperationDesc"));
				result.add(cooperation);
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
