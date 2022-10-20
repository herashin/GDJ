package service;

import java.util.Optional;
import java.util.OptionalLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;

public class BoardRemoveService implements BoardService {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//  요청 파라미터
		Optional<String> opt = Optional.ofNullable(request.getParameter("board_no"));
		
		int board_no = Integer.parseInt(opt.orElse("0"));
		
		
		ActionForward af = new ActionForward();
		af.setView(request.getContextPath() + "/board/list.do");
		af.setRedirect(true);		return null;
		
	}

}
