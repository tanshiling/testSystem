package com.tsl.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 操作数据的帮助类
 */
public class DBUtils {

	private static ComboPooledDataSource dataSource = null;
	static {
		dataSource  = new ComboPooledDataSource("webDataSource");
	}

	/*
	 * 获取连接
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {

			conn = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	/*
	 * 释放连接
	 */
	public static void closeConn(Connection conn, Statement stm, ResultSet rs) throws SQLException {
		if(rs != null){
			rs.close();
		}
		if(stm != null){
			stm.close();
		}
		if (conn != null){
			conn.close();
		}
	}

}
