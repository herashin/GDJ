package prac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prac03A
 */
@WebServlet("/prac03A")
public class prac03A extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String content = request.getParameter("content");
		
		String filename = new Date(System.currentTimeMillis()) + "-" + from + ".txt";
		
		
		// 파일객체
		File dir = new File(request.getServletContext().getRealPath("storage"));
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		// 파일객체
		File file = new File(dir, filename);
		
		// 문자 풀력 스트림 생성
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		// 출력
		bw.write("To." + to + "\n");
		bw.write(content + "\n");
		bw.write("From. " + from + "\n");
		bw.close();
		
		
		response.sendRedirect("/01_Servlet/Prac03B?filename=" + URLEncoder.encode(filename,"UTF-8"));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
