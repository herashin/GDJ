package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import repository.MemberDao;

public class MemberListService implements MemberService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/json; charset=UTF-8");
		
		JSONObject obj = new JSONObject();
		obj.put("count",MemberDao.getInstance().selectAllmembersCount());
		obj.put("members",MemberDao.getInstance().selectAllMembers());
		
		
		// 응답
		PrintWriter out = response.getWriter();
		out.println(obj.toString());
		out.close();
		
		
	}
	
	
}
