package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.BuyType;
import com.science.util.JDBCUtil;

public class BuyTypeDao {
	private Connection conn;

	private boolean addBuyType(BuyType buyType){
//		String sql = "insert into "
		return true;
	}
	private boolean updateBuyType(BuyType buyType){
		
		return true;
	}
	private boolean deleteBuyType(int id){
		return true;
	}
	public BuyType inqueryBuyTypeById(int id){
		BuyType buyType =null;
		String sql = "select * from buytype where buyTypeId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				buyType = new BuyType();
				buyType.setBuyTypeId(rs.getInt("buyTypeId"));
				buyType.setBuyTypeDesc(rs.getString("buyTypeDesc"));
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
		return buyType;
	}
	public void findByParent(int parentId){
		
	}
	public List<BuyType> searchAllBuyType(){
		StringBuilder sql = new StringBuilder("select * from buytype");
		 List<BuyType> result = new ArrayList<BuyType>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				BuyType buyType = new BuyType();
				buyType.setBuyTypeId(rs.getInt("buyTypeId"));
				buyType.setBuyTypeDesc(rs.getString("BuyTypeDesc"));
				result.add(buyType);
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
