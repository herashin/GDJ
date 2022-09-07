package ex05_delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMain {

	public static void main(String[] args) {
		
		
			Connection con = null;
			PreparedStatement ps = null;
	       
	       try {
	          Scanner sc = new Scanner(System.in);
	          
	          // 삭제할 게시글 번호 입력 받기
	          System.out.println("삭제할 게시글 번호 >>> ");
	          int board_no = sc.nextInt();
	          sc.nextLine();
	          
	          // Connection 생성
	          Class.forName("oracle.jdbc.OracleDriver");
	          String url = "jdbc:oracle:thin:@localhost:1521:xe";
	          String user = "SCOTT";
	          String password = "TIGER";
	          con = DriverManager.getConnection(url, user, password);
	          
	          // 쿼리문 생성
	          String sql = "DELETE FROM BOARD";
	          
	          // PreparedStatement 객체 생성
	          ps = con.prepareStatement(sql);
	          
	          
	          // 쿼리문의 ?에 변수 전달하기
	          
	          // 쿼리문 실행
	          
	          // 실행 결과
	           // 삭제 성공, 삭제 실패 
	          
	          
	          
	          
	       } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	    	  try {
	    		  if(con != null) con.close();
	 	         if(ps != null) ps.close();
	    	  }catch(Exception e) {
	    		  e.printStackTrace();
	    	  }
	         // con, ps 닫기
	         
	      } 
	      

	   }
		

	

}
