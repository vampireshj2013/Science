package com.science.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.science.model.City;
import com.science.util.JDBCUtil;

public class CityDao {
	private Connection conn;

	private boolean addCity(City city){
//		String sql = "insert into "
		return true;
	}
	private boolean updateCity(City city){
		
		return true;
	}
	private boolean deleteCity(int id){
		return true;
	}
	public City inqueryCityById(int id){
		City  city =null;
		String sql = "select * from city where classId = ?";
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1,id);
			ResultSet rs = preStatement.executeQuery();
			if(rs.next()){
				city = new City();
				city.setClassId(rs.getInt("classId"));
				
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
		return city;
	}
	public void findByParent(int parentId){
		
	}
	public List<City> searchAllCity(){
		StringBuilder sql = new StringBuilder("select * from city");
		 List<City> result = new ArrayList<City>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				City city = new City();
				city.setClassId(rs.getInt("classId"));
				//City.setCityDesc(rs.getString("CityDesc"));
				result.add(city);
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
	public List<City> searchChildCityById(int id){
		StringBuilder sql = new StringBuilder("SELECT * FROM science.city where class_parent_id =?");
		 List<City> result = new ArrayList<City>();
		try {
			conn = JDBCUtil.getMySqlConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql.toString());
			preStatement.setInt(1, id);
			ResultSet rs =  preStatement.executeQuery();
			while(rs.next()){
				City city = new City();
				city.setClassId(rs.getInt("class_Id"));
				city.setClassName(rs.getString("class_name"));
				city.setClassParentId(rs.getInt("class_parent_id"));
				city.setClassType(rs.getInt("class_type"));
				result.add(city);
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
