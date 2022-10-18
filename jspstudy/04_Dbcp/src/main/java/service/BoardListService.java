package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import domain.Board;
import repository.BoardDao;

public class BoardListService implements BoardService {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// DB에서 가져온 게시글 목록
		List<Board> boards = BoardDao.getInstance().selectAllBoards();
		
		// 게시글 목록을 jsp로 보내기 위해서 request에 저장
		request.setAttribute("boards", boards);
		
		
		// 어디로 / 어떻게
		ActionForward af = new ActionForward();
		af.setView("/board/list.jsp");
		af.setRedirect(false);	// 포워드
		return af;
	}

}
