package com.gdu.search;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiSearchBook {

	public static void main(String[] args) {
		
		String clientId = "mu_Q2zXhOXCd_VnXBq0d";
		String clientSecret = "MPp7Xl53md";
		
		
		try {
		//	검색어 입력 및 인코딩
			Scanner sc = new Scanner(System.in);
			System.out.println(" 책 이름 입력 ");
			String search = sc.next();
			String apiURL = "https://openapi.naver.com/v1/search/book?query=" + URLEncoder.encode(search, "UTF-8") ;
			
			
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			BufferedReader br = null;
			 int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			con.disconnect();
			sc.close();
			
			JSONObject obj = new JSONObject(sb.toString());
			JSONArray books = obj.getJSONArray("books");
			System.out.println(books);
			
			
			File dir = new File("C://download");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, search + ".html");
			PrintWriter out = new PrintWriter(file);
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title></title>");
			out.println("</head>");
			out.println("<body>");	
		//	파일 본문 만들기
			for(int i = 0; i < obj.length(); i ++) {
				JSONObject book = books.getJSONObject(i);
				String title = book.getString("title");
				String link = book.getString("link");
				String image = book.getString("image");
				out.print("<div>");
				
				out.print("<a href='" + link + "'>"  + title + "   </a>");
				
				
				out.print("</div>");
				
				out.print("<div>");
				
				out.print("<img src=\""+ image + "\" style='width:100px'>"  );
				
				
				out.print("</div>");
			}
			
			
			
			
			out.println("</body>");
			out.println("</html>");
			out.close();
			
		} catch(Exception e) {
			
			try {
				
				Date date = new Date(System.currentTimeMillis());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a h:mm:ss");
				String errorTime = sdf.format(date);
				
				
				File dir = new File("C://download/log");
				if(dir.exists() == false) {
					dir.mkdirs();
				}
				File file = new File(dir, "error_log.txt");
				PrintWriter out = new PrintWriter(file);
				out.println("예외메시지    " + e.getMessage());
				out.println("예외발생시간    " + errorTime);
				out.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
	
}
