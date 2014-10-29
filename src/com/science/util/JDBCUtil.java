package com.science.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JDBCUtil {
	    //数据源
	    private static ComboPooledDataSource dataSource = null;
	    static{//静态块，读取c3p0默认配置文件
	    	if(dataSource ==null){
	    		dataSource = new ComboPooledDataSource();
	    	}
	    }
	    //取得连接
	    public static Connection getMySqlConnection() throws SQLException{
	       return  dataSource.getConnection();
	    }
	    //关闭连接
	    public static void close(Connection conn) throws SQLException{
	       if(conn!=null){
	           conn.close();
	       }
	    }
}
