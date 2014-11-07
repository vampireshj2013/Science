package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.Maturity;
import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;
/**
 * 技术成熟度 dao层
 * @author WHJ
 *
 */
public class MaturityDao {
	private Connection conn;
	private boolean addMaturity(Maturity maturity){
//		String sql = "insert into "
		return true;
	}
	private boolean updateMaturity(Maturity maturity){
		
		return true;
	}
	private boolean deleteMaturity(int id){
		return true;
	}
	public Maturity inqueryMaturityById(int id){
		Maturity maturity =null;
		String sql = "select * from maturity where maturityId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				maturity = new Maturity();
				maturity.setMaturityId(rs.getInt("maturityId"));
				maturity.setMaturityDesc(rs.getString("maturityDesc"));
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
		return maturity;
	}
	public List<Maturity> searchAllMaturity(){
		StringBuilder sql = new StringBuilder("select * from maturity");
		 List<Maturity> result = new ArrayList<Maturity>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				Maturity maturity = new Maturity();
				maturity.setMaturityId(rs.getInt("maturityId"));
				maturity.setMaturityDesc(rs.getString("maturityDesc"));
				result.add(maturity);
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
