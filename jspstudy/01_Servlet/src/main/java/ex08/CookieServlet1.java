package ex08;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet1
 */
@WebServlet("/CookieServlet1")
public class CookieServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 쿠키
		// 1. 서버가 만들어서 클라이언트 PC에 저장해 두는 정보
		// 2. 응답할 때 쿠키를 저장함
		// 3. 클라이언트 요청이 있을 때 모든 쿠키 정보를 읽어 들일 수 있음
		
		
		// 쿠키 만들기
		Cookie cookie1 = new Cookie("name","신준호");
		Cookie cookie2 = new Cookie("address",URLEncoder.encode("서울시_금천구_가산동", "UTF-8") );
		
		// 클라이언트 PC에 쿠키 저장하기
		
		cookie1.setMaxAge(60*60*24*15); // 15일
		cookie2.setMaxAge(10);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
