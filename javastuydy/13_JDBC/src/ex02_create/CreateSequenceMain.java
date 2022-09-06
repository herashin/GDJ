package ex02_create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateSequenceMain {

	public static void main(String[] args) {
		PreparedStatement ps = null;
		
		
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			String sql = "CREATE SEQUENCE BOARD_DEQ NOCACHE";
			
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			ps.execute();
			
		}catch(ClassNotFoundException e) {
			System.out.println("오라클 로드 실패");
		}catch( SQLException e ) {
			System.out.println("DB접속정보 오류");
		}
		
		
		try {
			if(ps != null)ps.close();
			if(con != null)con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}




















