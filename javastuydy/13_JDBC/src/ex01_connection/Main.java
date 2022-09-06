package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		
		// OracleDriver 열기(메모리에 로드하기)
		// 1. oracle.jdbc.OracleDriver
		// 2. oracle.jdbc.driver.OracleDriver
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		}catch( ClassNotFoundException e ) {
			System.out.println("OracleDriver 로드 실패");
		}
		Connection con = null;
		try {
		//DriverManager로부터 Connection
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DBakek url은 달라지(Oracle XE 버전 기준)
		String user = "SCOTT";
		String password = "TIGER";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("접속 성공");
		}catch(SQLException e ) {
			System.out.println("DB접속정보 오류");
		}

		try {
			if( con != null ) con.close();
				
		}catch( SQLException e ) {
				e.printStackTrace();
				}
				
		
	}
	
	// Connection 종료
	// JDBC에서는 Connection을 닫는것이 굉장희 중요
	
	
	
	
	

}
