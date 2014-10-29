package com.jdbc.test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.junit.Test;

import com.science.util.JDBCUtil;
import com.sun.org.apache.bcel.internal.generic.Select;
public class JDBCTest  {
	@Test
	public void test1(){
		try {
			System.out.println(JDBCUtil.getMySqlConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2(){
		Connection conn = null;
		try {
			 conn = JDBCUtil.getMySqlConnection();
			Statement st = conn.createStatement();
			ResultSet rs =  st.executeQuery("Select * from t_user");
			while(rs.next()){
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("用户："+rs.getString("id")+"\t"+rs.getString("username")+"\t"+rs.getString("password"));
				System.out.println(stringBuilder.toString());
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
	}
//	@Test
//	public void test2(){
//		System.out.println("!");
//				new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						Connection connection = null;
//						try {
//							connection = JDBCUtil.getMySqlConnection();
//							System.out.println(connection);
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						finally{
//							try {
//								JDBCUtil.close(connection);
//							} catch (SQLException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//						
//					}
//				}).start();
//	}
}