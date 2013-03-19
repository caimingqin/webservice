package webservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	static {
		try {
			//�������ݿ�����
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//��ȡ���ݿ����Ӷ���
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.90.22:49191;databasename=DMSDB_Z", "DMSTEST", "dmstest001");
		} catch (SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	
	//��ȡ���ִ�ж���
	public static Statement getStatement(Connection conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;	
	}
	
	//��ȡԤ�������ִ�ж���
	public static PreparedStatement getPreparedStatement(Connection conn,String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	//��ȡ���������
	public static ResultSet getResultSet(PreparedStatement pstmt) {
		ResultSet res = null;
		try {
			res = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	//��ȡ���������
	public static ResultSet getResultSet(Statement stmt, String sql) {	
		ResultSet res = null;
		try {
			res = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	//�ر���Դ����
	public static void close(Connection conn, Statement stmt, ResultSet res) {
		close(res);
		close(stmt);
		close(conn);
	}
	
	//��װ�����ر�������
	private static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
			stmt = null;
		}
	}
	
	//��װ�����رս��������	
	private static void close(ResultSet res) {	
		if (res != null) {
			try {
				res.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
			res = null;
		}
	}
	
	//��װ�����ر����ݿ����Ӷ���
	private static void close(Connection conn) {	
		try {
			if (conn != null && !conn.isClosed()) {		
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}

}
