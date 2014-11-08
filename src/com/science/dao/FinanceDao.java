package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.Finance;
import com.science.model.SciAchievement;
import com.science.util.CommonUtil;
import com.science.util.JDBCUtil;
/**
 * 融资方式dao层
 * @author WHJ
 *
 */
public class FinanceDao {
	private Connection conn;
	private boolean addFinance(Finance finance){
//		String sql = "insert into "
		return true;
	}
	private boolean updateFinance(Finance finance){
		
		return true;
	}
	private boolean deleteFinance(int id){
		return true;
	}
	public Finance inqueryFinanceById(int id){
		Finance finance =null;
		String sql = "select * from finance where financeId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				finance = new Finance();
				finance.setFinanceId(rs.getInt("financeId"));
				finance.setFinanceDesc(rs.getString("financeDesc"));
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
		return finance;
	}
	public List<Finance> searchAllFinance(){
		StringBuilder sql = new StringBuilder("select * from finance");
		 List<Finance> result = new ArrayList<Finance>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				Finance Finance = new Finance();
				Finance.setFinanceId(rs.getInt("financeId"));
				Finance.setFinanceDesc(rs.getString("financeDesc"));
				result.add(Finance);
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
