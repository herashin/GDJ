package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import domain.Board;
import repository.Dao;

public class BoardAddService implements BoardService {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String users = request.getParameter("users");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		
		Board board = new Board();
		board.setUsers(users);
		board.setTitle(title);
		board.setContent(content);
		
		int result = Dao.getInstance().insertBoard(board);
		
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.println("<script>");
			out.println("alert('게시글이 등록되었습니다.')");
			out.println("location.href='"+ request.getContextPath()+ "/board/list.do'");
			out.println("</script>");			
		}else {
			
			out.println("<script>");
			out.println("alert('게시글 등록이 실패했습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
		out.close();
		
		
		
		return null;
	}

}
