package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import service.BoardAddService;
import service.BoardListService;
import service.BoardService;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String requstURI = request.getRequestURI();
		String context = request.getContextPath();
		String URIMAPPING = requstURI.substring(context.length());
		
		
		BoardService service = null;
		ActionForward af = null;
		
		switch(URIMAPPING) {
		case "/board/list.do":
			service = new BoardListService();
			break;
		case "/board/add.do" :
	         service = new BoardAddService();
	         break;
			
		case "/board/write.do":
			af = new ActionForward();
			af.setView("/board/write.jsp");
			
			af.setRedirect(false);
			break;
		}
		
	
		try {
			if(service != null) {
				af = service.execute(request, response);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
			
		
		if(af != null) {
			if(af.isRedirect()) {
				response.sendRedirect(af.getView());
			} else {
				request.getRequestDispatcher(af.getView()).forward(request, response);
			}
		}
			
		
		
	}

	
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
