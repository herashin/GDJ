package ex06_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Board;

public class SelectListMain {

	public static void main(String[] args) {
		
		Connection con = null;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//OracleDriver 로드
			Class.forName( "oracle.jdbc.OracleDriver");
			
			 String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String user = "SCOTT";
	         String password = "TIGER";
	         con = DriverManager.getConnection(url, user, password);
	         
	         // 쿼리문 작성
	         
	         String sal = "SELECT BOARD_NO, TITLE, CONTENT,HIT,CREATE_DATA FROM BOARD ORDER BY BOARD_NO DESC";
	         
	         // PrepareStament 객체생성
	         ps = con.prepareStatement(sal);
	         
	         rs = ps.executeQuery();
	         
	         // 모든 조회 결과를 저장할 ArrayList 생성
	         List<Board> boardList = new ArrayList<Board>();
	         
	         
	         // 다중 행이 조회되기 때문에 while문을 이용하여
	         // 모든 행을 순차적으로 스캔
	         while(rs.next()) {
	        	 // rs가 가리키는 행 정보를 Board 객체로 생성
	        	 Board board = new Board();
	        	 board.setBoard_no(rs.getInt("BOARD_NO"));
	        	 board.setTitle(rs.getString("TITLE"));
	        	 board.setContent(rs.getString("CONTENT"));
	        	 board.setHit(rs.getInt("HIT"));
	        	 board.setCreate_date(rs.getDate("CREATE_DATA"));
	        	 // Board 객체를 ArrayList에 저장
	        	 boardList.add(board);
	        	 
	         }
	         
	         for( int i = 0; i < boardList.size(); i++ ) {
	        	 System.out.println(boardList.get(i));
	        	 
	        	 
	         }		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rs != null)rs.close();
				if(ps != null)ps.close();
				if(con != null)con.close();
			}catch( Exception e ) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
