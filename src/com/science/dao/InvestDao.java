package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.Invest;
import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;
/**
 * 投资方式dao层
 * @author WHJ
 *
 */
public class InvestDao {
	private Connection conn;
	private boolean addInvest(Invest invest){
//		String sql = "insert into "
		return true;
	}
	private boolean updateInvest(Invest invest){
		
		return true;
	}
	private boolean deleteInvest(int id){
		return true;
	}
	public Invest inqueryInvestById(int id){
		Invest invest =null;
		String sql = "select * from invest where investId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				invest = new Invest();
				invest.setInvestId(rs.getInt("investId"));
				invest.setInvestDesc(rs.getString("investDesc"));
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
		return invest;
	}
	public List<Invest> searchAllInvest(){
		StringBuilder sql = new StringBuilder("select * from invest");
		 List<Invest> result = new ArrayList<Invest>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				Invest Invest = new Invest();
				Invest.setInvestId(rs.getInt("investId"));
				Invest.setInvestDesc(rs.getString("investDesc"));
				result.add(Invest);
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
