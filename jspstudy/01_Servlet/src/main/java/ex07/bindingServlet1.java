package ex07;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/bindingServlet1")


public class bindingServlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// stateless
		// 1. 상태 없음
		// 2. 웹 페이지 간 이동은 stateless
		// 3. 현재 페이지는 이전 페이지의 정보가 전혀 없음
		
		// Binding
		// 1. 속성(Attribute)에 정보를 저장하고 사용하는 것
		// 2. 3개 영역을 사용
		//    1) ServletContext     : 애플리케이션(프로젝트) 종료 전까지 접근해서 사용 가능
		//    2) HttpSession        : 브라우저 종료 전까지 접근해서 사용 가능
		//    3) HttpServletRequest : 응답 전까지 접근해서 사용 가능
		// 3. 사용 메소드
		//    1) getAttribute('속성')     : 해당 속성 값 가져오기 (캐스팅이 필요할 수 있음)
		//    2) setAttribute('속성', 값) : 속성에 값 저장하기    (Object 타입으로 저장)
		//    3) removeAttribute('속성')  : 해당 속성 삭제하기
		
		
		// ServletContext
		ServletContext ctx = getServletContext();  // 또는 request.getServletContext();
		ctx.setAttribute("a", 1);
		
		
		// HttpSession
		HttpSession session = request.getSession();
		session.setAttribute("b", 2);
		
		
		// HttpServletRequest
		request.setAttribute("c", 3);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}